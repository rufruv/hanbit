select trunc(sum(b.price*o.count), -4) as total 
from book b, customer c, orders o
where c.custid=o.custid and o.bookid=b.bookid ;
