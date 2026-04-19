-- USERS (sample data)
INSERT INTO users (email, u_password, last_name, first_name, type_expert) VALUES
                                                                              ('lucas.martin@gmail.com','Pass6@A','Martin','Lucas',FALSE),
                                                                              ('emma.bernard@yahoo.com','Pass7#B','Bernard','Emma',FALSE),
                                                                              ('noah.thomas@hotmail.com','Pass8$C','Thomas','Noah',TRUE),
                                                                              ('olivia.petit@gmail.com','Pass9!D','Petit','Olivia',FALSE),
                                                                              ('liam.robert@gmail.com','Pass10@E','Robert','Liam',FALSE),

                                                                              ('ava.richard@yahoo.com','Pass11#F','Richard','Ava',TRUE),
                                                                              ('ethan.durand@gmail.com','Pass12$G','Durand','Ethan',FALSE),
                                                                              ('mia.dubois@hotmail.com','Pass13!H','Dubois','Mia',FALSE),
                                                                              ('logan.moreau@gmail.com','Pass14@I','Moreau','Logan',TRUE),
                                                                              ('chloe.laurent@yahoo.com','Pass15#J','Laurent','Chloe',FALSE),

                                                                              ('nathan.simon@gmail.com','Pass16$K','Simon','Nathan',FALSE),
                                                                              ('zoe.michel@hotmail.com','Pass17!L','Michel','Zoe',TRUE),
                                                                              ('leo.lefebvre@gmail.com','Pass18@M','Lefebvre','Leo',FALSE),
                                                                              ('lina.garcia@yahoo.com','Pass19#N','Garcia','Lina',FALSE),
                                                                              ('hugo.david@gmail.com','Pass20$O','David','Hugo',TRUE),

                                                                              ('ines.bertrand@hotmail.com','Pass21!P','Bertrand','Ines',FALSE),
                                                                              ('adam.roux@gmail.com','Pass22@Q','Roux','Adam',FALSE),
                                                                              ('sarah.vincent@yahoo.com','Pass23#R','Vincent','Sarah',TRUE),
                                                                              ('tom.fournier@gmail.com','Pass24$S','Fournier','Tom',FALSE),
                                                                              ('eva.morel@hotmail.com','Pass25!T','Morel','Eva',FALSE),

                                                                              ('louis.girard@gmail.com','Pass26@U','Girard','Louis',TRUE),
                                                                              ('jade.andre@yahoo.com','Pass27#V','Andre','Jade',FALSE),
                                                                              ('noe.mercier@gmail.com','Pass28$W','Mercier','Noe',FALSE),
                                                                              ('lea.dupont@hotmail.com','Pass29!X','Dupont','Lea',TRUE),
                                                                              ('mathis.lambert@gmail.com','Pass30@Y','Lambert','Mathis',FALSE),

                                                                              ('anna.bonnet@yahoo.com','Pass31#Z','Bonnet','Anna',FALSE),
                                                                              ('theo.francois@gmail.com','Pass32$A','Francois','Theo',TRUE),
                                                                              ('lola.martinez@hotmail.com','Pass33!B','Martinez','Lola',FALSE),
                                                                              ('axel.legrand@gmail.com','Pass34@C','Legrand','Axel',FALSE),
                                                                              ('clara.garnier@yahoo.com','Pass35#D','Garnier','Clara',TRUE),

                                                                              ('eliott.faure@gmail.com','Pass36$E','Faure','Eliott',FALSE),
                                                                              ('camille.renaud@hotmail.com','Pass37!F','Renaud','Camille',FALSE),
                                                                              ('gabriel.barbier@gmail.com','Pass38@G','Barbier','Gabriel',TRUE),
                                                                              ('manon.arnaud@yahoo.com','Pass39#H','Arnaud','Manon',FALSE),
                                                                              ('arthur.colin@gmail.com','Pass40$I','Colin','Arthur',FALSE),

                                                                              ('alice.marchand@hotmail.com','Pass41!J','Marchand','Alice',TRUE),
                                                                              ('yanis.dasilva@gmail.com','Pass42@K','DaSilva','Yanis',FALSE),
                                                                              ('elise.noel@yahoo.com','Pass43#L','Noel','Elise',FALSE),
                                                                              ('julien.perrin@gmail.com','Pass44$M','Perrin','Julien',TRUE),
                                                                              ('nina.rolland@hotmail.com','Pass45!N','Rolland','Nina',FALSE),

                                                                              ('maxime.chevalier@gmail.com','Pass46@O','Chevalier','Maxime',FALSE),
                                                                              ('amelie.blanc@yahoo.com','Pass47#P','Blanc','Amelie',TRUE),
                                                                              ('paul.guerin@gmail.com','Pass48$Q','Guerin','Paul',FALSE),
                                                                              ('lucie.muller@hotmail.com','Pass49!R','Muller','Lucie',FALSE),
                                                                              ('simon.henry@gmail.com','Pass50@S','Henry','Simon',TRUE),

                                                                              ('eva.rousseau@yahoo.com','Pass51#T','Rousseau','Eva',FALSE),
                                                                              ('hugo.adam@gmail.com','Pass52$U','Adam','Hugo',FALSE),
                                                                              ('jules.paris@hotmail.com','Pass53!V','Paris','Jules',TRUE),
                                                                              ('lena.dumont@gmail.com','Pass54@W','Dumont','Lena',FALSE),
                                                                              ('noah.raymond@yahoo.com','Pass55#X','Raymond','Noah',FALSE);
