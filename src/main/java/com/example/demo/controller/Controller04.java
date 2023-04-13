package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub4")
public class Controller04 {
	// method argument(parameter)

	@RequestMapping("link1")
	public void method01(HttpServletRequest request) {

		// 1. request parameter 수집/가공
		String name = request.getParameter("name");
		String age = request.getParameter("age");

		System.out.println("name : " + name);
		System.out.println("age : " + age);

		// 2. business logic

		// 3. add attribute

		// 4. forward/redirect

	}

	// 경로 : /sub4/link2?address=seoul&email=korea@gmail.com
	// address, email 파라미터 출력하는 메소드 작성

	@RequestMapping("link2")
	public void method02(HttpServletRequest request) {
		// 1. request parameter 수집/가공
		String address = request.getParameter("address");
		String email = request.getParameter("email");

		System.out.println("address : " + address);
		System.out.println("email : " + email);
		// 2. business logic
		// 3. add attribute
		// 4. forward/redirect
	}

	// 경로 : /sub4/link3?address=seoul
	@RequestMapping("link3")
	public void method03(@RequestParam("address") String address) {
		System.out.println("address : " + address);
	}

	// 경로 : /sub4/link4?age=99
	@RequestMapping("link4")
	public void method04(@RequestParam("age") String age) {
		System.out.println("age : " + age);
		int myage = Integer.parseInt(age);

		System.out.println("int age : " + age);
	}

	// 경로 : /sub4/link5?score=80
	@RequestMapping("link5")
	public void method05(@RequestParam("score") int score) {
		System.out.println("score : " + score);
	}

	// 경로 : /sub4/link6?email=son@gmail.com
	@RequestMapping("link6")
	public void method6(@RequestParam String email) {
		System.out.println(email);
	}

	// 경로 : /sub4/link7?age=33
	@RequestMapping("link7")
	public void method7(@RequestParam int age) {
		System.out.println(age);
	}
	
	// 경로 : /sub4/link8?address=seoul
	@RequestMapping("link8")
	public void method8(String address) {
		System.out.println(address);
	}
	
	// 경로 : /sub4/link9?score=99.7
	@RequestMapping("link9")
	public void method9(float score) {
		System.out.println(score);
	}
}
