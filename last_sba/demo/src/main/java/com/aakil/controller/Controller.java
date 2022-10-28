package com.aakil.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	
	@RequestMapping
	public String sendWelcome () {
		
		return " Welcome to Jenkins";
	}
	
	@RequestMapping(path="name/{name}")
	public String sendName(@PathVariable("name")String name) {
		
		return "Welcome " + name;
	}
}
