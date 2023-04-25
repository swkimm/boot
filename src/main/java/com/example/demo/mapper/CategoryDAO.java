package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface CategoryDAO {
	
	@Select("""
			SELECT CategoryID, CategoryName, Description
			FROM Categories
			""")
	List<CategoryDTO> readAll(); 
	
	@Insert("""
			INSERT INTO Categories (CategoryID, CategoryName, Description)
			VALUES (#{categoryId}, #{categoryName}, #{description})
			""")
	int insertMenu(CategoryDTO dto);
	
	
	@Delete("""
	        DELETE 
	        FROM Categories
	        WHERE CategoryID = #{id}
	        """)
	int removeMenu(Integer id);
}
