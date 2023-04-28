package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper07 {

	// Dynamic SQL(동적 SQL) Bind 연습
	@Select("""
			<script>
			<bind name="pattern" value="'%' + keyword + '%'"/>
			SELECT
				CustomerId id,
				CustomerName name,
				ContactName,
				Address
			FROM
				Customers
			WHERE 
				CustomerName LIKE #{pattern}
			ORDER BY id DESC
			</script>
			""")
	List<Customer> sql1(String keyword);
	
	@Select("""
			<script>
			<bind name="pattern" value="'%' + keyword + '%'" />
			SELECT
				EmployeeId id,
				FirstName,
				LastName
			FROM Employees
			WHERE 
				FirstName LIKE #{pattern} OR LastName LIKE #{pattern}
			</script>
			""")
	List<Employee> sql2(String keyword);

	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			<if test="false">
			WHERE CustomerID = 10
			</if>
			</script>
			""")
	Integer sql3();

	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			<if test="keyword neq null">
				<bind name="pattern" value="'%' + keyword + '%'" />
				WHERE CustomerName LIKE #{pattern}
			</if>
			</script>
			""")
	Integer sql4(String keyword);
	
	@Select("""
			<script>
			SELECT AVG(Price)
			FROM Products
			<if test="cId neq 0">
				WHERE CategoryId = #{cId}
			</if>
			</script>
			""")
	Double sql5(int cId);
	
}










