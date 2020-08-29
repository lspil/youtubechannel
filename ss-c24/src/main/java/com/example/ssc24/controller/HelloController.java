package com.example.ssc24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	/*
	 ENDPOINT = PATH + HTTP METHOD

	 GET /hello
	 POST /hello
	 GET /ciao

	 */
	@GetMapping("/hello")
	public String hello() {
		return "Hello!";
	}

	@GetMapping("/ciao")
	public String ciao() {
		return "Ciao!";
	}

	@PostMapping("/hola")
	public String hola() {
		return "¡Hola!";
	}
}
