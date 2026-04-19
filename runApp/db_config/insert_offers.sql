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
    CASE
    WHEN random() < 0.33 THEN 'pending'
    WHEN random() < 0.66 THEN 'accepted'
    ELSE 'declined'
    END AS status,
    'Offer ' || row_number() OVER () AS msg
FROM sampled_pairs sp
    ),
    ranked AS (
SELECT
    bo.*,
    row_number() OVER (
    PARTITION BY bo.product_id
    ORDER BY (bo.status = 'accepted') DESC, random()
    ) AS rn_per_product
FROM base_offers bo
    )
INSERT INTO offers (price, status, msg, user_id, product_id)
SELECT
    price,
    CASE
        WHEN status = 'accepted' AND rn_per_product > 1 THEN 'pending'
        ELSE status
        END,
    msg,
    user_id,
    product_id
FROM ranked
WHERE NOT EXISTS (
    SELECT 1
    FROM offers o
    WHERE o.user_id = ranked.user_id
      AND o.product_id = ranked.product_id
      AND o.price = ranked.price
)
    ON CONFLICT (user_id, product_id, price) DO NOTHING;

SELECT * from offers;