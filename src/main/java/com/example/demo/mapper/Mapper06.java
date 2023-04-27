package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper06 {

	@Select("""
			SELECT 
				customerId id,
				customerName name,
				contactName,
				address
			FROM Customers
			ORDER BY CustomerId DESC
			LIMIT #{startIndex} , 20 
			""")
	List<Customer> listCustomer(Integer startIndex);
}