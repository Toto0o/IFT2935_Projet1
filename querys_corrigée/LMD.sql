-- Complex queries --

-- 1 --
SELECT u.email, p.title, o.price, e.estimate
                FROM project.users u
                         JOIN project.offers o ON u.id_user=o.user_id
                         JOIN project.products p ON p.id_product=o.product_id
                         JOIN project.estimations e ON e.product_id=p.id_product;

-- 2 --
SELECT u.email, p.title, o.price
                FROM users u
                         JOIN offers o ON u.id_user=o.user_id
                         JOIN products p ON p.id_product=o.product_id
                         JOIN estimations e ON e.product_id=p.id_product
                WHERE o.price < e.estimate;

-- 3 --
SELECT p.title, COUNT(o.id_offer) AS count
                FROM products p
                         JOIN offers o ON p.id_product=o.product_id
                GROUP BY p.title;

-- 4 -- 
SELECT u.email, AVG(o.price) AS average
                FROM users u
                         JOIN offers o ON u.id_user=o.user_id 
                GROUP BY u.email;

-- 5 --
SELECT p.category, COUNT(p.id_product) AS count, AVG(o.price) AS average
                FROM products p
                         JOIN offers o ON p.id_product=o.product_id
                         JOIN users u ON u.id_user=o.user_id
                         JOIN estimations e ON e.product_id=p.id_product
                GROUP BY p.category;
-- 6 --
SELECT u.first_name, p.title, o.price, e.estimate
                FROM users u
                         JOIN offers o ON u.id_user = o.user_id
                         JOIN products p ON p.id_product = o.product_id
                         JOIN estimations e ON e.product_id = p.id_product;

-- 6 --
SELECT p.title, COUNT(e.id_est) AS nb_estimations, AVG(e.estimate) AS moyenne
                FROM products p
                         JOIN estimations e ON p.id_product = e.product_id
                GROUP BY p.title;

-- 7 --
SELECT u.first_name, p.title, o.price, e.estimate
                FROM users u
                         JOIN offers o ON u.id_user = o.user_id
                         JOIN products p ON p.id_product = o.product_id
                         JOIN estimations e ON e.product_id = p.id_product
                WHERE e.decision = TRUE

-- Simple querys --

-- 1 --
SELECT * FROM products;

-- 2 --
SELECT * FROM products WHERE announcer_id=?;

-- 3 --
INSERT INTO products (title, description, state_, status, category, wanted_price, announcer_id) VALUES (?,?,?,?,?,?,?);

-- 4 --
SELECT * FROM users WHERE email = ?;

--5 --
INSERT INTO users (email, u_password, last_name, first_name, type_expert) VALUES (?, ?, ?, ?, ?);

-- 6 --
INSERT INTO estimations (estimate, decision, expert_id, product_id) VALUES (?,?,?,?);

-- 7 --
SELECT id_user FROM users where type_expert = ? ORDER BY RANDOM() LIMIT 1;

-- 8 --
INSERT INTO offers (price, msg, status, user_id, product_id) VALUES (?,?,?,?,?);

-- 9 --
SELECT * FROM offers WHERE user_id=?;



