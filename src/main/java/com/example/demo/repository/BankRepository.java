package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {
	@Query(value = "select ifccode from bankdata where branch like ?", nativeQuery = true)
	String getBranchByIfccode(String branch);

}
