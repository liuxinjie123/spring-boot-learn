package com.md.demo.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class City implements Serializable {
	private Long id;

	private String name;

	private String state;

	private String country;

}
