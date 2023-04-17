
SELECT * FROM Customers WHERE CustomerName LIKE 'A%';


SELECT * FROM Customers WHERE CustomerName LIKE '%A';

-- CustomerName 중에 or 가 포함된 고객들
SELECT * FROM Customers 
WHERE CustomerName LIKE '%or%';

-- CustomerName 중에 두번째 글자가 r인 고객들
SELECT * FROM Customers 
WHERE CustomerName LIKE '_r%';

-- CustomerName 중에 a로 시작해서 3글자 이상인 고객들
SELECT * FROM Customers 
WHERE CustomerName LIKE 'a_%_%';

-- CustomerName 중에 a로 시작해서 o로 끝나는 고객들
SELECT * FROM Customers 
WHERE ContactName LIKE 'a%o';

-- 고객명(CustomerName), 계약명(ContactName)에 'or'이 포함된 고객들 조회
SELECT * FROM Customers
WHERE CustomerName LIKE '%or%' OR  ContactName LIKE '%or%';