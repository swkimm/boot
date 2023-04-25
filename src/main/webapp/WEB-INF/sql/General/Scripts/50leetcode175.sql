CREATE DATABASE leetcode175;
use leetcode175;

create table Person (
	personId INT PRIMARY KEY,
	lastName VARCHAR(200),
	firstName VARCHAR(200)
);

INSERT INTO Person VALUES (1, 'Wang', 'Allen');
INSERT INTO Person VALUES (2, 'Alice', 'Bob');

SELECT * FROM Person;

CREATE Table Address (
	addressId INT Primary KEY,
	personId INT,
	city VARCHAR(200),
	state VARCHAR(200)
);

INSERT INTO Address VALUES (1, 2, 'New York City', 'New York');
INSERT INTO Address VALUES (2, 3, 'Leetcode', 'California');

-- 문제) 각 인물의 firstName, lastName, city, state를 조회 
-- 하는 쿼리 작성, 주소가 없으면 city, state에 null로 
SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p left JOIN Address a ON p.PersonId = a.PersonId
Order by 1;

SELECT * FROM Address;

SELECT * FROM Person;
SELECT p.firstName, p.lastName, (SELECT city FROM Address a WHERE a.personId = p.personId) city, (SELECT state FROM Address a WHERE a.personId = p.personId) state FROM Person p;































