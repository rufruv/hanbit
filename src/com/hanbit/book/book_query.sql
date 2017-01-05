select sum(b.price*o.count)/10 as tax
from book b, customer c, orders o
where c.custid=o.custid and o.bookid=b.bookid and c.address like '%대한민국%';

