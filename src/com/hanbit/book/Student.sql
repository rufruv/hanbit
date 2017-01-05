CREATE TABLE Subject(
	scode VARCHAR2(20),
	sname VARCHAR2(20),
	PRIMARY KEY(scode)
);

CREATE TABLE Student(
	name VARCHAR2(15) NOT NULL,  
	sno VARCHAR2(20),            
	scode VARCHAR2(20) NOT NULL, 
	gender VARCHAR2(1),    		 
	birth DECIMAL,				 
	PRIMARY KEY(sno), 			 
	FOREIGN KEY(scode) REFERENCES Subject(scode) 
);

SELECT * FROM Subject;
SELECT * FROM Student;
DROP TABLE Suject;



