package com.example.demo.domain;

import lombok.*;

@Data
public class Customer {
	private int id;
	private String name;
	private String contactName;
	private String address;
	private String city;
	private String postalCode;
	private String country;
}
