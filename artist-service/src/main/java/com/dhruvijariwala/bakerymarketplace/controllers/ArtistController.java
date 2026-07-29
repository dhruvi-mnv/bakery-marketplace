package com.dhruvijariwala.bakerymarketplace.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhruvijariwala.bakerymarketplace.beans.Artist;
import com.dhruvijariwala.bakerymarketplace.services.ArtistService;

import lombok.AllArgsConstructor;

@RestController	
@RequestMapping("/api/v1/artists")
@AllArgsConstructor
public class ArtistController {
	
	private ArtistService artistService; 
	
	@GetMapping(value = {"/", ""})
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();
    }
	
	@GetMapping("/{id}")
    public Artist getArtistById(@PathVariable Long id) {
        return artistService.getArtistById(id);
    }

	@PostMapping(value = {"/", ""}, consumes = "application/json")
    public Artist addArtist(@RequestBody Artist artist) {
        return artistService.addArtist(artist);
    }

}
