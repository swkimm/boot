package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub100")
public class Controller100 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.name}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;
	
	@RequestMapping("view")
	public void customerSelect(Model model) throws Exception {
		String sql = """
				SELECT 
					CustomerId,
					CustomerName,
					ContactName,
					Address,
					City,
					PostalCode,
					Country
				   FROM Customers
								""";
		List<Customer> list = new ArrayList<>();
		try(
			Connection con = DriverManager.getConnection(url, name, password);
			PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Customer c = new Customer();
				c.setId(rs.getInt("customerId"));
				c.setName(rs.getString("customerName"));
				c.setContactName(rs.getString("contactName"));
				c.setAddress(rs.getString("address"));
				c.setCity(rs.getString("city"));
				c.setPostalCode(rs.getString("postalCode"));
				c.setCountry(rs.getString("country"));
				
				list.add(c);
			}
			model.addAttribute("customer", list);
		}
	}
	
	@RequestMapping("search")
	public void method5(int id, Model model) throws Exception {
		String sql = """
				SELECT
					*
				FROM Customers
				WHERE CustomerId = ?
				""";
		try (
			Connection con = DriverManager.getConnection(url, name, password);
			PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				Customer c = new Customer();
				c.setId(rs.getInt("customerId"));
				c.setName(rs.getString("customerName"));
				c.setContactName(rs.getString("contactName"));
				c.setAddress(rs.getString("address"));
				c.setCity(rs.getString("city"));
				c.setPostalCode(rs.getString("postalCode"));
				c.setCountry(rs.getString("country"));
				
				model.addAttribute("customer", c);
			}

		}
	}

	
	@RequestMapping("update") 
	public void customerUpdate (Customer customer) throws Exception {
		String sql = """
				UPDATE Customers
				SET 
					CustomerId =?,
					CustomerName =?,
					ContactName = ?,
					Address =?,
					City = ?,
					PostalCode = ?,
					Country = ?
				WHERE 
					CustomerId = ?
				""";
		
		try(
			Connection con = DriverManager.getConnection(url, name, password);
			PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			pstmt.setInt(1, customer.getId());
			pstmt.setString(2, customer.getName());
			pstmt.setString(3, customer.getContactName());
			pstmt.setString(4, customer.getAddress());
			pstmt.setString(5, customer.getCity());
			pstmt.setString(6, customer.getPostalCode());
			pstmt.setString(7, customer.getCountry());
			pstmt.setInt(8, customer.getId());
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"번째 고객 수정");
		}
	}
}
