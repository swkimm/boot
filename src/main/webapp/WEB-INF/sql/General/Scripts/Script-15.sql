select CustomerName, ContactName
FROM Customers
WHERE CustomerID = 3;

desc Categories;

SELECT * FROM Categories;

SELECT ProductName, Price
			FROM Products
			WHERE CategoryId =7;
			
SELECT * FROM Products;

CREATE TABLE MyTable34 (
	Col1 INT,
	Col2 VARCHAR(30)
);

INSERT INTO MyTable34 (Col1, Col2)
VALUES (99,'hello');

SELECT * FROM MyTable36;


CREATE TABLE MyTable35 (
	Col1 DEC(10.4),
	Col2 VARCHAR(30)
);

CREATE TABLE MyTable36(
	Col1 INT,
	COl2 VARCHAR(50),
	Col3 DEC(10,2)
);

INSERT INTO MyTable36 (Col1, Col2, Col3)
VALUES (10, 'java', 3.14);


CREATE TABLE MyTable37(
	Age INT,
	Name VARCHAR(10),
	Score INT
);

SELECT * FROM MyTable37;

SELECT * FROM Categories;

CREATE TABLE MyTable38(
	Col1 INT,
	Col2 INT,
	Col3 VARCHAR(200),
	Col4 VARCHAR(200),
	Col5 DEC(10,3),
	Col6 DEC(10,3)
);

CREATE TABLE MyTable39 (
	Col1 INT PRIMARY KEY AUTO_INCREMENT,
	Col2 VARCHAR(300),
	Col3 INT
);

INSERT INTO MyTable39(Col2, Col3)
VALUES ('hello', 99);

SELECT * FROM MyTable39;

CREATE TABLE MyTable40(
	Id INT PRIMARY KEY AUTO_INCREMENT,
	Age INT,
	Name VARCHAR(30),
	Score DEC(10,3)
);


SELECT * FROM Employees;


SELECT * FROM Categories;

DELETE 
			FROM Categories
			WHERE CategoryID BETWEEN 10 and 92 ;





