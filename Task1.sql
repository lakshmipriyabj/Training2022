describe priya_member

describe LPRIYA_BOOKS

describe LPRIYA_ISSUE

Drop Table priya_member

describe LPRIYA_MEMBER

describe LPRIYA_MEMBER

describe LPRIYA_ISSUE

ALTER TABLE LPRIYA_ISSUE DROP COLUMN REFERENCE

DESCRIBE LPRIYA_ISSUE

describe lpriya_lib_issue

rename lpriya_lib_issue to lp_lib_issue

Alter table lpriya_member add(Member_Address Varchar2(50),Acc_Open_Date Date,
              	Fees_Paid Number(4),
                   Max_Books_Allowed Number(2),
                Penalty_Amount Number(7,2))
describe lpriya_member


insert into lpriya_member values(01,'Richa Sharma','Lifetime','Pune','10-Dec-05',2500,5,50)
insert into lpriya_member values(02,'Garima Sen','Annual','Pune',SYSDATE,1000,3,NULL)

insert into lpriya_member values(04,'lakshmi','Quartery','avadi',SYSDATE,1000,3,NULL)
insert into lpriya_member values(05,'jerisha','Quartery','perambur',SYSDATE,1000,3,NULL)
insert into lpriya_member values(06,'mahaswethana','Half Year','poonamale','09-jan-12',2000,3,100)
SELECT  *FROM LPRIYA_MEMBER

alter table lpriya_member modify (member_name varchar2(20))
describe lpriya_member
insert into lpriya_member (MEMBER_ID , MAX_BOOKS_ALLOWED,MEMBERSHIP_TYPE) values(09,110,'Annual')

describe lpriya_member

create table lpriya_member101 as (select * from lpriya_member)

describe lpriya_member101

select * from lpriya_member101

drop table lpriya_books


create table lpriya_books1(book_number number(10)primary key,book_name varchar2(20)null,
     category varchar2(30)
       check(category='Science' or category='Fiction'or 
             category ='Database'or category='RDBMS' or category='Others')) 
alter table lpriya_books1 add(author varchar2(20),cost number(20))  
describe lpriya_books1
insert into lpriya_books1 values(101,'Let us C','System','Denis Ritchie',450)

insert into lpriya_books1 values(101,'Let us C','Science','Denis Ritchie',450)
insert into lpriya_books1 values(102,'Oracle–Complete Ref','Database','loni',550)
insert into lpriya_books1 values(103,'Mastering SQL','Database','Loni',250)
insert into lpriya_books1 values(104,'PL SQL-Ref','Database','Scott Urman',750)
insert into lpriya_books1 values(105,'SQL-Ref','Database','Urman',750)

select *from lpriya_books1

create table lpriya_Book101 as(select * from lpriya_books1)
insert into  lpriya_Book101(select *from  lpriya_books1)

select * from lpriya_book101
describe lpriya_book101
INSERT INTO lpriya_book101 values(105,'National Geographic','Science','Adis Scott',250)  


update lpriya_book101 set cost =300 where book_number=103

update lpriya_book101 set category = 'RDBMS' where book_number=103

select * from lpriya_book101 

describe lp_lib_issue 

rename lp_lib_issue to lpriya_issue

drop table lpriya_issue

create table lpriya_issue101(Lib_Issue_Id number(10)Primary key,
	BOOK_NUMBER  number(5) REFERENCES  lpriya_books1(Book_number),
	Member_id number(5) REFERENCES lpriya_member(Member_id),
	Issue_date date,Return_date date,check(Issue_date < Return_date)) 


describe lpriya_issue101

INSERT INTO lpriya_issue101 values(7001, 101, 1,'10-Dec-06', '13-jan-07')

INSERT INTO lpriya_issue101 values(7002	,102,2,'25-Dec-06','29-Dec-07')	

INSERT INTO lpriya_issue101 values(7003,104	,1,'15-Jan-06','15-Jan-07')	
	

INSERT INTO lpriya_issue101 values(7004,101	,1,'04-Jul-06','18-Jan-08')	
	

INSERT INTO lpriya_issue101 values(7005,104,2,'15-Nov-06','15-Jan-09')	
	

INSERT INTO lpriya_issue101 values(7006,101,3,'18-Feb-06','15-Jan-07')	
	

SELECT * FROM lpriya_issue101

create table lpriya_issue10(Lib_Issue_Id number(10)Primary key,
	BOOK_NUMBER  number(5)constraints maha REFERENCES  lpriya_books1(Book_number),
	Member_id number(5) constraints riya REFERENCES lpriya_member(Member_id),
	Issue_date date,Return_date date,check(Issue_date < Return_date)) 

alter table lpriya_issue10 disable constraint maha
alter table lpriya_issue10 disable constraint riya

INSERT INTO lpriya_issue10 values(7006,1056,300,'18-Feb-06','15-Jan-07')	

alter table lpriya_issue10 enable constraint maha
alter table lpriya_issue10 enable constraint riya
select * from lpriya_issue10

delete from lpriya_issue10 where Lib_Issue_Id=7006
alter table lpriya_issue10 enable constraint jerisha