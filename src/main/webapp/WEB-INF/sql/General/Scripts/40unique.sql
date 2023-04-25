-- UNIQUE 중복 허용 안함

CREATE TABLE MyTable21 (
	Col1 INT,
	Col2 INT UNIQUE
);
DESC MyTable21;
SELECT * FROM MyTable22;
INSERT INTO MyTable21 (Col1, COl2) 
VALUE (1, 1); -- o
INSERT INTO MyTable21 (Col1, COl2) 
VALUE (2, 2); -- o
INSERT INTO MyTable21 (Col1, COl2) 
VALUE (2, 3); -- o
INSERT INTO MyTable21 (Col1, COl2) 
VALUE (4, 3);

-- 예제
DROP Table MyTable22;
CREATE TABLE MyTable22 (
	ssn VARCHAR(13) UNIQUE,
	name VARCHAR(20)
);

DESC MyTable22;
INSERT INTO MyTable22 (ssn, name)
VALUE ('1', '정대만');

INSERT INTO MyTable22 
Value ('1', 'thd');

insert into MyTable22
VALUE (null, '채소');

insert into MyTable22
VALUE (null, '강백');

CREATE TABLE MyTable23 (
	Col1 VARCHAR(20) NOT NULL UNIQUE DEFAULT ''
);
-- NOT NULL UNIQUE : primary Key

DESC MyTable23;
