package com.dhruvijariwala.bakerymarketplace.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dhruvijariwala.bakerymarketplace.beans.Artist;
import com.dhruvijariwala.bakerymarketplace.repositories.ArtistRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ArtistServiceImpl implements ArtistService {
	
	private ArtistRepository artistRepo;

	@Override
	public List<Artist> getAllArtists() {
		return artistRepo.findAll();
	}

	@Override
	public Artist getArtistById(Long id) {
//		return artistRepo.findById(id).get();
		Optional<Artist> artist = artistRepo.findById(id);
		if (artist.isPresent())
			return artist.get();
		else
			return null;
	}
	
	@Override
	public Artist addArtist(Artist artist) {
		artist.setId(null);
		return artistRepo.save(artist);
	}
}
