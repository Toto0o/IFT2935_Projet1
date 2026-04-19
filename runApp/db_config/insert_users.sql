SET search_path TO project;
INSERT INTO users (email, u_password, last_name, first_name, type_expert) VALUES
                                                                              ('lucas.martin@gmail.com','Pass6@A1','Martin','Lucas',FALSE),
                                                                              ('emma.bernard@yahoo.com','Pass7#B1','Bernard','Emma',FALSE),
                                                                              ('noah.thomas@hotmail.com','Pass8$C1','Thomas','Noah',TRUE),
                                                                              ('olivia.petit@gmail.com','Pass9!D1','Petit','Olivia',FALSE),
                                                                              ('liam.robert@gmail.com','Pass10@E1','Robert','Liam',FALSE),

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
SELECT * from users;