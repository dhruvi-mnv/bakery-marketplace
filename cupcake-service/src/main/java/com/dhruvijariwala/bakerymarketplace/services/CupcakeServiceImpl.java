package com.dhruvijariwala.bakerymarketplace.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dhruvijariwala.bakerymarketplace.beans.Cupcake;
import com.dhruvijariwala.bakerymarketplace.repositories.CupcakeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CupcakeServiceImpl implements CupcakeService {

	private CupcakeRepository cupcakeRepo;
	
	@Override
	public List<Cupcake> getAllCupcakes() {
		return cupcakeRepo.findAll();
	}

	@Override
	public Cupcake getCupcakeById(Long id) {
		Optional<Cupcake> cupcake = cupcakeRepo.findById(id);
		if (cupcake.isPresent())
			return cupcake.get();
		else
			return null;
	}

	@Override
	public Cupcake addCupcake(Cupcake cupcake) {
		cupcake.setId(null);
		return cupcakeRepo.save(cupcake);
	}

	@Override
	public Cupcake updateCupcakeById(Long id, Cupcake cupcake) {
		if (cupcakeRepo.existsById(id)) {
	        cupcake.setId(id);
	        return cupcakeRepo.save(cupcake);
	    }
	    return null;
	}

	@Override
	public void deleteCupcakeById(Long id) {
		cupcakeRepo.deleteById(id);
	}

}
