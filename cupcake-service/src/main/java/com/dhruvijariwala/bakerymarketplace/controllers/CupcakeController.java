package com.dhruvijariwala.bakerymarketplace.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhruvijariwala.bakerymarketplace.beans.Cupcake;
import com.dhruvijariwala.bakerymarketplace.services.CupcakeService;

import lombok.AllArgsConstructor;

@RestController	
@RequestMapping("/api/v1/cupcakes")
@AllArgsConstructor
public class CupcakeController {
	
	private CupcakeService cupcakeService;
	
	@GetMapping(value = {"/", ""})
    public List<Cupcake> getAllCupcakes() {
        return cupcakeService.getAllCupcakes();
    }
	
	@GetMapping("/{id}")
    public Cupcake getCupcakeById(@PathVariable Long id) {
        return cupcakeService.getCupcakeById(id);
    }

	@PostMapping(value = {"/", ""}, consumes = "application/json")
    public Cupcake addCupcake(@RequestBody Cupcake cupcake) {
        return cupcakeService.addCupcake(cupcake);
    }
	
	@PutMapping(value="/{id}", consumes = "application/json")
	public Cupcake updateCupcakeById(@PathVariable Long id, @RequestBody Cupcake cupcake) {
	    return cupcakeService.updateCupcakeById(id, cupcake);
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteCupcakeById(@PathVariable Long id ) {
		cupcakeService.deleteCupcakeById(id);
	}

}
