package com.haina.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haina.ssm.bean.Department;
import com.haina.ssm.dao.DepartmentMapper;


@Service
public class TestService {
	@Autowired
	public DepartmentMapper dm;
	
	public void test() {
		Department dept = dm.test(1);
		System.out.println("===============>"+dept);
	}


}
