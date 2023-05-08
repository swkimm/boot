USE w3schools;

SELECT * FROM Customers
WHERE CustomerName LIKE '%ell%';

SELECT * FROM Employees;

SELECT
	EmployeeId id,
	FirstName,
	LastName
FROM Employees
WHERE 
	FirstName LIKE 'eve' AND LastName LIKE 'eve';
	
SELECT * FROM Products;