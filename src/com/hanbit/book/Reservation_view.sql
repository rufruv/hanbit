CREATE VIEW Reservation_View
AS
SELECT
r.res_seq res_seq,
r.res_date res_date,
m.multi_seq multi_seq,
t.theater_no theater_no,
c.con_no con_no,
r.seat_no seat_no,
m.multi_name multi_name,
m.loc loc,
t.title title,
t.price price,
t.seat_count seat_count,
c.name name,
c.addr addr
from Reservation r
FULL OUTER JOIN Multiplex m
ON r.multi_seq= m.multi_seq
FULL OUTER JOIN Theater t
ON r.theater_no= t.theater_no
FULL OUTER JOIN Consumer c
ON r.con_no= c.con_no
WHERE res_seq is NOT NULL;

SELECT * FROM Reservation_view;