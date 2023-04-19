-- CREATE TABLE : 새 테이블 만들기
-- TABLE 이름 : 작성 규칠 (회사마다 다름)
-- 우리 과정에서는 UpperCamelCase
-- lower_snake_case, UPPER_SNAKE_CASE 있음 

CREATE TABLE MyTable01 (
	-- 컬럼 정의
	-- 컬럼명 값의 Type, .....
	-- 컬럼명 작성 규칙 (회사 규칙 따르기)
	-- 우리과정에서는 UpperCamelCase(대소문자 구분 안함)
	Col1 INT,
	Col2 VARCHAR(255)
);

SELECT * FROM MyTable01 ;
-- DESC : 테이블 구조 보기
DESC MyTable01;
INSERT INTO MyTable01 (Col1, Col2)
VALUES (30, '가나다');

INSERT INTO MyTable01 (Col1, Col2)
VALUES ('삼십', '가나다');


