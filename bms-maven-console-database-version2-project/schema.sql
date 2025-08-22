create database if not exists book_db;
use book_db;

drop table book_details;
drop table author_details;

create table author_details (
     author_id int primary key auto_increment,
     author_firstname varchar(30),
     author_lastname varchar(30)
     );

create table book_details (
	book_id int primary key auto_increment,
    book_title varchar(200),
    book_author_id int,
    book_published date,
    book_category varchar(100),
    book_price float,
    book_image_url varchar(300),
    foreign key(book_author_id) references author_details(author_id)
);