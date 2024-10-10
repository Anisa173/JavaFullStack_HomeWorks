create database employeedb;
use employeedb;

CREATE TABLE employee (
    employeeId INTEGER NOT NULL AUTO_INCREMENT,
    nId VARCHAR(255) NOT NULL,
    nameEsurname VARCHAR(255) NOT NULL,
    empSalary INTEGER NOT NULL,
    position VARCHAR(255) NOT NULL,
    birthday TIMESTAMP,
    address VARCHAR(255) NOT NULL,
    PRIMARY KEY (employeeId)
);