package com.haina.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haina.ssm.service.TestService;

@Controller
public class TestController {
	@Autowired
	TestService ts;
	@RequestMapping("/test")
	public String test() {
		System.out.println("=================>控制器接收到请求");
		return "success";
	}
}
