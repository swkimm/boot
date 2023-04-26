use w3schools;

SELECT lastName, firstName FROM Employees;

SELECT lastName, firstName 
FROM (SELECT lastName, firstName FROM Employees) d
WHERE lastName >= 'd' AND lastName < 'e';