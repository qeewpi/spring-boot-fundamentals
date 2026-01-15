create table profiles
(
    id             bigint primary key,
    bio            TEXT,
    phone_number   varchar(15),
    date_of_birth  DATE,
    loyalty_points int UNSIGNED default 0,
    foreign key (id) references users(id)
);