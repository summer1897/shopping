drop database if exists shopping;

create database shopping;
use shopping;

drop table if exists user;
create table user(
id int(11) not null auto_increment,
name varchar(30) not null,
sex varchar(10),
age int(10),
primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET utf8;