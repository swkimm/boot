package com.example.demo.mapper;

import java.time.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper01 {
	
	@Select("""
			SELECT CustomerName
			FROM Customers
			WHERE CustomerID = 1
			""")
	String method1();
	
	@Select("""
			SELECT FirstName
			FROM Employees
			WHERE EmployeeID = 1;			
			""")
	String method2();
	
	@Select("""
			SELECT SupplierName
			FROM Suppliers
			WHERE SupplierID = 1;
			""")
	String method3();

	@Select("""
			SELECT CustomerName
			FROM Customers
			WHERE CustomerID = #{id};
			""")
	String method4(Integer id);
	
	
	@Select("""
			SELECT LastName
			FROM Employees
			WHERE EmployeeId = #{id};
			""")
	String method5(Integer id);

	@Select("""
			SELECT Price
			FROM MyTable33
			LIMIT 1
			""")
	String method6();
	
	@Select("""
			SELECT Weight
			FROM MyTable33
			LIMIT 1
			""")
	Double method7();
	
	@Select("SELECT Published FROM MyTable33 LIMIT 1")
	LocalDate method8();
	
	@Select("SELECT Updated FROM MyTable33 LIMIT 1")
	LocalDateTime method9();
	
	// 여러 데이터를 담아야 할 경우 자바 빈 사용
	@Select("SELECT Title, Published, Price, Updated, Weight FROM MyTable33 LIMIT 1")
	// 컬럼명과 (대소문자 구분 없이) 매치되는 빈의 프로퍼티명 
	Dto06 method10();
	
	@Select("SELECT Name, Age, Price, Birth, Inserted FROM MyTable32 LIMIT 1")
	Dto05 method11();
	
	@Select("""
			SELECT 
				CustomerId AS id,
				CustomerName AS name,
				ContactName,
				Address,
				City,
				PostalCode,
				Country
			FROM Customers
			WHERE CustomerId = 7
			""")
	Customer method12();
	
	@Select("""
			SELECT 
				SupplierId as id,
				SupplierName as name,
				ContactName,
				Address,
				City,
				PostalCode,
				Country,
				Phone
			FROM Suppliers
			WHERE SupplierId = 2;
			""")
	Supplier method13();
	
	@Select("""
			SELECT 
				EmployeeId id,
				LastName,
				FirstName,
				BirthDate,
				Photo,
				Notes
			FROM Employees
			WHERE EmployeeId = 3;
			""")
	Employee method14();
}






