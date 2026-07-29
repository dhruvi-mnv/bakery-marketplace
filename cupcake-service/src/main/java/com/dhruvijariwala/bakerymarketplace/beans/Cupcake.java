package com.dhruvijariwala.bakerymarketplace.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@AllArgsConstructor 
@Data
@Entity
@Builder
public class Cupcake {
	@Id													
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private Double price;
	@NonNull
	private Integer qnty;
	@NonNull 
	private String empName;
}
