create database QuanLiBanHang;
use QuanLiBanHang;
create table Customer(
cID int primary key auto_increment,
cName varchar(100),
cAge int
);
create table `Order` (
oID int primary key auto_increment,
cID int,
foreign key(cID) references Customer(cID),
oDate date,
oTotalPrice int
);
create table Product (
pID int primary key auto_increment,
pName varchar(100),
pPrice int
);
create table OrderDetail(
oID int ,
pID int ,
foreign key(pID) references Product(pID),
foreign key(oID) references `Order`(oID),
odQTY int
);