-- PRODUCTS
INSERT INTO products (title, description, state_, status, category, wanted_price, announcer_id) VALUES
                                                                                                    ('Toyota Corolla','Good car','used','active','cars',8000,2),
                                                                                                    ('Apartment Downtown','Nice apartment','like new','active','real estate',120000,2),
                                                                                                    ('Dog Labrador','Friendly dog','new','active','pets',500,5),
                                                                                                    ('iPhone 11','Good condition','used','active','electronics',400,2),
                                                                                                    ('iPhone 12','Very good','used','active','electronics',500,3),
                                                                                                    ('Samsung Galaxy S21','Like new','like new','active','electronics',600,4),
                                                                                                    ('MacBook Pro','Excellent','used','active','electronics',1200,5),
                                                                                                    ('Dell Laptop','Working well','used','active','electronics',700,6),

                                                                                                    ('Gaming PC','High performance','new','active','electronics',1500,7),
                                                                                                    ('Sony Headphones','Noise cancelling','new','active','electronics',250,8),
                                                                                                    ('iPad Air','Great tablet','like new','active','electronics',650,9),
                                                                                                    ('Apple Watch','Series 6','used','active','electronics',300,10),
                                                                                                    ('Bluetooth Speaker','Loud sound','new','active','electronics',120,11),

                                                                                                    ('Office Chair','Comfortable','used','active','furniture',150,12),
                                                                                                    ('Dining Table','Wood table','used','active','furniture',400,13),
                                                                                                    ('Sofa','3 seats','used','active','furniture',600,14),
                                                                                                    ('Bed Frame','Queen size','new','active','furniture',350,15),
                                                                                                    ('Wardrobe','Large','used','active','furniture',500,16),

                                                                                                    ('Nike Shoes','Size 10','used','active','fashion',100,17),
                                                                                                    ('Adidas Jacket','Winter','like new','active','fashion',120,18),
                                                                                                    ('Gucci Bag','Luxury','used','active','fashion',800,19),
                                                                                                    ('Zara Dress','New','new','active','fashion',70,20),
                                                                                                    ('Levis Jeans','Blue','used','active','fashion',60,21),

                                                                                                    ('Toyota Corolla','Reliable car','used','active','cars',8000,22),
                                                                                                    ('Honda Civic','Good condition','used','active','cars',9000,23),
                                                                                                    ('Ford Focus','Clean','used','active','cars',7500,24),
                                                                                                    ('BMW 3 Series','Luxury','used','active','cars',15000,25),
                                                                                                    ('Audi A4','Premium','used','active','cars',18000,26),

                                                                                                    ('Mountain Bike','Good bike','used','active','sports',300,27),
                                                                                                    ('Tennis Racket','Lightweight','new','active','sports',120,28),
                                                                                                    ('Football','Size 5','new','active','sports',30,29),
                                                                                                    ('Basketball Shoes','Comfort','used','active','sports',90,30),
                                                                                                    ('Gym Equipment','Full set','used','active','sports',500,31),

                                                                                                    ('Dog Labrador','Friendly','new','active','pets',600,32),
                                                                                                    ('Cat Persian','Calm','new','active','pets',400,33),
                                                                                                    ('Bird Parrot','Talking','used','active','pets',300,34),
                                                                                                    ('Fish Tank','Complete','new','active','pets',200,35),
                                                                                                    ('Rabbit','Cute','new','active','pets',150,36),

                                                                                                    ('Apartment Downtown','2 rooms','used','active','real estate',120000,37),
                                                                                                    ('House Suburbs','Family home','used','active','real estate',250000,38),
                                                                                                    ('Studio','Small','used','active','real estate',80000,39),
                                                                                                    ('Villa','Luxury','new','active','real estate',500000,40),
                                                                                                    ('Land','Empty','new','active','real estate',60000,41),

                                                                                                    ('Camera Canon','HD','used','active','electronics',450,42),
                                                                                                    ('GoPro','Action cam','new','active','electronics',300,43),
                                                                                                    ('Printer HP','Working','used','active','electronics',80,44),
                                                                                                    ('Monitor LG','27 inch','like new','active','electronics',200,45),
                                                                                                    ('Keyboard RGB','Gaming','new','active','electronics',90,46),

                                                                                                    ('Table Lamp','Modern','new','active','furniture',40,47),
                                                                                                    ('Bookshelf','Wood','used','active','furniture',120,48),
                                                                                                    ('Carpet','Large','new','active','furniture',150,49),
                                                                                                    ('Desk','Office','used','active','furniture',200,50),
                                                                                                    ('Curtains','Set','new','active','furniture',60,51),

                                                                                                    ('Watch Fossil','Classic','used','active','fashion',180,52),
                                                                                                    ('Sneakers Puma','Comfort','new','active','fashion',110,53),
                                                                                                    ('Jacket North Face','Warm','used','active','fashion',200,54),
                                                                                                    ('Backpack Nike','Sport','new','active','fashion',70,55),
                                                                                                    ('Hat Adidas','Cap','new','active','fashion',30,2),

                                                                                                    ('Motorbike Yamaha','Fast','used','active','cars',5000,3),
                                                                                                    ('Scooter','City','used','active','cars',1500,4),
                                                                                                    ('Truck','Heavy','used','active','cars',20000,5),
                                                                                                    ('Electric Car','Eco','new','active','cars',30000,6),
                                                                                                    ('Van','Family','used','active','cars',12000,7),

                                                                                                    ('Yoga Mat','Fitness','new','active','sports',25,8),
                                                                                                    ('Dumbbells','Set','used','active','sports',150,9),
                                                                                                    ('Treadmill','Home gym','used','active','sports',700,10),
                                                                                                    ('Helmet','Bike','new','active','sports',60,11),
                                                                                                    ('Skateboard','Street','used','active','sports',80,12),

                                                                                                    ('Dog Food Pack','Large','new','active','pets',50,13),
                                                                                                    ('Cat Tree','Play','new','active','pets',120,14),
                                                                                                    ('Aquarium','Glass','used','active','pets',180,15),
                                                                                                    ('Bird Cage','Metal','new','active','pets',90,16),
                                                                                                    ('Pet Bed','Soft','new','active','pets',40,17);
