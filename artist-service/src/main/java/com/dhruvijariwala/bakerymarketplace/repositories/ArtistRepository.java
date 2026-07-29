package com.dhruvijariwala.bakerymarketplace.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhruvijariwala.bakerymarketplace.beans.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long>{

	public Optional<Artist> findById (Long id);

	//Artist findByName(String name);
	
}
