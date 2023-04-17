SELECT * FROM Customers 
WHERE CustomerID >= 10 AND CustomerID < 20;

SELECT * FROM Customers
WHERE CustomerID BETWEEN 10 AND 19; -- 지정된 값 포함

-- 50년대생 직원들 
SELECT * FROM  Employees
WHERE BirthDate BETWEEN '1950-01-01' AND '1959-12-31';

-- 가격이 10달러 대 (10.00 ~ 19.99)
SELECT * FROM Products
WHERE Price BETWEEN 10.00 AND 19.99
ORDER BY Price DESC, CategoryID asc;