-- ESTIMATES
INSERT INTO estimations (estimate, decision, expert_id, product_id)
SELECT
    (random() * 20000 + 50)::int AS estimate,

    CASE
        WHEN random() < 0.33 THEN TRUE
        WHEN random() < 0.66 THEN FALSE
        ELSE NULL
        END AS decision,

    -- choisir un expert (ids qui sont experts dans ta table users)
    (SELECT id_user FROM users WHERE type = 'expert' ORDER BY random() LIMIT 1) AS expert_id,

    -- choisir un produit existant
    (SELECT id_product FROM products ORDER BY random() LIMIT 1) AS product_id

FROM generate_series(1, 100);

-- OFFERS
INSERT INTO offers (price, status, msg, user_id, product_id) VALUES
SELECT
    (random() * 20000 + 50)::int AS price,

    CASE
        WHEN random() < 0.33 THEN 'pending'
        WHEN random() < 0.66 THEN 'accepted'
        ELSE 'rejected'
        END AS status,

    'Offer ' || gs AS msg,

    -- choisir un acheteur (pas expert)
    (SELECT id_user
     FROM users
     WHERE type = 'acheteur'
     ORDER BY random()
                      LIMIT 1) AS user_id,

    -- choisir un produit existant
    (SELECT id_product
     FROM products
     ORDER BY random()
     LIMIT 1) AS product_id

