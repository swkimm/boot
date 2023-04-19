-- alias : 별칭

SELECT * FROM Customers;
SELECT CustomerID, CustomerName FROM Customers;
SELECT CustomerID AS id, CustomerName AS name
FROM Customers;

-- AS 생략 가능
SELECT CustomerID id, CustomerName name FROM Customers;

SELECT CustomerID id, CustomerName name
FROM Customers
ORDER BY id;

SELECT Country, COUNT(CustomerID) 
FROM Customers
Group by Country;

SELECT Country c, COUNT(CustomerID) NumOfCustomer
FROM Customers
Group by Country;

SELECT Country c, COUNT(CustomerID) NumOfCustomer
FROM Customers
Group by Country
ORDER BY NumOfCustomer;

-- keyword 사용시 backtick 사용
SELECT Country AS `FROM`, CustomerName FROM Customers;
SELECT `Country` AS `FROM`, `CustomerName`
FROM `Customers`;

