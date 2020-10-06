package com.minha.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minha.escola.model.Alunes;
import com.minha.escola.repository.AlunesRepository;

@RestController
@RequestMapping("/alunes")
@CrossOrigin("*")
public class AlunesController {
	
    @Autowired
	private AlunesRepository repository;
    
    @GetMapping
	public ResponseEntity<List<Alunes>> findAll() {
		return ResponseEntity.ok(repository.findAll());
	}
    
    @GetMapping("/{id}")
	public ResponseEntity<Alunes> GetById(@PathVariable Long id) {
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
		
	@PostMapping
	public ResponseEntity<Alunes> post(@RequestBody Alunes alunes) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(alunes));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Alunes> put(@PathVariable Long id, @RequestBody Alunes alunes) {
		alunes.setId(id);
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(alunes));
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
    

