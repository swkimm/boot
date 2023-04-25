-- ALTER Table Modify Column : 제약 사항 추가 
CREATE TABLE MyTable28 (
	col1 INT,
	col2 INT,
	col3 INT,
	col4 INT
);
DESC MyTable28;

ALTER TABLE MyTable28 
MODIFY COLUMN col1 INT UNIQUE;

ALTER TABLE MyTable28 
MODIFY COLUMN col2 INT NOT NULL;

-- col3에 default 0 제약사항 추가 
ALTER TABLE MyTable28 
MODIFY COLUMN col3 INT default 0;

-- col4에 not null unique default 100 제약사항 추가 
ALTER TABLE MyTable28
MODIFY COLUMN col4 INT not null unique default 100;

-- Primary key 추가 
CREATE TABLE MyTable29(
	col1 INT,
	col2 INT,
	col3 INT
);

ALTER TABLE MyTable29
ADD Primary key (col1, col2);

DESC MyTable29;


