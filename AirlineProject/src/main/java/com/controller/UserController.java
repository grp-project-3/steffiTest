package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserService;
import com.model.User;

@RestController
public class UserController {
@Autowired
UserService service;
@RequestMapping("/")
public String getMessage() {
	return "Hello World";
}

}
