use w3schools;

SELECT * FROM Customers;

SELECT * FROM Employees;

SELECT * FROM Products; 

SELECT ProductName 
FROM Products 
WHERE ProductID = 5;

SELECT CustomerName
				FROM Customers;
				
SELECT firstName FROM Employees;

SELECT ShipperName FROM Shippers;

SELECT * FROM Products;

SELECT * FROM Customers WHERE CustomerID < 4;

SELECT LastName, FirstName
FROM Employees
WHERE EmployeeID < 4;
				
SELECT CustomerID, CustomerName, Country 
FROM Customers;

SELECT EmployeeId, LastName, FirstName
FROM Employees ;
				
SELECT CustomerID, CustomerName, Address 
FROM Customers
WHERE CustomerID;