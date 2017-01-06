CREATE VIEW Hospital_view
AS
SELECT
c.chart_id chart_id,
t.treat_id treat_id,
d.doc_id doc_id,
p.pat_id pat_id,
n.nur_id nur_id,
c.chart_contents chart_contents,
t.treat_contents treat_contents,
t.treat_date treat_date,
p.pat_name pat_name,
p.pat_gen pat_gen,
p.pat_jumin pat_jumin,
p.pat_addr pat_addr,
p.pat_phone pat_phone,
p.pat_email pat_email,
p.pat_job pat_job,
d.major_treat major_treat,
d.doc_name doc_name,
d.doc_gen doc_gen,
d.doc_phone doc_phone,
d.doc_email doc_email,
d.doc_position doc_position,
n.major_job major_job,
n.nur_name nur_name,
n.nur_gen nur_gen,
n.nur_phone nur_phone,
n.nur_email nur_email,
n.nur_position nur_position
from Charts c
FULL OUTER JOIN Treatments t
ON c.treat_id=t.treat_id
FULL OUTER JOIN Patients p
ON c.pat_id=p.pat_id
FULL OUTER JOIN Doctors d
ON c.doc_id=d.doc_id
FULL OUTER JOIN Nurses n
ON c.nur_id=n.nur_id
WHERE chart_id is NOT NULL;

SELECT * FROM Hospital_view;