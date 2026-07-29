package com.dhruvijariwala.bakerymarketplace.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Artist {
	private Long id;	
	private String name;
}
