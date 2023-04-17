package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub13")
public class Controller13 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.name}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	// 고객 주소 추가
	// jsp에서 테이블 형식으로 보여주기
	public void method1(Model model) {
		String sql = """
				SELECT CustomerID, CustomerName, Address
				FROM Customers
				WHERE CustomerID
				""";
		List<Customer> obj = new ArrayList<>();

		// 1.
		// 2.
		try {

			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs) {

				while (rs.next()) {
					int id = rs.getInt("customerId");
					String name = rs.getString("customerName");
					String address = rs.getString("address");
					System.out.println(id + "," + name + "," + address);

					Customer customer = new Customer();
					customer.setId(id);
					customer.setName(name);
					customer.setAddress(address);
					obj.add(customer);
				}
				// 3. add attribute
				model.addAttribute("customerList", obj);
				// 4.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link2")
	public void method2(Model model) {
		String sql = """
				SELECT EmployeeId, LastName, FirstName
				FROM Employees
				""";
		// Employee 클래스 작성
		// 프로퍼티 (id(int), lastName(String), FirstName(String)
		// jsp 작성

		List<Employee> obj = new ArrayList<>();

		try {

			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs) {
				while (rs.next()) {
					int id = rs.getInt(1);
					String lastName = rs.getString(2);
					String firstname = rs.getString(3);

					Employee emp = new Employee();
					emp.setId(id);
					emp.setLastName(lastName);
					emp.setFirstName(firstname);
					obj.add(emp);
				}

				model.addAttribute("employeeList", obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 경로 : /sub13/link3?id=
	@RequestMapping("link3")
	public String method3(@RequestParam String id, Model model) throws Exception {
		String sql = """
				SELECT CustomerId, CustomerName, Address
				FROM Customers
				WHERE CustomerId = """;
		sql += id;

		List<Customer> list = new ArrayList<>();

		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		try (con; stmt; rs) {

			while (rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setAddress(rs.getString(3)); 

				list.add(customer);
			}
		}
		model.addAttribute("customerList", list);
		return "/sub13/link1";
	}
	// 경로 : /sub13/link4?id=
	@RequestMapping("link4")
	public String method4(@RequestParam String id, Model model) throws Exception {
		String sql = """
				SELECT CustomerId, CustomerName, Address
				FROM Customers
				WHERE CustomerId = ?""";
		
		List<Customer> list = new ArrayList<>();

		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();

		try (con; stmt; rs) {

			while (rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setAddress(rs.getString(3)); 

				list.add(customer);
			}
		}
		model.addAttribute("customerList", list);
		return "/sub13/link1";
	}
	
	// /sub13/link5?id=3
	@RequestMapping("link5")
	public String method5(@RequestParam String id, Model model) throws Exception {
		// 사용자에게 직원 id 입력 받아서 
		// 쿼리 완성하고 실행 후에 
		// /sub13/link2로 포워드해서 직원 1명 정보출력 
		String sql = """
				SELECT EmployeeId, lastName, firstName
				FROM Employees WHERE EmployeeId =?
				""";
		List<Employee> list = new ArrayList<>();
		
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		try(con; pstmt; rs) {
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("EmployeeId"));
				emp.setLastName(rs.getString("lastName"));
				emp.setFirstName(rs.getString("firstName"));
				
				list.add(emp);
			}
			model.addAttribute("employeeList", list);
		}
		return "/sub13/link2";
	}
}



