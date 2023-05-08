use w3schools;

desc Bank;

CREATE TABLE Bank (
	name VARCHAR(10),
	money INT
);

INSERT INTO Bank (name, money) VALUES ('A', 100000);
INSERT INTO Bank (name, money) VALUES ('B', 100000);

SELECT * FROM Bank;
