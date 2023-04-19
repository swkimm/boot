-- DELETE : 테이블의 record 지우기

-- 매우 주의!!!!!


DELETE FROM  Customers -- 지울 테이블 명 
WHERE CustomerID = 94; -- 지울 레코드의 조건

-- select 먼저 실행 후 지울 데이터 확인 -> 데이터 삭제
SELECT *
FROM Customers 
WHERE CustomerID = 94;

SELECT * FROM Customers
order by CustomerID desc;

-- 93번 고객 지우기
SELECT *
FROM Customers 
WHERE CustomerID = 93;

DELETE 
FROM Customers 
WHERE CustomerID = 93;

SELECT * 
FROM Products
order by ProductID DESC;
-- 78번 상품 지우기
SELECT *
FROM Products
WHERE ProductID = 78;

DELETE 
FROM Products
WHERE ProductID = 78;

-- 79번 상품 지우기
SELECT *
FROM Products
WHERE ProductID = 79;

DELETE 
FROM Products
WHERE ProductID = 79;

DELETE 
FROM Products 
WHERE CategoryID  = 1;

SELECT COUNT(*) FROM Products;

SELECT * FROM Products;

SELECT * FROM Customers WHERE Country = 'usa';
SELECT * FROM Customers;

-- 문제 1) 고객테이블에서 USA에 사는 고객들 지우기
DELETE FROM Customers WHERE Country = 'usa';

-- 문제 2) 모든 직원 지우기
DELETE FROM Customers;













