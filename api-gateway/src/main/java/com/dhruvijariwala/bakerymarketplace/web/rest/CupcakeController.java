package com.dhruvijariwala.bakerymarketplace.web.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dhruvijariwala.bakerymarketplace.beans.Cupcake;

//import lombok.AllArgsConstructor;

@RestController
//@AllArgsConstructor
@RequestMapping("/api/v1/cupcakes")
public class CupcakeController {
	private static final String API_ADDRESS = "http://localhost:8082/api/v1/cupcakes/";
    private RestTemplate rt = new RestTemplate();

    @GetMapping(value = {"/", ""})
    public List<Cupcake> getAllCupcakes() {
        Cupcake[] cupcakes = rt.getForObject(API_ADDRESS, Cupcake[].class);
        return Arrays.asList(cupcakes);
    }

    @GetMapping("/{id}")
    public Cupcake getCupcakeById(@PathVariable Long id) {
        return rt.getForObject(API_ADDRESS + id, Cupcake.class);
    }

    @PostMapping(value = {"/", ""}, consumes = "application/json")
    public Cupcake addCupcake(@RequestBody Cupcake cupcake) {
        return rt.postForObject(API_ADDRESS, cupcake, Cupcake.class);
    }

    @PutMapping(value = "/{id}", consumes = "application/json")
    public Cupcake updateCupcakeById(@PathVariable Long id, @RequestBody Cupcake cupcake) {
        HttpEntity<Cupcake> request = new HttpEntity<>(cupcake);
        return rt.exchange(API_ADDRESS + id, HttpMethod.PUT, request, Cupcake.class).getBody();
    }

    @DeleteMapping("/{id}")
    public void deleteCupcakeById(@PathVariable Long id) {
        rt.delete(API_ADDRESS + id);
    }
}
