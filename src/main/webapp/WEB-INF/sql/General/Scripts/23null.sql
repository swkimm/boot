SELECT * FROM Products Order by 1 DESC ;
-- IFNULL : null이면 다른 값으로 변경
SELECT IFNULL(0, 100); -- 0
SELECT IFNULL('kim', 'lee') ; -- kim
SELECT IFNULL(NULL, 100); -- 100
SELECT IFNULL(NULL, 'park'); -- park

SELECT ProductID, ProductName, SupplierID, CategoryID, Unit, price FROM Products Order by 1 Desc;

SELECT ProductID, ProductName, SupplierID, CategoryID, Unit, IFNULL(price, 0) FROM Products Order by 1 Desc;

SELECT AVG(IFNULL(Price, 0)) AS Average FROM Products WHERE CategoryID = 2;
SELECT AVG(Price) AS Average FROM Products WHERE CategoryID = 2;

-- 문제 1) 고객테이블에서 CustomerID, ContactName, address 조회 
-- ContactName이 Null이면 'Anonymous'로 
-- address가 null이면 'homeless'로 조회 
SELECT CustomerID, IFNULL(ContactName,'Anonymous'), IFNULL(Address, 'Homeless') FROM Customers;
