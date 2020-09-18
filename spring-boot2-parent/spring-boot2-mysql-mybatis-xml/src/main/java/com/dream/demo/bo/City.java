package com.dream.demo.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class City implements Serializable {
	private Long id;

	private String name;

	private String state;

	private String country;

	private LocalDateTime createTime;

}
