package com.md.demo.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class City implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String state;

	private String country;

}
