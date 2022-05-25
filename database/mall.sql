


create database mall;
show databases ;
use mall;
show tables ;

DROP TABLE IF EXISTS `user`;
## user表 : 用户表  mb3 代表不支持输入特殊符号。相比于可以支持特殊符号的mb4 节省空间。用户名等信息不建议带有表情等特殊符号
create table user(
    id int primary key auto_increment,
    username varchar(20),
    password varchar(50),
    gender varchar(1),
    tel varchar(20),
    email varchar(50),
    payment_password varchar(6),
    avatar varchar(255),
    birth date,
    city varchar(20))charset=utf8mb3;
    
DROP TABLE IF EXISTS `delivery`;
## delivery表 : 用户的收货地址表
create table delivery (
    id int primary key auto_increment,
    uid int,
    receiver varchar(20),
    tel varchar(20),
    address varchar(255))charset=utf8mb3;

DROP TABLE IF EXISTS `shop_cart`;
## shop_cart表 :购物车 表
create table shop_cart(
    id int primary key auto_increment,
    uid int,
    pid int,
    buy_count int
)charset=utf8mb3;

DROP TABLE IF EXISTS `banner`;
## banner 轮播图表
create table banner(
    id int primary key auto_increment,
    banner varchar(255)
)charset=utf8mb3;

DROP TABLE IF EXISTS `banner`;
## category 商品种类表
create table category(
    id int primary key auto_increment,
    category varchar(20),
    sale_count int
)charset=utf8mb3;

DROP TABLE IF EXISTS `brand`;
## brand 商品品牌表
create table brand(
    id int primary key auto_increment,
    brand varchar(20),
    sale_count int
)charset=utf8mb3;

DROP TABLE IF EXISTS `product_imgs`;
## product_imgs 商品详情页图片表
create table product_imgs(
    pid int primary key auto_increment,
    img varchar(255)
)charset=utf8mb3;

DROP TABLE IF EXISTS `product`;
## product 商品表
create table product(
    id int primary key auto_increment,
    title varchar(50),
    description varchar(100),
    category varchar(20),
    brand varchar(20),
    type varchar(20),
    cover varchar(255),
    price Double(9,2),
    old_price Double(9,2),
    stock int,
    sale_count int,
    comment_count int,
    score Double(2,2)
)charset=utf8mb3;


DROP TABLE IF EXISTS `orders`;
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
desc user;

## 添加一些伪数据
insert into user values
(null,'admin','123456','女','123456','admin@qq.com','1234','a.jpg','2022-06-25','北京'),
(null,'熊超越','123456','男','12345678987','xiongchaoyue@qq.com','1234','b.jpg','2022-05-10','重庆'),
(null,'彭靖桐','123456','男','12345678987','pengjingtong@qq.com','1234','c.jpg','2022-06-25','重庆'),
(null,'晏家军','123456','男','8888888888','yanjiajun@qq.com','8888','d.jpg','2022-05-01','重庆'),
(null,'戴生龙','123456','男','6666666666','daishenglong@qq.com','6666','e.jpg','2022-05-05','重庆'),
(null,'彭靖桐','123456','男','12345678987','pengjingtong@qq.com','1234','f.jpg','2022-06-25','重庆'),
(null,'向睿','123456','男','11111111111','xiangrui@qq.com','1111','g.jpg','2022-05-11','重庆'),
(null,'彭姜理','123456','男','9999999999','pengjiangli@qq.com','3333','h.jpg','2022-05-11','重庆');
select * from user;



