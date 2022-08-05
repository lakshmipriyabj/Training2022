package com.example.demo.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.DonarDetail;

public interface DonarDetailRepository extends JpaRepository<DonarDetail,Integer> {
	
	List<DonarDetail> findByBloodGroup(String grp);
	
	List<DonarDetail> findByLocation(String grp);
	
	DonarDetail saveOrUpdate(DonarDetail entity);
	
}
