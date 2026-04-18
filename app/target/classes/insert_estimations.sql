SET search_path TO project;

INSERT INTO estimations (estimate, decision, expert_id, product_id)
SELECT
    (random() * 20000 + 50)::int AS estimate,

    CASE
        WHEN random() < 0.33 THEN TRUE
        WHEN random() < 0.66 THEN FALSE
        ELSE NULL
    END AS decision,
    ep.id_user AS expert_id,
    ep.id_product AS product_id
FROM (
    SELECT u.id_user, p.id_product
    FROM users u
    CROSS JOIN products p
    WHERE u.type_expert = true
    ORDER BY random()
    LIMIT 100
     ) AS ep;
SELECT * from estimations;

