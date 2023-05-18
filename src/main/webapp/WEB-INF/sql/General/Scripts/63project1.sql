USE Board;
DESC Member;

SELECT * FROM Member;

-- 패스워드 암호화하기

CREATE DATABASE Security;
use Security;
DROP Database Security;

create user 'cos'@'%' identified by 'cos1234';
GRANT ALL PRIVILEGES ON *.* TO 'cos'@'%';
create database security;
use security;

