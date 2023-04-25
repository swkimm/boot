DESC Orders;

SELECT * FROM Orders o JOIN Customers c
ON o.CustomerID = c.CustomerID; -- 830

SELECT * FROM Orders o RIGHT JOIN Customers c 
ON o.CustomerID = c.CustomerID; -- 832

SELECT * FROM Orders o RIGHT JOIN Customers c 
ON o.CustomerID = c.CustomerID
WHERE o.OrderID is Null; -- 주문한적 없는 고객 

-- 문제) 주문을 처리한 적 없는 직원 조회
DESC Orders;

DESC Employees

SELECT * FROM Orders o Right join Employees e 
On o.EmployeeID = e.EmployeeID
WHERE o.OrderID is null; 

SELECT * FROM Orders;