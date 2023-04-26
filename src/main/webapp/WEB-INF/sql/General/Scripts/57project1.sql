CREATE DATABASE Board;

use Board;

-- 테이블명 : UpperCamelCase
-- 컬럼명 : lowerCameCalse
CREATE TABLE Board (
	id INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
	body VARCHAR(1000) NOT NULL,
	writer VARCHAR(20),
	inserted DATETIME DEFAULT NOW()
);

DESC Board;

use w3schools;

SELECT * FROM Categories;