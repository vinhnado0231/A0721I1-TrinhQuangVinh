use quanlibanhang;

select * from Customer;

insert into Customer(cName,cAge) values
("Minh Quan",10),
("Ngoc Oanh",20),
("Hong Ha",50);

insert into Product(pName,pPrice) values
("May giat",3),
("Tu lanh",5),
("Dieu hoa",7),
("Quat",1),
("Bep Dien",2);

insert into `order`(oId,cId,oDate,oTotalPrice) values
(1,1,'2006-3-21',null),
(2,2,'2006-6-6',null),
(3,1,'2007-3-1',null);

insert into orderdetail values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

select oId,oDate,oTotalPrice from `order` ;

select customer.* from customer
inner join `order` on customer.cId=`order`.cID 
join orderdetail on orderdetail.oId=`order`.oId
join product on product.pID=orderdetail.pID
where  customer.cId=`order`.oID and `order`.oId=orderdetail.oId and product.pID=orderdetail.pID
group by cId,pId;

select cName from Customer
where cId not in (select cId from `order`);


select `order`.oId,oDate,sum(odQTY * pPrice) as `Total Price` from `order`
join Orderdetail on `order`.oId=Orderdetail.oId
join Product on Orderdetail.pId=Product.pId
group by `order`.oId;









