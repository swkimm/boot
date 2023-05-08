use Board;

-- 전체 : type:all
SELECT * FROM Board
WHERE 
		title LIKE '%keyword%'
	OR  body LIKE '%keyword%'
	OR  writer LIKE '%keyword';
	
-- 제목 : type:title
SELECT * FROM Board
WHERE 
		title LIKE '%keyword%'

use w3schools;
SELECT * FROM Suppliers
WHERE Country IN ('UK', 'USA', 'Japan');

SELECT * FROM Suppliers
WHERE Country IN ('Brazil', 'Germany');


SELECT * FROM Suppliers
WHERE Country;



