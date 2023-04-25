CREATE DATABASE leetcode181;
use leetcode181;

DROP Table Employee;

CREATE TABLE Employee(
	id int PRIMARY KEY,
	name varchar(50),
	salary int,
	managerId int
);

INSERT INTO Employee Values (1, 'Joe', 70000, 3);
INSERT INTO Employee Values (2, 'Henry', 80000, 4);
INSERT INTO Employee Values (3, 'Sam', 60000, NULL);
INSERT INTO Employee Values (4, 'Max', 90000, NULL);

-- 문제) 매니저보다 많은 연봉을 받는 직원 이름 조회
SELECT *
FROM Employee e1 JOIN Employee e2 ;
SELECT *
FROM Employee e1 JOIN Employee e2 ON e1.managerId = e2.id;

SELECT e1.name `Employee`
FROM Employee e1 JOIN Employee e2 ON e1.managerId = e2.id
WHERE e1.salary > e2.salary;

-- 서브 쿼리
SELECT name
FROM Employee e1
WHERE salary > (SELECT salary
				FROM Employee e2
				WHERE e2.id = e1.managerId);