package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Bank;
import com.example.demo.sarvice.BankSerivce;

@RestController
@RequestMapping("bank")
public class BankController {
@Autowired
BankSerivce banksrc;
@PostMapping(value="/listdata")
public String listBank(@RequestBody List<Bank> bank) {
	return banksrc.listBank(bank);
}
@GetMapping(value="/getbranchifccode/{branch}")
public String getBranchByIfccode(@PathVariable String branch) {
	return banksrc.getBranchByIfccode(branch);
}
}
