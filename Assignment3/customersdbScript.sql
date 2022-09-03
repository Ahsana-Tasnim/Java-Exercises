CREATE database customersdb;

use customersdb;

create table Customer
(
	id int not null,
    customerName varchar(20) not null,
    gender varchar(2) not null,
    age int(20) not null,
    primary key (id)
);

insert into Customer values (1,'John', 'M', 29);
insert into Customer values (2,'Jess', 'M', 20);
insert into Customer values (3,'Vini', 'M', 25);
insert into Customer values (4,'Saku', 'M', 18);
insert into Customer values (5,'Mahfuz', 'M', 40);
insert into Customer values (6,'Tanvir', 'M', 25);
insert into Customer values (7,'Sadi', 'M', 39);
insert into Customer values (8,'Andre', 'M', 49);
insert into Customer values (9,'Steph', 'M', 19);
insert into Customer values (10,'Carter', 'M', 50);

insert into Customer values (11,'Shifa', 'F', 49);
insert into Customer values (12,'Sumu', 'F', 25);
insert into Customer values (13,'Shamma', 'F', 29);
insert into Customer values (14,'Ricky', 'F', 39);
insert into Customer values (15,'Putul', 'F', 20);
insert into Customer values (16,'Nipa', 'F', 34);
insert into Customer values (17,'Tasnim', 'F', 25);
insert into Customer values (18,'Ana', 'F', 22);
insert into Customer values (19,'Kaniz', 'F', 19);
insert into Customer values (20,'Ilma', 'F', 13);

insert into Customer values (21,'Farzana', 'F', 15);
insert into Customer values (22,'Shafin', 'M', 10);
insert into Customer values (23,'Abrar', 'M', 11);
insert into Customer values (24,'Mahadi', 'M', 16);
insert into Customer values (25,'Ahsana', 'F', 25);

UPDATE Customer SET age = 22 WHERE id = 13;
select * from Customer;