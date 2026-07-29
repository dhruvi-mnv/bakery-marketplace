package com.dhruvijariwala.bakerymarketplace.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Cupcake {

	private Long id;
	private String name;
	private Double price;
	private Integer qnty;
	private String empName;
	
}
