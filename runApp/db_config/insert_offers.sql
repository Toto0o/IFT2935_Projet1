SET search_path TO project;

WITH candidate_pairs AS (
    SELECT
        u.id_user AS user_id,
        p.id_product AS product_id
    FROM users u
             CROSS JOIN products p
    WHERE u.type_expert = false
),
     sampled_pairs AS (
         SELECT *
         FROM candidate_pairs
         ORDER BY random()
    LIMIT 100
    ),
    base_offers AS (
SELECT
    sp.user_id,
    sp.product_id,
    (random() * 20000 + 50)::int AS price,
    'Offer ' || row_number() OVER () AS msg
FROM sampled_pairs sp
    )
INSERT INTO offers (price, msg, user_id, product_id)
SELECT
    price,
    msg,
    user_id,
    product_id
FROM base_offers bo
WHERE NOT EXISTS (
    SELECT 1
    FROM offers o
    WHERE o.user_id = bo.user_id
      AND o.product_id = bo.product_id
      AND o.price = bo.price
)
    ON CONFLICT (user_id, product_id, price) DO NOTHING;

SELECT * from offers;
