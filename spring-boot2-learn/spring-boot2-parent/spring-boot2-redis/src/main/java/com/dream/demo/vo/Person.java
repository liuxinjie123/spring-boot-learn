package com.dream.demo.vo;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Person implements Serializable {
	private String id;
	private String name;
	private Integer age;

	public Person(String id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

}