-- HAVING : 집계 함수의 조건 설정
SELECT Country, COUNT(CustomerID) 
FROM Customers
GROUP BY Country;


-- 5명 이상의 고객이 있는 나라 조회
SELECT Country, COUNT(CustomerID) numOfCustomer
FROM Customers
WHERE numOfCustomer >= 5 -- record를 거르는 조건
GROUP BY Country;

SELECT Country, COUNT(CustomerID) numOfCustomer
FROM Customers
GROUP BY Country
HAVING numOfCustomer >= 5;

SELECT Country, COUNT(CustomerID) numOfCustomer
FROM Customers
GROUP BY Country
HAVING COUNT(CustomerID) >= 5;

-- 상품의 평균 가격이 30달러 이상인 카테고리 조회
SELECT CategoryID, AVG(Price)  FROM Products
Group by CategoryID
HAVING AVG(Price) >= 30
order by AVG(Price) DESC; 
-- 카테고리별 상품의 최고 가격이 100달러 이상인 카테고리조회
SELECT CategoryID, Max(Price) FROM Products
Group by CategoryID 
HAVING Max(Price) >= 100;








