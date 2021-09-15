create table products
(
    id          bigserial primary key,
    title       varchar(255),
    price       numeric(8,2) not null,
);
insert into products (title, price)
values
('Milk', 85),
('Bread', 25),
('Cheese', 450),
('Coffee',500),
('Potatoes',20),
('Carrot',30),
('Onion',50),
('Apples',120),
('Lemon',300),
('Honey',600),
('Eggs',65),
('Fish',300);
