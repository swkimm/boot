use w3schools;

SELECT 
	c.CategoryId id,
	c.CategoryName name,
	c.Description,
	p.ProductName
FROM Categories c JOIN Products p 
ON c.CategoryId = p.CategoryID;

SELECT * FROM Suppliers s JOIN Products p 
			ON s.SupplierID = p.ProductID 
WHERE s.SupplierID = 1;



USE Board;

SELECT *,
	COUNT(f.id) fileCount
FROM Board b LEFT JOIN FileName f
ON b.id = f.boardId
ORDER BY b.id DESC
LIMIT 0, 5;