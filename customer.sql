create table lp_customer(customer_id number(5)primary key,
         customer_name varchar2(15),phone_number number(10),
             credit_scored number(10,5)check(credit_scored between 300 and 800))
describe lp_customer
select * from lp_customer
insert into lp_customer values(1001,'Jerisha',9876543210,350)
insert into lp_customer values(1002,'maha',1234567890,450)
create table lp_loanApplication(application_number number(10)primary key,
     customer_id_ref number(15) references lp_customer(customer_id),
         loan_amount number(10))
         insert into lp_loanApplication values(1,1001,500000)
         insert into lp_loanApplication values(2,1002,200000)
         describe lp_loanApplication
         select * from lp_loanApplication
         
select * from lp_customer lc,lp_loanApplication la 
  where lc.customer_id=la.customer_id_ref
     select * from lp_customer lc,lp_loanApplication la 
  where lc.customer_id=la.customer_id_ref and lc.customer_id=1001
    