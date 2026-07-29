package com.dhruvijariwala.bakerymarketplace.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhruvijariwala.bakerymarketplace.beans.Artist;

@Service
public interface ArtistService {
	
	//Get - For All
	public List<Artist> getAllArtists();	
		
	//Get - For a single entity by ID
	public Artist getArtistById(Long id);
	
	//Add new Employee
	public Artist addArtist(Artist artist);
}
