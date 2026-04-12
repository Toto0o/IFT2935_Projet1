-- USERS (sample data)
INSERT INTO users (email, u_password, last_name, first_name, type) VALUES
                                                                       ('lucas.martin@gmail.com','Pass6@A','Martin','Lucas','acheteur'),
                                                                       ('emma.bernard@yahoo.com','Pass7#B','Bernard','Emma','annonceur'),
                                                                       ('noah.thomas@hotmail.com','Pass8$C','Thomas','Noah','expert'),
                                                                       ('olivia.petit@gmail.com','Pass9!D','Petit','Olivia','acheteur'),
                                                                       ('liam.robert@gmail.com','Pass10@E','Robert','Liam','annonceur'),

                                                                       ('ava.richard@yahoo.com','Pass11#F','Richard','Ava','expert'),
                                                                       ('ethan.durand@gmail.com','Pass12$G','Durand','Ethan','acheteur'),
                                                                       ('mia.dubois@hotmail.com','Pass13!H','Dubois','Mia','annonceur'),
                                                                       ('logan.moreau@gmail.com','Pass14@I','Moreau','Logan','expert'),
                                                                       ('chloe.laurent@yahoo.com','Pass15#J','Laurent','Chloe','acheteur'),

                                                                       ('nathan.simon@gmail.com','Pass16$K','Simon','Nathan','annonceur'),
                                                                       ('zoe.michel@hotmail.com','Pass17!L','Michel','Zoe','expert'),
                                                                       ('leo.lefebvre@gmail.com','Pass18@M','Lefebvre','Leo','acheteur'),
                                                                       ('lina.garcia@yahoo.com','Pass19#N','Garcia','Lina','annonceur'),
                                                                       ('hugo.david@gmail.com','Pass20$O','David','Hugo','expert'),

                                                                       ('ines.bertrand@hotmail.com','Pass21!P','Bertrand','Ines','acheteur'),
                                                                       ('adam.roux@gmail.com','Pass22@Q','Roux','Adam','annonceur'),
                                                                       ('sarah.vincent@yahoo.com','Pass23#R','Vincent','Sarah','expert'),
                                                                       ('tom.fournier@gmail.com','Pass24$S','Fournier','Tom','acheteur'),
                                                                       ('eva.morel@hotmail.com','Pass25!T','Morel','Eva','annonceur'),

                                                                       ('louis.girard@gmail.com','Pass26@U','Girard','Louis','expert'),
                                                                       ('jade.andre@yahoo.com','Pass27#V','Andre','Jade','acheteur'),
                                                                       ('noe.mercier@gmail.com','Pass28$W','Mercier','Noe','annonceur'),
                                                                       ('lea.dupont@hotmail.com','Pass29!X','Dupont','Lea','expert'),
                                                                       ('mathis.lambert@gmail.com','Pass30@Y','Lambert','Mathis','acheteur'),

                                                                       ('anna.bonnet@yahoo.com','Pass31#Z','Bonnet','Anna','annonceur'),
                                                                       ('theo.francois@gmail.com','Pass32$A','Francois','Theo','expert'),
                                                                       ('lola.martinez@hotmail.com','Pass33!B','Martinez','Lola','acheteur'),
                                                                       ('axel.legrand@gmail.com','Pass34@C','Legrand','Axel','annonceur'),
                                                                       ('clara.garnier@yahoo.com','Pass35#D','Garnier','Clara','expert'),

                                                                       ('eliott.faure@gmail.com','Pass36$E','Faure','Eliott','acheteur'),
                                                                       ('camille.renaud@hotmail.com','Pass37!F','Renaud','Camille','annonceur'),
                                                                       ('gabriel.barbier@gmail.com','Pass38@G','Barbier','Gabriel','expert'),
                                                                       ('manon.arnaud@yahoo.com','Pass39#H','Arnaud','Manon','acheteur'),
                                                                       ('arthur.colin@gmail.com','Pass40$I','Colin','Arthur','annonceur'),

                                                                       ('alice.marchand@hotmail.com','Pass41!J','Marchand','Alice','expert'),
                                                                       ('yanis.dasilva@gmail.com','Pass42@K','DaSilva','Yanis','acheteur'),
                                                                       ('elise.noel@yahoo.com','Pass43#L','Noel','Elise','annonceur'),
                                                                       ('julien.perrin@gmail.com','Pass44$M','Perrin','Julien','expert'),
                                                                       ('nina.rolland@hotmail.com','Pass45!N','Rolland','Nina','acheteur'),

                                                                       ('maxime.chevalier@gmail.com','Pass46@O','Chevalier','Maxime','annonceur'),
                                                                       ('amelie.blanc@yahoo.com','Pass47#P','Blanc','Amelie','expert'),
                                                                       ('paul.guerin@gmail.com','Pass48$Q','Guerin','Paul','acheteur'),
                                                                       ('lucie.muller@hotmail.com','Pass49!R','Muller','Lucie','annonceur'),
                                                                       ('simon.henry@gmail.com','Pass50@S','Henry','Simon','expert'),

                                                                       ('eva.rousseau@yahoo.com','Pass51#T','Rousseau','Eva','acheteur'),
                                                                       ('hugo.adam@gmail.com','Pass52$U','Adam','Hugo','annonceur'),
                                                                       ('jules.paris@hotmail.com','Pass53!V','Paris','Jules','expert'),
                                                                       ('lena.dumont@gmail.com','Pass54@W','Dumont','Lena','acheteur'),
                                                                       ('noah.raymond@yahoo.com','Pass55#X','Raymond','Noah','annonceur');

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
SELECT * FROM users WHERE type='BUYER';
SELECT * FROM products WHERE price>500;
SELECT * FROM offers WHERE price<300;
SELECT * FROM estimates WHERE estimate>400;
SELECT * FROM products WHERE category='ELECTRONICS';

-- Complex queries
SELECT u.username, p.title, o.price, e.estimate
FROM users u
         JOIN offers o ON u.id=o.buyerId
         JOIN products p ON p.id=o.productId
         JOIN estimates e ON e.productId=p.id;

SELECT p.title, COUNT(o.id)
FROM products p
         JOIN offers o ON p.id=o.productId
GROUP BY p.title;

SELECT u.username, AVG(o.price)
FROM users u
         JOIN offers o ON u.id=o.buyerId
GROUP BY u.username;

SELECT u.username, p.titre, o.price
FROM users u
         JOIN offers o ON u.id=o.buyerId
         JOIN products p ON p.id=o.productId
         JOIN estimates e ON e.productId=p.id
WHERE o.price < e.estimate;

SELECT p.category, COUNT(p.id), AVG(o.price)
FROM products p
         JOIN offers o ON p.id=o.productId
         JOIN users u ON u.id=o.buyerId
         JOIN estimates e ON e.productId=p.id
GROUP BY p.category;

SELECT u.first_name, p.title, o.price, e.estimate
FROM users u
         JOIN offers o ON u.id_user = o.user_id
         JOIN products p ON p.id_product = o.product_id
         JOIN estimations e ON e.product_id = p.id_product;

SELECT p.title, COUNT(e.id_est) AS nb_estimations, AVG(e.estimate) AS moyenne
FROM products p
         JOIN estimations e ON p.id_product = e.product_id
GROUP BY p.title;

SELECT u.first_name, p.title, o.price, e.estimate
FROM users u
         JOIN offers o ON u.id_user = o.user_id
         JOIN products p ON p.id_product = o.product_id
         JOIN estimations e ON e.product_id = p.id_product
WHERE e.decision = TRUE;
