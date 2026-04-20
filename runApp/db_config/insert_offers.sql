SET search_path TO project;

WITH product_users AS (
    SELECT
        p.id_product,
        u.id_user
    FROM products p
    JOIN users u ON u.type_expert = false
),
sampled AS (
    SELECT DISTINCT ON (id_product)
        id_product,
        id_user
    FROM product_users
    ORDER BY id_product, random()
),
offers_per_product AS (
    SELECT
        s.id_product,
        s.id_user,
        gs AS offer_num
    FROM sampled s
    CROSS JOIN generate_series(1,3) AS gs
),
base_offers AS (
    SELECT
        opp.id_user,
        opp.id_product,
        (random() * 20000 + 50)::int AS price,
        'Offer ' || row_number() OVER () AS msg
    FROM offers_per_product opp
)
INSERT INTO offers (price, msg, user_id, product_id)
SELECT
    bo.price,
    bo.msg,
    bo.id_user,
    bo.id_product
FROM base_offers bo
ON CONFLICT (user_id, product_id, price) DO NOTHING;

SELECT * FROM offers;
