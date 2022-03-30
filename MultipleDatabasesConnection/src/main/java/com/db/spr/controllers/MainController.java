package com.db.spr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.db.spr.primary.Employee;
import com.db.spr.primary.EmployeeRepository;
import com.db.spr.secondary.Manager;
import com.db.spr.secondary.ManagerRepository;

@RestController
public class MainController {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ManagerRepository managerRepository;

	@RequestMapping(value = "/primary", method = RequestMethod.GET)
	public List<Employee> getPrimaryDatabaseData() {
		List<Employee> list = employeeRepository.findAll();
		return list;
	}

	@RequestMapping(value = "/secondary", method = RequestMethod.GET)
	public List<Manager> getSecondaryDatabaseData() {
		List<Manager> list = managerRepository.findAll();
		return list;
	}
}
