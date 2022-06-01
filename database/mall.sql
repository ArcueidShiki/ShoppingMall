use mall;
show tables ;

DROP TABLE IF EXISTS `user`;
## user表 : 用户表
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
    city varchar(20)
)charset=utf8mb4;
    
DROP TABLE IF EXISTS `delivery`;
## delivery表 : 用户的收货地址表
create table delivery (
    id int primary key auto_increment,
    uid int,
    receiver varchar(20),
    tel varchar(20),
    address varchar(255))charset=utf8mb4;

DROP TABLE IF EXISTS `shop_cart`;
## shop_cart表 :购物车 表
create table shop_cart(
    id int primary key auto_increment,
    uid int,
    pid int,
    buy_count int
)charset=utf8mb4;

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
)charset=utf8mb4;

select * from user;
select * from delivery;
select * from shop_cart;
select * from orders;
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



