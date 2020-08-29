package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Value("${db.username}")
	private String dbUserName;

	@RequestMapping("/")
	public String index() {
		return "Hello Docker World. I'm running inside AWS Fargate and the Java Runtime version is " + System.getProperty("java.runtime.version") + " from "+ System.getProperty("java.vm.name") + " and my Java home is " + System.getProperty("java.home") + " and db.username is " + dbUserName;
	}

}