create database mall;
show databases ;
use mall;
show tables ;
## user表 : 用户表  mb3 代表不支持输入特殊符号。相比于可以支持特殊符号的mb4 节省空间。用户名等信息不建议带有表情等特殊符号
create table user(
    id int primary key auto_increment,
    username varchar(20),
    password varchar(50),
    gender varchar(1),
    tel varchar(20),
    email varchar(50),
    payment_password varchar(6),
    avatar_url varchar(255),
    birth datetime,
    city varchar(20))charset=utf8mb3;
## delivery表 : 用户的收货地址表
create table delivery (
    id int primary key auto_increment,
    uid int,
    receiver varchar(20),
    tel varchar(20),
    address varchar(255))charset=utf8mb3;
## shop_cart表 :购物车 表
create table shop_cart(
    id int primary key auto_increment,
    uid int,
    pid int,
    buy_count int
)charset=utf8mb3;

## banner 轮播图表
create table banner(
    id int primary key auto_increment,
    banner_url varchar(255)
)charset=utf8mb3;

## category 商品种类表
create table category(
    id int primary key auto_increment,
    category varchar(20),
    sale_count int
)charset=utf8mb3;
## brand 商品品牌表
create table brand(
    id int primary key auto_increment,
    brand varchar(20),
    sale_count int
)charset=utf8mb3;
## product_imgs 商品详情页图片表
create table product_imgs(
    pid int primary key auto_increment,
    img_url varchar(255)
)charset=utf8mb3;
## product 商品表
create table product(
    id int primary key auto_increment,
    title varchar(50),
    description varchar(100),
    category varchar(20),
    brand varchar(20),
    type varchar(20),
    cover_url varchar(255),
    price Double(9,2),
    old_price Double(9,2),
    stock int,
    sale_count int,
    comment_count int,
    score Double(2,2)
)charset=utf8mb3;

## order 订单表
create table orders(
    id int primary key auto_increment,
    uid int,
    pid int,
    did int,
    buy_count int,
    status int,
    created timestamp,
    ended timestamp
)charset=utf8mb3;

select * from user;
select * from shop_cart;
select * from orders;

select * from category;
select * from brand;
select * from product;
select * from product_imgs;
alter table user change avatar_url avatar varchar(255);
alter table user change birth birth date;
alter table banner change banner_url banner varchar(255);
alter table product change cover_url cover varchar(255);
select * from product_imgs;
alter table product_imgs change img_url img varchar(255);
desc user;