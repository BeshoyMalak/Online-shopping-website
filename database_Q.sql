create database [online_shopping]
go

use online_shopping
go

create table customer(
name varchar(50),
email nvarchar(50) not null,--the username
city varchar(50) default null,
country varchar(20) default null,
primary key (email)
)


create table product(
id int identity (1,1),
name varchar,
hprice double,--highest price
lprice double,--lowest price
ptype varchar(12),--type of the product => normal, online
exploration int default 0,
extra nvarchar(100) default null,
brand varchar(50),
primary key (id)
)

create table store(
owner_id varchar(50),
sname varchar(50),
stype varchar(12),
sadress varchar(50) default null,
foreign key(owner_id) references customer,
primary key (owner_id, sname)
)

create table store_prod(
pr_id int,
sname varchar(50),
price double default 0,
foreign key(owner_id) references customer,
primary key (owner_id, sname)
)

create table buyed_pr(
pr_id int,
buyer_id int,
quantity int default 1,
foreign key(pr_id) references product,
foreign key(buyer_id) references customer,
primary key(pr_id,buyer_id)
)