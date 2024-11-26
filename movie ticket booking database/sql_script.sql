create database naveen;
use naveen;
create table users(
login_id int auto_increment primary key,
username varchar(100),
phone_number int,
email varchar(100),
address varchar(100),
first_name varchar(100),
last_name varchar(100),
created_by varchar(100) default'system',
created_date timestamp default current_timestamp,
modified_by varchar(100) default'system',
modified_date timestamp default current_timestamp on update current_timestamp
);
