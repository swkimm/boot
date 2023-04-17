package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub14")
public class Controller14 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.name}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	// 추가 업무 : ContactName에도 키워드 조회 추가 

	
	// /sub14/link1?keyword=or
	@RequestMapping("link1")
	public String method1(String keyword, Model model) throws Exception {
		String sql = """
				SELECT CustomerID, CustomerName, Address, ContactName
				FROM Customers
				WHERE CustomerName LIKE ? OR ContactName LIKE ?
				""";
		List<Customer> list = new ArrayList<>();

		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "%" + keyword + "%");
		pstmt.setString(2, "%" + keyword + "%");
		ResultSet rs = pstmt.executeQuery();

		try (con; pstmt; rs) {

			while (rs.next()) {
				Customer c = new Customer();
				c.setId(rs.getInt("customerId"));
				c.setName(rs.getString("customerName"));
				c.setAddress(rs.getString("address"));
				c.setContactName(rs.getString("contactName"));
				list.add(c);
			}

		}
		model.addAttribute("customerList", list);

		return "/sub13/link1";
	}
}
