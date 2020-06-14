package com.example.dtoservice2products.controller;

import com.example.dtoservice2products.dto.Invoice;
import com.example.dtoservice2products.dto.Product;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductsController {

    @PostMapping("/test")
    public void test(@RequestBody Product p) {
        RestTemplate rest = new RestTemplate();

        HttpEntity<Product> body =
                new HttpEntity<>(p);

        ResponseEntity<Invoice> response =
                rest.postForEntity("http://localhost:9090/invoice",
                        body, Invoice.class);

        System.out.println(response.getBody()); // not null
    }
}
