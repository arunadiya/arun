package com.example.petproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.petproduct.model.Petproductv1model;
import com.example.petproduct.service.Petproductv1service;

@RestController
public class Petproductv1controller 
{

	@Autowired
	Petproductv1service petservice;
	
	@GetMapping(value="/fetchPetproductv1")
	public List<Petproductv1model> getAllPetproductv1()
	{
		List<Petproductv1model> petList=petservice.getAllPetproductv1model();
		return petList;
	}
	
	@PostMapping(value="/savePetproductv1")
	public Petproductv1model savePetproductv1(@RequestBody Petproductv1model m)
	{
		return petservice.savePetproductv1model(m);
	}
	
	@PutMapping(value="/updatePetproductv1")
	public Petproductv1model savePetproductv1model(@RequestBody Petproductv1model m)
	{
		return petservice.savePetproductv1model(m);
	}
	
	@DeleteMapping(value="/deletePetproductv1/{id}")
	public void deletePetproductv1(@PathVariable("id") int id)
	{
		petservice.deletePetproductv1model(id);
	}
	
//	@GetMapping(value="/getPetproductv1")
//	public Petproductv1model getPetproductv1(@PathVariable("nme") String name)
//	{
//		return petservice.getPetproductv1(name);
//	}
	
	@GetMapping("/sortPetproductv1model/{field}")
    public List<Petproductv1model> sortPetproductv1model(@PathVariable String field)
    {
	   return petservice.sortPetproductv1model(field);
    }
	
	@GetMapping("/pagingAndSortingPetproductv1model/{offset}/{pageSize}/{field}")
    public List<Petproductv1model> pagingAndSortingEmployees(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field) 
    {
	    return petservice.pagingAndSortingEmployees(offset, pageSize, field);
    }
}
