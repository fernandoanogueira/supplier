package com.nogueira.supplier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nogueira.supplier.model.Supplier;
import com.nogueira.supplier.repository.SupplierRepository;

@RestController
public class SupplierController {
	
	@Autowired
	private SupplierRepository repository;
	
	@GetMapping("/supplier/{id}")
	public ResponseEntity<Supplier> getSupplier(@PathVariable Long id) {
		Supplier supplier = repository.findById(id).orElse(null);
		if(supplier!=null)
			return ResponseEntity.ok(supplier);
		else
			return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/supplier")
	public void insertSupplier(@RequestBody Supplier supplier) {
		repository.save(supplier);
	}
	
	@DeleteMapping("/supplier/{id}")
	public void deleteSupplier(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@GetMapping("/supplier")
	public List<Supplier> getAllSuppliers() {
		return repository.findAll();
	}

}
