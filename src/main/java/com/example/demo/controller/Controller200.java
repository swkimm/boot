package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub100")
public class Controller200 {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.name}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;
	
	// 전체 조회 기능 
	
	// 검색(한개) 기능 
	
	// 검색 후 수정/삭제 기능 
	
	
	
}
