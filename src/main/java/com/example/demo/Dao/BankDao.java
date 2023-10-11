package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Bank;
import com.example.demo.repository.BankRepository;


@Repository
public class BankDao {
@Autowired
BankRepository bankrepo;
public String listBank(List<Bank> bank) {
	bankrepo.saveAll(bank);
	return "List of data update";
}
public String getBranchByIfccode(String branch) {
	return bankrepo.getBranchByIfccode(branch);
}
}
