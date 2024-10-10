create database if not exists orders;
use orders;
CREATE TABLE orders (
    OrderId INTEGER NOT NULL AUTO_INCREMENT,
    OrderPrize INTEGER NOT NULL,
    OrderItems INTEGER NOT NULL,
    OrderTimeC TIMESTAMP NOT NULL,
    OrderProcessed TIMESTAMP NOT NULL,
    Order_status VARCHAR(255) NOT NULL,
    PRIMARY KEY (OrderId)
);