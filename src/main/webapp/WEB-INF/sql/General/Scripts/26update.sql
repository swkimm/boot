-- UPDATE : 레코드 수정

SELECT * FROM Customers WHERE CustomerID  = 1;

UPDATE Customers  			-- 테이블명
SET CustomerName ='서태웅'	-- 변경할 컬럼과 값
where CustomerID  = 1; 		-- 변경할 레코드 조건


UPDATE Customers 
SET 
	CustomerName = '정대만',
	City = 'Seoul',
	Country = 'Korea'
where CustomerID = 1;

SELECT * FROM Suppliers;
-- 문제1) 1번 공급자의 이름, 도시, 나라 변경
UPDATE Suppliers 
SET 
	SupplierName = '강백호',
	City = 'Seoul',
	Country = 'Korea'
WHERE SupplierID =1;

UPDATE Suppliers 
SET SupplierName = '채치수',
	Country  ='France'
WHERE Country = 'USA';

SELECT * FROM Suppliers WHERE Country ='france';

UPDATE Suppliers 
SET ContactName = '북산',
	City = 'Seoul';

UPDATE Customers 
SET * 

UPDATE Suppliers 
SET 
	PostalCode = CONCAT('J', PostalCode)
WHERE Country = 'Japan';

SELECT * FROM Products;
INSERT INTO Products 
VALUES (1, 'Dounut', null, null, null, 300);

INSERT INTO Products 
VALUES (100, 'Kimchi', null, null, null, 600);

DELETE 
FROM Products 
WHERE ProductID = 100;

UPDATE Products 
Set Price = price * 1300;

INSERT INTO Customers (CustomerID, CustomerName)
Values (92, '강백호');

SELECT * FROM Customers 
ORDER BY CustomerID DESC ;

SELECT * FROM Employees
ORDER BY EmployeeID DESC ;

















