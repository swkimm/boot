use w3schools;

SELECT * 
FROM Customers
WHERE CustomerID > 4 AND Country = 'Germany';


SELECT *
FROM Employees
WHERE LastName >='M' AND BirthDate >= '1960-01-01';

-- 카테고리 ID가 2이고 가격이 20.00 이상인 상품들 조회
SELECT * 
FROM Products
WHERE CategoryID = 2 AND Price >= 20.00;

-- 1950-01-01 ~ 1959-12-31 사이에 태어난 직원들 
SELECT  * 
FROM Employees
WHERE BirthDate >= '1950-01-01' AND BirthDate <= '1959-12-31';

-- OR
SELECT * FROM Customers
WHERE Country ='Germany' or Country ='France'
ORDER BY Country ='France' DESC ;

-- 도시 London 또는 Madrid에 있는 고객들 조회
SELECT * FROM Customers
WHERE City ='London' or City ='Madrid';