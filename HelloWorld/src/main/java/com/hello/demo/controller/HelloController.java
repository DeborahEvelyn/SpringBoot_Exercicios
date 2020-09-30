package com.hello.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	@GetMapping ("/get1")
	public String Hello() {
		return "Hello World!\n"
				+ "As habilidades escolhidas foram: metalidade de crescimento, persistência "
				+ "e orientação ao detalhe";
				}
				
		
		@GetMapping ("/get2")
		public String Objetivos() {
			return "Aprender Spring Boot\n" +
		   "Assistir os vídeos"
					
		;
		
		}
	
}