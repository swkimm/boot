CREATE Database leetcode183;
use leetcode183;

CREATE TABLE Customers (
	id INT PRIMARY KEY,
	name VARCHAR(100)
);

INSERT INTO Customers VALUES (1,'Joe');
INSERT INTO Customers VALUES (2,'Henry');
INSERT INTO Customers VALUES (3,'Sam');
INSERT INTO Customers VALUES (4,'Max');

SELECT * FROM Customers;

CREATE Table Orders(
	id INT PRIMARY KEY,
	customerId INT,
	FOREIGN KEY (customerId) REFERENCES Customers(id)
);

INSERT INTO Orders VALUES (1,3);
INSERT INTO Orders VALUES (2,1);

-- 문제) 한번도 주문하지 않은 고객
SELECT c.name Customers 
FROM Customers c left join Orders o ON c.id = o.customerId
WHERE o.customerId is NULL;


-- 서브쿼리로 풀어보기
SELECT CustomerID FROM Orders; 
SELECT * FROM Customers WHERE id NOT IN (1,3);

SELECT name FROM Customers WHERE id NOT IN (SELECT CustomerID FROM Orders);















