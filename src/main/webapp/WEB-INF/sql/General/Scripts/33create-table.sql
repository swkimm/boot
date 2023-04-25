CREATE TABLE MyTable12 ();

-- SHOW CREATE TABLE : 테이블 생성 명령 보기 
SHOW CREATE TABLE MyTable10;

CREATE TABLE `MyTable10` (
  `BookName` varchar(20) DEFAULT NULL,
  `Publish` varchar(30) DEFAULT NULL,
  `Writer` varchar(10) DEFAULT NULL,
  `Price` int(11) DEFAULT NULL,
  `PubDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci

-- 같은 컬럼명 타입으로 새로운 테이블 만들기
CREATE TABLE MyTable12 AS SELECT * FROM MyTable10;
DESC MyTable12;

SELECT * FROM MyTable12;