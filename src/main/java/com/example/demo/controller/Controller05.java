package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub5")
public class Controller05 {
	
	// 경로 : /sub5/link1?name=강백호&age=33&score33.3
	@RequestMapping("link1")
	public void method1(@RequestParam("name") String name, 
						@RequestParam("age") int age, 
						@RequestParam("score") double score) {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
		
	}
	// 경로 : /sub5/link2?name=강백호&age=33&score33.3
	@RequestMapping("link2")
	public void method2(String name, int age, double score) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
	}
	
	// 경로 : /sub5/link3?address=seoul&height=170.7&width=39.1
	// method3 작성
	@RequestMapping("link3")
	public void method3(String address, double height, double width) {
		System.out.println(address);
		System.out.println(height);
		System.out.println(width);
		
		// 1.request param 얻기 가공 
		
		// 2. business logic
		
		// 3. add attribute
		
		// 4. forward redirect
	}
	
		
		
}
