package com.haina.ssm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haina.ssm.bean.Employee;
import com.haina.ssm.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	@RequestMapping("/allEmployee")
	public String getAllEmployee(Map<String, Object> map) {
		List<Employee> list = empService.getAllEmployee();
		map.put("empList", list);
	return "list";
}
}
