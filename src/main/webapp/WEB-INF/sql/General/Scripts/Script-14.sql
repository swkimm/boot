USE w3schools;

CREATE TABLE MyTable30 (
	Col1 INT,
	Col2 VARCHAR(30)
);

SELECT * FROM MyTable30;

INSERT INTO MyTable30 
VALUES (30, 'java');

INSERT INTO MyTable30 (Col1)
VALUES ('33'); -- O

INSERT INTO MyTable30 (Col1)
VALUES ('three'); -- X

INSERT INTO MyTable30 (Col2)
VALUES (77); -- O

CREATE TABLE MyTable31 (
	Col1 DATE,
	Col2 DATETIME
);

-- DATE : YYYY-MM-DD
-- DATETIME : YYYY-MM-DD HH:mm:SS
INSERT INTO MyTable31 (Col1, Col2)
VALUES ('2023-04-23', '2023-04-20 09:29:12');

SELECT * FROM MyTable32;

CREATE TABLE MyTable32 (
	Name VARCHAR(30),
	Age INT, 
	Price DEC(10,2),
	Birth DATE,
	Inserted DATETIME
);

CREATE TABLE MyTable33 (
	Title VARCHAR(200),
	Published DATE,
	Price INT,
	Updated DATETIME,
	Weight DEC(10,3)
);

SELECT * FROM Employees;


use w3schools;



SELECT CustomerName
			FROM Customers
			WHERE CustomerID = 1;

SELECT * FROM Employees;


desc Employees;








