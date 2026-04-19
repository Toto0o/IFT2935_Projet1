SET search_path TO project;
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
                                                                                                    ('Curtains','Set','new','active','furniture',60,50),

                                                                                                    ('Watch Fossil','Classic','used','active','fashion',180,50),
                                                                                                    ('Sneakers Puma','Comfort','new','active','fashion',110,50),
                                                                                                    ('Jacket North Face','Warm','used','active','fashion',200,50),
                                                                                                    ('Backpack Nike','Sport','new','active','fashion',70,50),
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
SELECT * FROM products;