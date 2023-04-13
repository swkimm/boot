-- select
-- 데이터 읽기(가져오기)

-- table (행, 열)
-- 행 (row, recode)
-- 열 (column, field, attribute)

-- SELECT 열목록
-- FROM 테이블 
-- 쿼리끝에 ; 작성

-- Customers 테이블에서 모든 레코드(행)와 모들 필드(열)을 읽는다.
SELECT * FROM Customers;

-- 문제1) Employee 테이블에서 모든 행과 모든 열 읽기
SELECT * FROM Employee;

-- 작성 관습
-- 키워드는 대문자 테이블명, 컬럼명은 소문자 