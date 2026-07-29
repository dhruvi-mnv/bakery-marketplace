package com.dhruvijariwala.bakerymarketplace.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dhruvijariwala.bakerymarketplace.beans.Cupcake;
import com.dhruvijariwala.bakerymarketplace.services.CupcakeService;

import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class CupcakeBootstrap implements CommandLineRunner {
	private CupcakeService cupcakeService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		cupcakeService.addCupcake(Cupcake.builder().name("Vanilla Bliss").price(3.5).qnty(10).empName("Sweet Crumbs").build());
	    cupcakeService.addCupcake(Cupcake.builder().name("Chocolate Dream").price(4.0).qnty(8).empName("The Cupcake Studio").build());
	    cupcakeService.addCupcake(Cupcake.builder().name("Red Velvet Delight").price(4.5).qnty(6).empName("Sugar & Sprinkles").build());
	    cupcakeService.addCupcake(Cupcake.builder().name("Strawberry Swirl").price(3.8).qnty(12).empName("Sweet Crumbs").build());
	    cupcakeService.addCupcake(Cupcake.builder().name("Caramel Crunch").price(4.2).qnty(7).empName("The Cupcake Studio").build());
	    cupcakeService.addCupcake(Cupcake.builder().name("Blueberry Burst").price(3.9).qnty(9).empName("Sugar & Sprinkles").build());
	    cupcakeService.addCupcake(Cupcake.builder().name("Lemon Zest").price(3.6).qnty(11).empName("Sweet Crumbs").build());
	    cupcakeService.addCupcake(Cupcake.builder().name("Mocha Magic").price(4.3).qnty(5).empName("The Cupcake Studio").build());
	    cupcakeService.addCupcake(Cupcake.builder().name("Cookies & Cream").price(4.6).qnty(4).empName("Sugar & Sprinkles").build());
	    cupcakeService.addCupcake(Cupcake.builder().name("Peanut Butter Bliss").price(4.1).qnty(6).empName("Sweet Crumbs").build());
	}

}
