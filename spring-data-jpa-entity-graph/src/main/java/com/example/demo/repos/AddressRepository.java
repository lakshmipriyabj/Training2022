package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

	@EntityGraph(attributePaths = {"user","city"},type =    EntityGraph.EntityGraphType.LOAD)
    List<Address> findAll();
//	@EntityGraph(attributePaths = {"city"},type =    EntityGraph.EntityGraphType.FETCH)
//  List<Address> findAll();
	

}
