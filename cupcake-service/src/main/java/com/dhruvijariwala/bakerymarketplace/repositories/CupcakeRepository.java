package com.dhruvijariwala.bakerymarketplace.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhruvijariwala.bakerymarketplace.beans.Cupcake;

@Repository
public interface CupcakeRepository extends JpaRepository<Cupcake, Long>{
	public Optional<Cupcake> findById (Long id);
}
