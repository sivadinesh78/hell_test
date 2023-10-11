package com.example.demo.sarvice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Dao.BankDao;
import com.example.demo.Entity.Bank;


@Service
public class BankSerivce {
@Autowired
BankDao bankDao;
@GetMapping(value="/listdata")
public String listBank(List<Bank> bank) {
	return bankDao.listBank(bank);
}
public String getBranchByIfccode(String branch) {
	return bankDao.getBranchByIfccode(branch);
}
}
