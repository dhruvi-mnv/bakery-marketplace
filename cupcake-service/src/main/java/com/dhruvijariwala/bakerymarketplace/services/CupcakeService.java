package com.dhruvijariwala.bakerymarketplace.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhruvijariwala.bakerymarketplace.beans.Cupcake;

@Service
public interface CupcakeService {

	//get all
	public List<Cupcake> getAllCupcakes();
	//get by id
	public Cupcake getCupcakeById(Long id);	
	//add
	public Cupcake addCupcake(Cupcake cupcake);
	//edit by id
	public Cupcake updateCupcakeById(Long id, Cupcake cupcake);
	//delete by id 
	public void deleteCupcakeById(Long id);
}
