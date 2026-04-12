begin transaction;
create schema project;
set search_path to project;

-- User table --
create table users (
	id_user serial primary key,             -- Serial = auto-incrémentation --
	email text not null check (
		trim(email) <> '' and
		email like '%@%.%'                  -- Email de type abc@def.ghi --
		),
	u_password text not null check (              
		char_length(u_password) >= 8 and    -- Longueur minimale de 8 caractères --
		u_password ~ '[A-Z]' and            -- Au moins une majuscule --
		u_password ~ '[0-9]' and            -- Au moins un chiffre --
		u_password ~ '[^a-zA-Z0-9]'         -- Au moins un caractère spécial --
		),
	last_name varchar(20) not null check (trim(last_name) <> ''),   -- trim(X) <> '' = non-vide --
	first_name varchar(20) not null check (trim(first_name) <> ''),
	type_expert boolean                     -- True = expert ou False = non-expert --
);

-- Products table --
create table products (
	id_product serial primary key,
	title varchar(40) not null check (trim(title) <> ''),
	created_at timestamp default current_timestamp,
	description varchar(500) not null check (trim(description) <> ''),
	state_ text not null check (state_ in ('new', 'like new', 'used', 'as is')),
	status text not null check (status in ('active', 'sold')) default 'active',
	category text not null check (category in ('cars', 'real estate', 'pets', 'services')),
	wanted_price numeric(10,2) not null check (wanted_price > 0),  -- Prix à 2 décimales --
	announcer_id int not null,
	foreign key (announcer_id) references users(id_user) on delete cascade
);

-- Offers table --
create table offers (
	id_offer serial primary key,
	price numeric(10,2) not null check (price > 0),
	created_at timestamp default current_timestamp,
	status text not null check (status in ('accepted', 'declined', 'pending')) default 'pending',
	msg varchar(200) check(msg is null or trim(msg) <> ''),
	user_id int not null,
	foreign key (user_id) references users(id_user) on delete cascade,
	product_id int not null,
	foreign key (product_id) references products(id_product) on delete cascade,
	constraint unique_offer unique (user_id, product_id, price)
);

-- Estimations table --
create table estimations (
	id_est serial primary key,
	estimate numeric(10,2) not null check (estimate > 0),
	created_at timestamp default current_timestamp,
	decision boolean,                                   -- Décision = YES (true) ou NO (false) --
	expert_id int not null,
	foreign key (expert_id) references users(id_user) on delete cascade,
	product_id int not null,
	foreign key (product_id) references products(id_product) on delete cascade,
	constraint unique_estimation unique (expert_id, product_id)
);

-- Indexes --
create unique index one_accepted_offer_per_product    -- Une seule offre acceptée par produit --
on offers(product_id) 
where status = 'accepted';

create unique index unique_email_lower   -- Emails uniques sans prendre compte de la casse --
on users (lower(email));

commit;
