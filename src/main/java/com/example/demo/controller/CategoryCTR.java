package com.example.demo.controller;

import java.net.http.HttpClient.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("category")
public class CategoryCTR {

	@Autowired
	private CategoryDAO mapper;

	// 전체 조회
	@RequestMapping("readAll")
	public void readAll(Model model) {
		List<CategoryDTO> list = mapper.readAll();
		model.addAttribute("categoryList", list);
	}

	// get
	@RequestMapping("addMenu")
	public void addMenu() {

	}

	// post
	// 메뉴 추가
	@RequestMapping("insertMenu")
	public String insertMenu(@ModelAttribute CategoryDTO dto) {
		int cnt = mapper.insertMenu(dto);
		System.out.println(cnt + "개 행 추가됨");
		return "redirect:/category/readAll";
	}

	@RequestMapping("deleteMenu")
	public void deleteMenu() {

	}

	@RequestMapping("removeMenu")
	public String removeMenu(@RequestParam Integer id) {
		int cnt = mapper.removeMenu(id);
		System.out.println(cnt + "개 행 삭제됨");

		return "redirect:/category/readAll";
	}

}
