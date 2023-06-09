package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub12")
public class Controller12 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.name}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1() {
		String sql = """
				SELECT LastName FROM Employees
				""";
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {
				System.out.println(rs.next()); // true
				String name1 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next()); // true
				String name2 = rs.getString("lastName");
				System.out.println(name2);

				System.out.println(rs.next()); // true
				String name3 = rs.getString("lastName");
				System.out.println(name3);

				System.out.println(rs.next()); // true
				String name4 = rs.getString("lastName");
				System.out.println(name4);

				System.out.println(rs.next()); // true
				String name5 = rs.getString("lastName");
				System.out.println(name5);

				System.out.println(rs.next()); // true
				String name6 = rs.getString("lastName");
				System.out.println(name6);

				System.out.println(rs.next()); // true
				String name7 = rs.getString("lastName");
				System.out.println(name7);

				System.out.println(rs.next()); // true
				String name8 = rs.getString("lastName");
				System.out.println(name8);

				System.out.println(rs.next()); // true
				String name9 = rs.getString("lastName");
				System.out.println(name9);

				System.out.println(rs.next()); // false

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("link2")
	public void method2() {
		String sql = """
				SELECT LastName FROM Employees
				""";
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {
				while (rs.next()) {
					System.out.println(rs.getString("lastName"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// SELECT ShipperName FROM Shippers;
	// 경로 : link3
	@RequestMapping("link3")
	public void method3() {
		String sql = """
				SELECT ShipperName FROM Shippers
				""";
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {
				while (rs.next()) {
					System.out.println(rs.getString("shipperName"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link4")
	public void method4() {
		String sql = "SELECT * FROM Customers";

		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs) {
				rs.next();
				System.out.println(rs.getString("customerName"));
				System.out.println(rs.getString("contactName"));
				System.out.println(rs.getString("country"));

				rs.next();
				System.out.println(rs.getString("customerName"));
				System.out.println(rs.getString("contactName"));
				System.out.println(rs.getString("country"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link5")
	public void method5() {
		String sql = "SELECT * FROM Customers";
		int count = 1;

		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs) {
				while (rs.next()) {
					System.out.println(":::::::::::::::::::::::::");
					System.out.println(count);
					System.out.println("customerName : " + rs.getString("customerName"));
					System.out.println("contactName : " + rs.getString("contactName"));
					System.out.println("country : " + rs.getString("country"));
					count++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link6")
	public void method6() {
		String sql = "SELECT * FROM Products WHERE ProductID <= 3";

		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs) {
				while (rs.next()) {
					System.out.println(rs.getInt("productID"));
					System.out.println(rs.getString("ProductName"));
					System.out.println(rs.getDouble("Price"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// SELECT * FROM Customers WHERE CustomerID < 4
	// CustomerID는 int 타입으로 가져오기
	// CustomerName 은 String 타입으로 가져오기
	// 경로 link7
	@RequestMapping("link7")
	public void method7() {
		String sql = "SELECT * FROM Customers WHERE CustomerID < 4";

		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs) {
				while (rs.next()) {
					/*
					 * System.out.println(rs.getInt("customerID"));
					 * System.out.println(rs.getString("customerName"));
					 */
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(4));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link8")
	public void method8() {
		String sql = """
				SELECT LastName, FirstName
				FROM Employees
				WHERE EmployeeID < 4
				""";
		try {

			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs) {

				while (rs.next()) {
					String lastName = rs.getString(1);
					String firstName = rs.getString(2);

					System.out.println(lastName + "," + firstName);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("link9")
	public void method9(Model model) {
		// 고객테이블 조회 쿼리 작성
		// 나머지 코드들도 완성
		String sql = "SELECT CustomerID, CustomerName, Country FROM Customers";
		int customerID =0;
		String customerName = "";
		String country = "";
		
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try(con; stmt; rs) {
				while(rs.next()) {
					customerID = rs.getInt(1);
					customerName = rs.getString(2);
					country = rs.getString(3);
					System.out.println(customerID + "," + customerName + "," + country);
				}
				model.addAttribute("customerID", customerID);
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
