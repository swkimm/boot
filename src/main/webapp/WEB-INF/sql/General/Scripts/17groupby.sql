-- group by : 집계함수를 그룹별로 리턴할 때 사용

SELECT SUM(Price) FROM Products;
SELECT CategoryID, SUM(Price) FROM Products
GROUP BY CategoryID;

SELECT Country, COUNT(CustomerID) FROM Customers
Group by Country ; 

-- 나라별 고객 수를 나라이름 역순 조회
SELECT Country, COUNT(CustomerID) FROM Customers
GROUP BY Country 
ORDER BY Country DESC;

SELECT Country, COUNT(CustomerID) FROM Customers 
GROUP BY Country 
ORDER BY 2 DESC;

-- 고객이 가장 많은 나라 조회 
SELECT Country, COUNT(CustomerID) FROM Customers
GROUP BY Country 
ORDER BY 2 DESC
Limit 0,1;

-- 카테고리별 상품 가격의 평균 조회
SELECT CategoryID, AVG(price) FROM Products
Group by CategoryID;

-- 카테고리별 가장 비싼 상품의 가격
SELECT CategoryID, MAX(price) FROM Products
Group by CategoryID;

-- 카테고리별 가장 싼 상품의 가격 
SELECT CategoryID, MIN(price) FROM Products
Group by CategoryID;

-- 상품 가격의 평균이 가장 높은 가테고리 조회
SELECT CategoryID, AVG(Price)  FROM Products
Group by CategoryID;
ORDER BY 2 DESC
limit 0,1;

-- 여러 컬럼으로 그룹 
SELECT * FROM Customers;
SELECT COUNT(CustomerID) FROM Customers;
SELECT Country, COUNT(CustomerID) FROM Customers
GROUP BY Country;

SELECT Country, City, COUNT(CustomerID) FROM Customers
GROUP BY Country, City;

-- 나라별, 도시별 공급자 수 조회
SELECT * FROM Suppliers; 
SELECT Country, City, COUNT(SupplierID) FROM Suppliers
GROUP BY Country, City;






