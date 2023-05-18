package com.example.demo.controller;

import java.time.*;
import java.util.*;

import org.apache.ibatis.type.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

import lombok.*;

@Controller
@RequestMapping("sub39")
public class Controller39 {

	@GetMapping("view")
	public void view() {

	}

	@GetMapping("link1")
	@ResponseBody
	public String method1() {
		return "hello ajax";
	}

	@GetMapping("link2")
	public ResponseEntity method2() {
		return ResponseEntity.badRequest().build();
	}

	@GetMapping("link3")
	public ResponseEntity method3() {
		return ResponseEntity.ok().build();
	}

	@GetMapping("link4")
	public ResponseEntity method4() {
		return ResponseEntity.internalServerError().build();
	}

	/*
	 * @GetMapping("link5") public ResponseEntity method5() { boolean ok =
	 * service.method(); if (ok) { return ResponseEntity.ok(); } else { return
	 * ResponseEntity.notFound().build(); } }
	 */

	@GetMapping("link9")
	@ResponseBody
	public String method9() {
		return "hello ajax!@!@";
	}

	@GetMapping("link10")
	@ResponseBody
	public String method10() {
		String time = LocalTime.now().toString();
		return time;
	}

	@GetMapping("link11")
	@ResponseBody
	public Map<String, Object> method11() {
		return Map.of("name", "채소연", "age", 10);
	}

	@Data
	static class Dto1 {
		public String address;
		public String city;
		public String phone;
		
		public Dto1(String address, String city, String phone) {
			super();
			this.address = address;
			this.city = city;
			this.phone = phone;
		}
		
	}

	@GetMapping("link12")
	@ResponseBody
	public Dto1 method12() {
		Dto1 dto = new Dto1("seoul", "seoul", "0101");
		return dto;
	}

	@GetMapping("link13")
	@ResponseBody
	public List<String> method13() {
		return List.of("강백호", "채치수", "송태섭");
	}
	
	@Autowired
	private Mapper02 mapper02;
	
	@GetMapping("link14")
	@ResponseBody
	public List<Dto08> method21(Integer cid) {
		return mapper02.sql7(cid);
	}
	
	
}


















