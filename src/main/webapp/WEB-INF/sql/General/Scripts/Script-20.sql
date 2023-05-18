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

DESC FileName;

SELECT *,
	COUNT(f.id) fileCount
FROM Board b LEFT JOIN FileName f
ON b.id = f.boardId
GROUP BY b.id 
ORDER BY b.id DESC;

SELECT * FROM Board b LEFT JOIN


SELECT f.fileName FROM Board b LEFT JOIN FileName f 
ON b.id = f.boardId
WHERE b.id = 8190;

DELETE f.fileName FROM Board b LEFT JOIN FileName f 
ON b.id = f.boardId;
WHERE b.id = 8191;

SELECT * FROM Board b LEFT JOIN FileName f 
ON b.id = f.boardId
WHERE b.id = 8196;

DELETE FROM FileName
WHERE id = 8191;

DELETE f FROM Board b LEFT JOIN FileName f 
				ON b.id = f.boardId;
			WHERE b.id = ${id};

desc FileName;
desc Board;


CREATE TABLE Hit (
    HitId int NOT NULL PRIMARY KEY,
    OrderNumber int NOT NULL,
    PersonID int FOREIGN KEY REFERENCES Persons(PersonID)
);






LIMIT 0, 5;