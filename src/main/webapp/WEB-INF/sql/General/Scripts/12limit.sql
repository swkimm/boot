-- LIMIT : 조회 레코드 수 제한

SELECT * FROM Customers
LIMIT 5; -- 5개 레코드만

SELECT * FROM Products p 
LIMIT 3;

SELECT * FROM Products
ORDER BY Price  DESC
limit 3;

SELECT * FROM Products 
WHERE CategoryID = 2
ORDER BY Price DESC
LIMIT 5;

-- 나이 많은 직원 3명 조회
SELECT * FROM Employees e 
ORDER BY BirthDate ASC  
limit 3;

-- 브라질 고객 중 아무나 3명 조회
SELECT * FROM Customers c 
WHERE Country ='Brazil'
limit 3;

-- 3번 카테고리 상품 중 가격이 싼 상품 2개 조회
SELECT * FROM Products p 
WHERE CategoryID = 3
ORDER BY Price asc
LIMIT 2;

-- LIMIT 3 위에서 부터 3개

-- LIMIT m 위에서부터 m개 

-- LIMIT n,m n번부터 m개 

SELECT * FROM Customers ORDER BY CustomerID;
SELECT * FROM Customers ORDER BY CustomerID Limit 3;
SELECT * FROM Customers ORDER BY CustomerID Limit 0, 3;

SELECT * FROM Customers ORDER BY CustomerID Limit 3, 3;
SELECT * FROM Customers ORDER BY CustomerID Limit 6, 3;

-- 두번쨰로 나이가 많은 직원 조회 
SELECT * FROM Employees ORDER BY BirthDate LIMIT 1, 1;

-- 2번 카테고리 상품 중 두번째로 가격이 비싼 상품 조회 
SELECT * FROM Products WHERE CategoryID =2 ORDER BY Price DESC limit 1,1;










