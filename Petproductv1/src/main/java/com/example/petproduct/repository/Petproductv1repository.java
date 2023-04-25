package com.example.petproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petproduct.model.Petproductv1model;

@Repository
public interface Petproductv1repository extends JpaRepository<Petproductv1model,Integer>
{

}
