package com.dhruvijariwala.bakerymarketplace.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dhruvijariwala.bakerymarketplace.beans.Artist;
import com.dhruvijariwala.bakerymarketplace.services.ArtistService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ArtistBootstrap implements CommandLineRunner{
	private ArtistService artistService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Artist a1 = Artist.builder().name("Sweet Crumbs").build();
        Artist a2 = Artist.builder().name("The Cupcake Studio").build();
        Artist a3 = Artist.builder().name("Sugar & Sprinkles").build();
        
        artistService.addArtist(a1);
        artistService.addArtist(a2);
        artistService.addArtist(a3);
	}
}
