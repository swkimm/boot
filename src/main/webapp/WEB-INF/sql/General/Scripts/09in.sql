-- IN 특정 값 중에 있으면 
SELECT * FROM Customers
WHERE Country IN ('Germany', 'France');

-- 3, 5번 카테고리에 속한 상품들 조회
SELECT * FROM Products
WHERE CategoryID IN  (3, 5);

-- 1,3,5,7 번 카테고리에 속한 상품들 조회
SELECT * FROM Products
WHERE CategoryID IN  (1, 3, 5, 7);


-- Berlin, London, Madrid, Paris 에 있는 고객들 조회
SELECT * FROM Customers
WHERE City IN ('Berlin', 'London', 'Madrid', 'Paris');

-- Berlin, London, Madrid, Paris 에 있지않는 고객들 조회
SELECT * FROM Customers
WHERE NOT City IN ('Berlin', 'London', 'Madrid', 'Paris');

SELECT * FROM Customers
WHERE City NOT IN ('Berlin', 'London', 'Madrid', 'Paris');

-- 1,3,5,7 번 카테고리가 아닌 상품들 조회
SELECT * FROM Products
WHERE CategoryID NOT IN (1, 3, 5, 7);

SELECT Orders.OrderID, Customers.CustomerName
FROM Orders
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;

