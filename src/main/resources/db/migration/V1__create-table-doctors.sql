create table doctors(

    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null unique,
    crm varchar(6) not null unique,
    expertise varchar(100) not null,
    street varchar(100) not null,
    district varchar(100) not null,
    zip_code varchar(9) not null,
    number varchar(20),
    state char(2) not null,
    city varchar(100) not null,

    primary key(id)

);