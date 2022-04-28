create table lakshmi_author(phone_number number(10) primary key,
                    firstName varchar2(20), 
                    lastName varchar2(20),
                    city varchar2(20),pincode number(6))
 describe lakshmi_author
 
 
 create table lakshmi_book( book_number number(10) primary key,
                            bookName varchar2(20),
                            price number(10,2),
                            authorRef number(15) REFERENCES  lakshmi_author(phone_number))
 describe lakshmi_book
 
 describe laProduct
 SELECT * FROM LAPRODUCT
 

 