SELECT COUNT(*) FROM Products; -- 77
SELECT COUNT(*) FROM Categories; -- 8
SELECT COUNT(*) FROM Suppliers; -- 29

DESC Products; -- 6개 열 
DESC Categories; -- 3개 열 
DESC Suppliers; -- 8개 열 

SELECT * FROM Products JOIN Categories JOIN Suppliers;

SELECT COUNT(*) FROM
Products JOIN Categories JOIN Suppliers; -- 17,864

SELECT * FROM
Products p JOIN Categories c ON p.CategoryID = c.CategoryID
		   JOIN Suppliers s ON p.SupplierID = s.SupplierID;
		   
-- 예) 1번 상품의 상품명, 카테고리명, 공급자명 
SELECT p.ProductName, c.CategoryName, s.SupplierName
FROM Products p JOIN Categories c ON p.CategoryID = c.CategoryID
				JOIN Suppliers s ON p.SupplierID = s.SupplierID
WHERE p.ProductID = 1;

-- 예제) 1996-07-04에 주문한 상품명 조회
SELECT * FROM Orders;
SELECT * FROM OrderDetails;
SELECT * FROM Products;

SELECT ProductName 
FROM Orders o Join OrderDetails od On o.OrderID = od.OrderID
				JOIN Products p on od.ProductID = p.ProductID
WHERE o.OrderDate = '1996-07-04';


-- '1996-07-04'의 매출 조회
DESC Orders;
DESC OrderDetails;
DESC Products;

SELECT SUM(od.Quantity * p.Price) 매출
FROM OrderDetails od JOIN Products p ON od.ProductID = p.ProductID
					 JOIN Orders o ON od.OrderID = o.OrderID
WHERE o.OrderDate = '1996-07-04';


-- 일별 매출 조회 (날짜 순으로 결과 조회)
SELECT o.OrderDate, SUM(od.Quantity * p.Price) 매출
FROM OrderDetails od JOIN Products p ON od.ProductID = p.ProductID
                     JOIN Orders o ON od.OrderID = o.OrderID
GROUP BY o.OrderDate
ORDER BY o.OrderDate ASC;











































