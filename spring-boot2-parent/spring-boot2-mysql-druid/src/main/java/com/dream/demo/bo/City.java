package com.dream.demo.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class City implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String state;

	private String country;

	private LocalDateTime createTime;

}
