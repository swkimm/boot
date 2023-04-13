package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controller01 {

	@RequestMapping("/sub1/link1")
	public void method01() {
		System.out.println("일함!@!@");
	}
	
	@RequestMapping("/sub1/link2")
	public void method02() {
		System.out.println("/sub1/link2경로에서 일하는 메소드");
	}
	
	@RequestMapping("/sub1/link3")
	public void method03() {
		System.out.println("/sub1/link3 경로에서 일하는 메소드");
	}


}
