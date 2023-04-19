use w3schools;

SELECT * FROM Customers ORDER BY 1 DESC;

INSERT INTO Employees (EmployeeID, LastName, FirstName)
VALUES(11, '박지성', '두개의 심장');

INSERT INTO Employees (LastName, FirstName)
VALUES('차범근', '차붐');

-- 테이블 정보 보기
DESC Employees;

-- Customers 테이블의 자동 증가 컬럼을 찾기
DESC Customers;

INSERT INTO Customers 
(CustomerName, ContactName)
VALUES ('정대만', "daeman");

SELECT * FROM Suppliers; 
-- 문제1) 새 공급자 데이터 추가(SupplierId, SupplierName, City)
-- 자동 증가 컬럼은 직접 값을 넣지 않고
DESC Suppliers;
INSERT INTO Suppliers 
(SupplierName, City)
VALUES ('강백호', '서울');