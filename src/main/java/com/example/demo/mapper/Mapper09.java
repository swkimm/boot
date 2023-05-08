package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper09 {

	// 동적 SQL foreach문

	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			WHERE country IN (

				<foreach collection="elems" item="elem" separator=", ">
					#{elem}
				</foreach>
			)
			</script>
			""")
	Integer sql1(List<String> elems);

	@Select("""
			<script>
			SELECT 
				SupplierId id,
				SupplierName name,
				ContactName,
				Address,
				City,
				PostalCode,
				Country,
				Phone
			FROM Suppliers
			<where>  
				<if test="elems != null">
				Country IN (
				<foreach collection="elems" item="country" separator=", " >
					#{country}
				</foreach>
				)
				</if>
			</where>
			</script>
			""")
	List<Supplier> sql2(List<String> elems);
	
	
}
