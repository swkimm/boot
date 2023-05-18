use Board;
SELECT * FROM Board;
SELECT * FROM Member;

UPDATE Board SET Writer = '111';


ALTER TABLE Board 
ADD FOREIGN KEY (writer) REFERENCES Member(id);

-- 권한 테이블
CREATE TABLE MemberAuthority (
	memberId VARCHAR(20) NOT NULL,
	authority VARCHAR(30) NOT NULL,
	FOREIGN KEY (memberId) REFERENCES Member(id),
	PRIMARY KEY (memberId, authority)
);

Drop Table MemberAuthority ;

SELECT * FROM MemberAuthority;

INSERT INTO MemberAuthority 
VALUES ('admin0', 'admin');


SELECT * FROM Member m LEFT JOIN MemberAuthority ma ON m.id = ma.memberId
WHERE m.id = 'admin0';

ALTER TABLE Board
ADD hit INT NOT NULL DEFAULT 0;

SELECT * FROM Board
ORDER BY inserted DESC;







