-- Primary Key : NOT NULL + UNIQUE

CREATE TABLE MyTable24(
	Col1 INT PRIMARY KEY -- NOT NULL + UNIQUE
);

DESC MyTable24;
DESC MyTable23;

CREATE TABLE MyTable25 (
	col1 INT,
	PRIMARY KEY (col1)
);

DESC MyTable25;

CREATE TABLE MyTable26 (
	col1 INT,
	col2 INT,
	PRIMARY KEY (col1, col2) -- 두 컬럼의 조합이 유일
);

DESC MyTable26;
INSERT INTO MyTable26(col1, col2)
VALUES (1,1);
INSERT INTO MyTable26(col1, col2)
VALUES (2,1);
INSERT INTO MyTable26(col1, col2)
VALUES (2,2);
INSERT INTO MyTable26(col1, col2)
VALUES (1,1);

-- 한개의 테이블에 1개의 primary key만 올 수 있음
CREATE TABLE MyTable27 (
	Col1 INT,
	Col2 INT,
	Primary key (Col1),
	primary key (col2)
);

-- 제약사항 (CONSTRAINTS)
-- DEFAULT, UNIQUE, NOT NULL, PRIMARY KEY

