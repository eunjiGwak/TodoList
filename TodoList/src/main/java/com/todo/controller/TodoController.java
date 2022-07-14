package com.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todolist")
public class TodoController {

	@GetMapping("/main")
	public String index() {
		
		return "index";
	}
	
}
