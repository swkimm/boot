-- Character(String) 문자형
-- VARCHAR(길이)
CREATE TABLE MyTable2 (
	Col1 VARCHAR(3),
	Col2 VARCHAR(5)
);

INSERT INTO MyTable2 (Col1, Col2)
VALUES ('abc', 'abcde');

INSERT INTO MyTable2 (Col1, Col2)
VALUES ('ab', 'abcd');

INSERT INTO MyTable2 (Col1, Col2)
VALUES ('abcd', 'abcdef'); -- fail 문자 길이

-- 연습)
-- Mytable03
-- 3개의 컬럼 
-- 첫번째 컬럼 type : 문자열 10개까지 저장 가능
-- 두번째 컬럼 type : 문자열 100개까지 저장 가능
-- 세번째 컬럼 type : 문자열 1000개까지 저장 가능
CREATE TABLE Mytable03 (
	one VARCHAR(10),
	two VARCHAR(100),
	three VARCHAR(1000)
);
DESC Mytable03;
SELECT * FROM Mytable03;

-- Numeric (수)
-- int 정수형

CREATE TABLE MyTable04 (
	Col1 INT
);
SELECT * FROM MyTable05;
DESC MyTable05;
INSERT INTO MyTable04 (Col1) VALUES (33);
INSERT INTO MyTable04 (Col1) 
VALUES (1234567890); -- O
INSERT INTO MyTable04 (Col1) 
VALUES (12345678901); -- X 11자리 
INSERT INTO MyTable04 (Col1)
VALUES (3.14); -- 소수점 이하 생략

-- 연습) MyTable05 만들기
-- 두개의 컬럼이 모두 정수 저장 가능
CREATE Table MyTable05 (
	Col1 INT,
	Col2 INT
);

DESC MyTable05;
INSERT INTO MyTable05 (Col1, Col2)
VALUES (2147483647, -2147483647);

-- Decimal, Dec 실수형
-- DEC(총길이, 소수점이하 길이)
CREATE TABLE Mytable06 (
	Col1 DEC(5,2),
	COl2 DEC(3,1)
);
DESC Mytable06;

INSERT INTO Mytable06 (Col1) VALUES (999.99); -- O
INSERT INTO Mytable06 (Col1) VALUES (-999.99); -- O
INSERT INTO Mytable06 (Col1) VALUES (1000.99); -- X
INSERT INTO Mytable06 (Col1) VALUES (999.999); -- X

SELECT * FROM Mytable06;

-- 연습) MyTable07 만들기
-- 두개 컬럼(실수형), 총길이, 소수점 이하 길이 직접 작성
CREATE Table MyTable07(
	Col1 DEC(6,2),
	Col2 DEC(1,1)
);

INSERT INTO MyTable07 (Col1) VALUES (9999.99);
INSERT INTO MyTable07 (Col2) VALUES (9);

-- 날짜 시간
-- DATE 날짜 (YYYY-MM-DD)
-- DATETIME 날짜시간 (YYYY-MM-DD hh:mm:ss)
CREATE TABLE MyTable08 (
	Col1 DATE,
	Col2 DATETIME
);

DESC MyTable08;
SELECT * FROM MyTable08;
INSERT INTO MyTable08 (Col1)
VALUES ('2023-04-19');
INSERT INTO MyTable08 (Col1)
VALUES ('9999-12-31'); -- 최대
INSERT INTO MyTable08 (Col1)
VALUES ('1000-01-01'); -- 최소

INSERT INTO MyTable08 (Col2)
VALUES ('2023-04-19 11:41:54');
INSERT INTO MyTable08 (Col2)
VALUES ('9999-12-31 23:59:59'); -- 최대 
INSERT INTO MyTable08 (Col2)
VALUES ('1000-01-01 00:00:00'); -- 최소 

SELECT NOW();

INSERT INTO MyTable08 (Col1, Col2) 
VALUES (now(), now());

-- 예제) MyTable09 (학생 정보)
-- 학생이름, 성별, 생년월일, 기타정보, 시험성적 
CREATE Table MyTable09 (
	Name VARCHAR(20),
	Gender VARCHAR(1),
	BirthDate DATE,
	Score DEC(5,2),
	Extra VARCHAR(1000)
);

INSERT INTO MyTable09 (Name, Gender, BirthDate, Score, Extra)
VALUES ('손흥민', '남', '2000-01-01', 99.99, '축구선수 토트넘핫스토퍼');
SELECT * FROM MyTable09;


-- 연습) 내가 가지고 있는 교재정보 저장 MyTable10 
CREATE Table MyTable10 (
	BookName VARCHAR(20),
	Publish VARCHAR(30),
	Writer VARCHAR(10),
	Price INT,
	PubDate DATE
);

INSERT INTO MyTable10 (BookName, Publish, Writer, Price, PubDate)
VALUES ('이것이 자바다', '자바왕국', '김자바', 48900, '2022-11-24');

INSERT INTO MyTable10 (*)
VALUES ('자바의 정석', '남궁', '남궁성', 39900, '2020-11-24');

SELECT * FROM MyTable10;

UPDATE MyTable10 
SET price = 50000;















