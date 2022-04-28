select round(45.89878) from dual

create table lp_product(product_id number(2) primary key,product_name varchar2(20),
   price number(10,2));
   
   insert into lp_product values(01,'tv',45000)
   insert into lp_product values(02,'tv',45000)
   insert into lp_product values(03,'tv',45000)
   insert into lp_product values(04,'fridge',40000)
   
   select * from lp_product
   
create table lp_invoice(invoice_number number(5),
       customer_name varchar2(20),quantity number(3),
        product_ref REFERENCES lp_product(product_id))  
        
insert into lp_invoice values(202,'ramesh',2,01)     
insert into lp_invoice values(203,'suresh',3,02) 
insert into lp_invoice values(204,'rajesh',3,03) 
insert into lp_invoice values(205,'dhinesh',5,04) 

// delete from lp_invoice where invoice_number=205
select * from lp_invoice

//join alias name

select lp.product_id,lp.product_name,lp.price,
   li.invoice_number,li.customer_name,li.quantity
      from lp_product lp,lp_invoice li
           where lp.product_id=li.product_ref
           
      //  li.quantity * lp.price   
      
 select lp.product_id,lp.product_name,lp.price,
   li.invoice_number,li.customer_name,li.quantity,li.quantity * lp.price
      from lp_product lp,lp_invoice li
           where lp.product_id=li.product_ref
           
           //rename amount final table
           
select lp.product_id,lp.product_name,lp.price,
   li.invoice_number,li.customer_name,li.quantity,li.quantity * lp.price amount
      from lp_product lp,lp_invoice li
           where lp.product_id=li.product_ref
           
 //left outer join
   select * from lp_invoice
   SELECT * FROM  lp_product
 
 insert into lp_product values(05,'washing machine',40000)
 
     select * from lp_product lp LEFT OUTER JOIN
         lp_invoice li on  lp.product_id=li.product_ref   
         
       select * from  lp_invoice li  RIGHT  OUTER JOIN
       lp_product lp on  li.product_ref = lp.product_id
   
//view 
create view lp_product_view as select product_id,product_name from lp_product
 
 select * from lp_product_view 
 
 insert into lp_product_view values(06,'mobile')
 
 select * from user_views
 
 select * from user_views where view_name ='LP_PRODUCT_VIEW'

SELECT view_name,text from user_views where view_name = 'LP_PRODUCT_VIEW'

//index

create index lp_product_index on lp_product(product_name)

//non equi join
create table lp_catalog(grade varchar(1) primary key,
     max_price number(10,2),min_price number(10,2))

insert into lp_catalog values('A',5000,15000)
insert into lp_catalog values('B',500,1500)
insert into lp_catalog values('C',1499,4999)


select * from lp_catalog

SELECT *from lp_product

SELECT p.product_name, p.price, c.grade FROM
    lp_product p,lp_catalog c 
          where p.price BETWEEN  c.max_price  AND c.min_price

 select price from lp_product
 
 //SELF JOIN
 
 create table lp_bill(bill_number number(5)primary key,
         bill_date date,amount number(10,2),
            cust_ref number(3))
   
 //SEQUENCE         
            
create SEQUENCE LP_SEQQ START WITH 201 
INCREMENT BY 1
MAXVALUE 1000


INSERT into lp_bill values(lp_seqq.nextval,sysdate+1,44500,305)
INSERT into lp_bill values(lp_seqq.nextval,(to_date('22-jan-2022')+10),50000,306)
INSERT into lp_bill values(lp_seqq.nextval,(add_months(to_date('06-jun-2024'),2)),9000,307)
INSERT into lp_bill values(lp_seqq.nextval,'08-aug-2033',7000,304)
INSERT into lp_bill values(lp_seqq.nextval,'08-aug-2033',1200,308)
update lp_bill set cust_ref = cust_ref+100

select * from lp_bill
//SELF JOINS

select b.bill_date,b.amount,b.bill_number from lp_bill a, lp_bill b where 
  a.cust_ref=404 and a.bill_date = b.bill_date
  
  select b.bill_number,b.amount from lp_bill a, lp_bill b where 
  a.cust_ref=401 and a.amount = b.amount

