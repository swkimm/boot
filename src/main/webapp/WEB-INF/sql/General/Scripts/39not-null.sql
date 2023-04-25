-- NOT NULL : NULL 허용 안함
CREATE TABLE MyTable17 (
	Col1 int,
	COl2 int not null
);

INSERT into MyTable17(Col1, COl2) 
VALUES (100, 200);

INSERT into MyTable17(Col1) 
VALUES (100);

-- 연습) MyTable18, 두개 컬럼, VARCHAR(20)
-- 두번째 컬럼만 NOT NULL 제약사항 적용
CREATE TABLE MyTable18 (
	Col1 VARCHAR(20),
	Col2 VARCHAR(20) NOT NULL
);

INSERT INTO MyTable18 (Col1, Col2)
VALUES ('sdf', '22dfe');

INSERT INTO MyTable18 (Col1)
VALUES ('22dfe');

CREATE TABLE MyTable19 (
	Col1 INT DEFAULT 0,
	Col2 INT NOT NULL
);

DESC MyTable19;

SELECT * FROM MyTable19;

INSERT INTO MyTable19 (Col1, Col2)
VALUES (100, 200);

INSERT INTO MyTable19 (Col2)
VALUES (200);

INSERT INTO MyTable19 (Col1)
VALUES (200);

-- not null default 조합 가능 
CREATE TABLE MyTable20 (
	Col1 INT, -- null 허용, default 없음
	Col2 INT NOT NULL, -- null 허용 안함, default 없음
	Col3 INT DEFAULT 0, -- null 허용, default 0
	Col4 INT NOT NULL DEFAULT 0 -- null 허용 안함 default 0 
);

desc MyTable20;
