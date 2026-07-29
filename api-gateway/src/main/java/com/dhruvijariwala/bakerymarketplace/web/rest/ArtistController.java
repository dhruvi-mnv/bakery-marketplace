package com.dhruvijariwala.bakerymarketplace.web.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dhruvijariwala.bakerymarketplace.beans.Artist;

@RestController
//@AllArgsConstructor
@RequestMapping("/api/v1/artists")
public class ArtistController {
	
	private static final String API_ADDRESS = "http://localhost:8081/api/v1/artists/";
	private RestTemplate rt = new RestTemplate();
	
	@GetMapping(value = {"/", ""})
    public List<Artist> getAllArtists() {
        Artist[] artists = rt.getForObject(API_ADDRESS, Artist[].class);
        return Arrays.asList(artists);
    }

    @GetMapping("/{id}")
    public Artist getArtistById(@PathVariable Long id) {
        return rt.getForObject(API_ADDRESS + id, Artist.class);
    }

    @PostMapping(value = {"/", ""}, consumes = "application/json")
    public Artist addArtist(@RequestBody Artist artist) {
        return rt.postForObject(API_ADDRESS, artist, Artist.class);
    }
	
}
