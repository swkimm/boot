package com.example.demo.controller;

import java.sql.*;
import java.sql.Date;
import java.time.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub19")
public class Controller19 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.name}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1() throws Exception {
		String sql = """
				INSERT INTO MyTable30 (Col1, Col2)
				VALUES (?,?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setInt(1, 99);
			pstmt.setString(2, "java");
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}
	}

	@RequestMapping("link2")
	public void method2() throws Exception {
		String sql = """
				INSERT INTO MyTable30 (Col1, Col2)
				VALUES (?,?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

//			pstmt.setInt(1, 99);
//			pstmt.setString(2, "java");
			pstmt.setString(1, "100");
			pstmt.setInt(2, 124);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}
	}

	@RequestMapping("link3")
	public void method3() throws Exception {
		String sql = """
				INSERT INTO MyTable31 (Col1, Col2)
				VALUES (?,?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setString(1, "1923-03-01");
			pstmt.setString(2, "1811-11-12 23:11:11");
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}
	}

	@RequestMapping("link4")
	public void method4() throws Exception {
		String sql = """
				INSERT INTO MyTable31 (Col1, Col2)
				VALUES (?,?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

//			pstmt.setString(1, "1923-03-01");
//			pstmt.setString(2, "1811-11-12 23:11:11");
			pstmt.setDate(1, Date.valueOf("2016-11-24"));
			pstmt.setTimestamp(2, Timestamp.valueOf("2000-01-01 11:11:11"));
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 입력됨");
		}
	}

	// 경로 /sub19/link5
	// MyTable32에 새 레코드 추가하는 메소드 완성
	@RequestMapping("link5")
	public String method5() throws Exception {
		String sql = """
				INSERT INTO MyTable32 (Name, Age, Price, Birth, Inserted)
				VALUES(?,?,?,?,?)
				""";

		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, "강백호");
			pstmt.setInt(2, 34);
			pstmt.setDouble(3, 99999.99);
			pstmt.setDate(4, Date.valueOf("1990-11-21"));
			pstmt.setTimestamp(5, Timestamp.valueOf("2023-04-20 09:45:11"));

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 삽입됨");
		}
		return "link5";
	}

	@RequestMapping("link6")
	public void method6() {

	}

	@RequestMapping("link7")
	public void method7(
			@RequestParam("name") String name,
			@RequestParam("age") String age,
			@RequestParam("price") String price,
			@RequestParam("birth") String birth,
			@RequestParam("inserted") String inserted) throws Exception {

		String sql = """
				INSERT INTO MyTable32 (Name, Age, Price, Birth, Inserted)
				VALUES (?, ?, ?, ?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, this.name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, name);
			pstmt.setString(2, age);
			pstmt.setString(3, price);
			pstmt.setString(4, birth);
			pstmt.setString(5, inserted);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 추가");
		}
	}

	@RequestMapping("link8")
	public void method8(
			@RequestParam("name") String name,
			@RequestParam("age") Integer age,
			@RequestParam("price") Double price,
			@RequestParam("birth") LocalDate birth,
			@RequestParam("inserted") LocalDateTime inserted) throws Exception {

		String sql = """
				INSERT INTO MyTable32 (Name, Age, Price, Birth, Inserted)
				VALUE(?, ?, ?, ?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, this.name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, price);
			pstmt.setDate(4, Date.valueOf(birth));
			pstmt.setTimestamp(5, Timestamp.valueOf(inserted));
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 추가");
		}
	}

	// method9 : form이 있는 view로 포워드
	// method10 : 전송된 데이터를 MyTable33에 추가
	@RequestMapping("link9")
	public void method9() {
	}

	@RequestMapping("link10")
	public void method10(
			@RequestParam("title") String title,
			@RequestParam("publised") LocalDate publised,
			@RequestParam("price") Integer price,
			@RequestParam("updated") LocalDateTime updated,
			@RequestParam("weight") double weight) throws Exception {

		String sql = """
				INSERT INTO MyTable33 (Title, Published, Price, Updated, Weight)
				VALUES (?, ?, ?, ?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, this.name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setString(1, title);
			pstmt.setDate(2, Date.valueOf(publised));
			pstmt.setInt(3, price);
			pstmt.setTimestamp(4, Timestamp.valueOf(updated));
			pstmt.setDouble(5, weight);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 추가");
		}
	}

	@RequestMapping("link11")
	public void method11() throws Exception {
		String sql = """
				SELECT Title, Published, Price, Updated, Weight
				FROM MyTable33
				""";
		try (
				Connection con = DriverManager.getConnection(url, this.name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			if (rs.next()) {
				String title = rs.getString("title");
				String published = rs.getString("published");
				String price = rs.getString("price");
				String updated = rs.getString("updated");
				String weight = rs.getString("weight");

				System.out.println("제목 : " + title);
				System.out.println("출간일 : " + published);
				System.out.println("가격 : " + price);
				System.out.println("수정일 : " + updated);
				System.out.println("무게 : " + weight);
			}
		}
	}

	@RequestMapping("link12")
	public void method12() throws Exception {
		String sql = """
				SELECT Title, Published, Price, Updated, Weight
				FROM MyTable33
				""";
		try (
				Connection con = DriverManager.getConnection(url, this.name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			if (rs.next()) {
				String title = rs.getString("title");
				LocalDate published = rs.getDate("published").toLocalDate();
				Integer price = rs.getInt("price");
				LocalDateTime updated = rs.getTimestamp("updated").toLocalDateTime();
				Double weight = rs.getDouble("weight");

				System.out.println("제목 : " + title);
				System.out.println("출간일 : " + published);
				System.out.println("가격 : " + price);
				System.out.println("수정일 : " + updated);
				System.out.println("무게 : " + weight);
			}
		}
	}

	// MyTable32의 데이터 조회 후 출력하는
	// 13번 메소드 작성
	@RequestMapping("link13")
	public void method13() throws Exception {
		String sql = """
				SELECT Name, Age, Price, Birth, Inserted
				FROM MyTable32
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				String name = rs.getString("name");
				Integer age = rs.getInt("age");
				Double price = rs.getDouble("price");
				LocalDate birth = rs.getDate("birth").toLocalDate();
				LocalDateTime inserted = rs.getTimestamp("inserted").toLocalDateTime();

				System.out.println(name);
				System.out.println(age);
				System.out.println(price);
				System.out.println(birth);
				System.out.println(inserted);
			}
		}
	}

	@RequestMapping("link14")
	public void method14(Model model) throws Exception {
		// 1. request param 수집/가공

		// 2. business logic (crud)
		String sql = """
				SELECT Name, Age, Price, Birth, Inserted
				FROM MyTable32
				""";
		List<Dto05> list = new ArrayList<>();
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				Dto05 o = new Dto05();
				o.setName(rs.getString("name"));
				o.setAge(rs.getInt("age"));
				o.setPrice(rs.getDouble("price"));
				o.setBirth(rs.getDate("birth").toLocalDate());
				o.setInserted(rs.getTimestamp("inserted").toLocalDateTime());
				
				list.add(o);
			}
			// 3. add attribute
			model.addAttribute("memberlist", list);

			// 4. forward/redirect
		}
	}
	
	// /sub19/link15
	// MyTable33에 있는 데이터들 jsp에서 보여주기
	// 메소드, java beans, jsp
	@RequestMapping("link15")
	public void method15(Model model) throws Exception  {
		String sql = """
				SELECT * FROM MyTable33
				""";
		List<Dto06> list = new ArrayList<>();
		
		try(
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);) {
			
			while(rs.next()) {
				Dto06 o = new Dto06();
				o.setTitle(rs.getString("title"));
				o.setPublished(rs.getDate("published").toLocalDate());
				o.setPrice(rs.getInt("price"));
				o.setUpdated(rs.getTimestamp("updated").toLocalDateTime());
				o.setWeight(rs.getDouble("weight"));
				
				list.add(o);
				model.addAttribute("booklist",list);
			}
		}
	}
}






