FROM generate_series(1, 100) AS gs;

-- =========================
-- QUERIES
-- =========================

-- Simple queries

set search_path to project;

-- affiche les produits dont le prix demandé est supérieur à 500.
SELECT * FROM products WHERE wanted_price>500;
-- affiche les offres avec un prix inférieur à 300.
SELECT * FROM offers WHERE price<300;
-- affiche les estimations supérieures à 400.
SELECT * FROM estimations WHERE estimate>400;
-- affiche les produits dans la catégorie électronique.
SELECT * FROM products WHERE category='ELECTRONICS';

-- Complex queries

-- affiche pour chque offre: l'utilisateur, le produit, le prix et l'estimation
SELECT u.first_name, u.last_name, p.title, o.price, e.estimate
FROM users u
         JOIN offers o ON u.id_user = o.user_id
         JOIN products p ON p.id_product = o.product_id
         JOIN estimations e ON e.product_id = p.id_product;

-- nombre d'offres par produit
SELECT p.title, COUNT(o.id_offer)
FROM products p
         JOIN offers o ON p.id_product=o.product_id
GROUP BY p.title;

-- Prix moyen des offres faites par chaque utilisateur.
SELECT u.first_name, u.last_name, AVG(o.price) AS avg_offer
FROM users u
         JOIN offers o ON u.id_user = o.user_id
GROUP BY u.first_name, u.last_name;

-- Affiche les offres qui sont inférieures à l’estimation de l’expert.
SELECT u.first_name, p.title, o.price, e.estimate
FROM users u
         JOIN offers o ON u.id_user = o.user_id
         JOIN products p ON p.id_product = o.product_id
         JOIN estimations e ON e.product_id = p.id_product
WHERE o.price < e.estimate;

-- affiche pour chaque catégorie le nombre de produits et le prix moyen des offres
SELECT p.category, COUNT(p.id_product) AS total_products, AVG(o.price) AS avg_price
FROM products p
         JOIN offers o ON p.id_product = o.product_id
         JOIN users u ON u.id_user = o.user_id
         JOIN estimations e ON e.product_id = p.id_product
GROUP BY p.category;

--Nombre et moyenne des estimations par produit
SELECT p.title, COUNT(e.id_est) AS nb_estimations, AVG(e.estimate) AS moyenne
FROM products p
         JOIN estimations e ON p.id_product = e.product_id
GROUP BY p.title;

--Affiche les produits avec des estimations acceptées par les experts.
SELECT u.first_name, p.title, o.price, e.estimate
FROM users u
         JOIN offers o ON u.id_user = o.user_id
         JOIN products p ON p.id_product = o.product_id
         JOIN estimations e ON e.product_id = p.id_product
WHERE e.decision = TRUE;

-- affiche pour chaque utilisateur : le nombre d'offre faites et l'estimation moyenne des produits sur lesquels il a fait des offres
SELECT u.first_name, u.last_name, COUNT(o.id_offer) AS nb_offres, AVG(e.estimate) AS avg_estimate
FROM users u
         JOIN offers o ON u.id_user = o.user_id
         JOIN products p ON p.id_product = o.product_id
         JOIN estimations e ON e.product_id = p.id_product
GROUP BY u.first_name, u.last_name;
