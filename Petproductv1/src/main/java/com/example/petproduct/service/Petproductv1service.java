package com.example.petproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petproduct.model.Petproductv1model;
import com.example.petproduct.repository.Petproductv1repository;

@Service
public class Petproductv1service {

	@Autowired
	Petproductv1repository petrepository;

	public List<Petproductv1model> getAllPetproductv1model() 
	{
		List<Petproductv1model> petList=petrepository.findAll();
		return petList;
	}
	
	public Petproductv1model savePetproductv1model(Petproductv1model m)
	{
		Petproductv1model obj=petrepository.save(m);
		return obj;
	}
	
	public Petproductv1model updatePetproductv1model(Petproductv1model m)
	{
		Petproductv1model obj=petrepository.save(m);
		return obj;
	}
	
	public void deletePetproductv1model(int id)
	{
		petrepository.deleteById(id);
	}
	
//	public Petproductv1model getPetproductv1model(String name)
//	{
//		Petproductv1model m=petrepository.findById(name).get();
//		return m;
//	}
}
