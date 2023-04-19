package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub17")
public class Controller17 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.name}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	// ?id=34&name=Kim Seok Woon
	@RequestMapping("link1")
	public void method1(int id, String name) throws Exception {
		String sql = """
				UPDATE Suppliers
				SET
					SupplierName = ?
				WHERE SupplierId = ?
				""";

		try (
				Connection con = DriverManager.getConnection(url, this.name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setString(1, name);
			pstmt.setInt(2, id);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 수정됨");
		}
	}

	// ?id=62&address=seoul
	// supplierid가 62번인 공급자 주소(address)를 seoul로 바꾸는 메소드
	@RequestMapping("link2")
	public void method2(int id, String address) throws Exception {

		String sql = """
				UPDATE Suppliers
				SET
					Address = ?
				WHERE SupplierId = ?
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setString(1, address);
			pstmt.setInt(2, id);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 수정 완료");
		}
	}

	@RequestMapping("link3")
	public void method3(Supplier supplier) throws Exception {
		String sql = """
				UPDATE Suppliers
				SET
					SupplierName = ?,
					ContactName = ?,
					Address = ?,
					City = ?,
					PostalCode = ?,
					Country = ?,
					Phone = ?
				WHERE
					SupplierId = ?
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setString(1, supplier.getName());
			pstmt.setString(2, supplier.getContactName());
			pstmt.setString(3, supplier.getAddress());
			pstmt.setString(4, supplier.getCity());
			pstmt.setString(5, supplier.getPostalCode());
			pstmt.setString(6, supplier.getCountry());
			pstmt.setString(7, supplier.getName());
			pstmt.setInt(8, supplier.getId());

			int cnt = pstmt.executeUpdate();
			System.out.println(supplier.getId() + "번 공급자 수정됨");
		}
	}

	// /sub17/link4?id=37
	@RequestMapping("link4")
	public void method4(int id, Model model) throws Exception {
		String sql = """
				SELECT
					SupplierId,
					SupplierName,
					ContactName,
					Address,
					City,
					PostalCode,
					Country,
					Phone
				FROM Suppliers
				WHERE SupplierId = ?
				""";
		try (

				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				Supplier supplier = new Supplier();
				supplier.setId(rs.getInt("supplierId"));
				supplier.setName(rs.getString("supplierName"));
				supplier.setContactName(rs.getString("contactName"));
				supplier.setAddress(rs.getString("address"));
				supplier.setCity(rs.getString("city"));
				supplier.setPostalCode(rs.getString("postalCode"));
				supplier.setCountry(rs.getString("country"));
				supplier.setPhone(rs.getString("phone"));

				model.addAttribute("supplier", supplier);
			}
		}
	}

	// 고객 조회 (method4 참고)
	@RequestMapping("link5")
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

	// 고객 정보 수정 (method3 참고)
	@RequestMapping("link6")
	public void method6(Customer customer) throws Exception {
		String sql = """
				UPDATE Customers
				SET
					CustomerId = ?,
					CustomerName = ?,
					ContactName = ?,
					Address = ?,
					City =?,
					PostalCode = ?,
					Country =?
				WHERE CustomerId =?
				""";
		
		try(
			Connection con = DriverManager.getConnection(url, name, password);
			PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			pstmt.setInt(1, customer.getId());
			pstmt.setString(2, customer.getName());
			pstmt.setString(3, customer.getContactName());
			pstmt.setString(4, customer.getContactName());
			pstmt.setString(5, customer.getAddress());
			pstmt.setString(6, customer.getPostalCode());
			pstmt.setString(7, customer.getCountry());
			pstmt.setInt(8, customer.getId());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "번째 고객 수정됨");
		}
	}

}
