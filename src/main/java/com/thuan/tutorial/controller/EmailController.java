package com.thuan.tutorial.controller;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@RequestMapping(value = "/sendemail")
	public ResponseEntity<Object> sendEmail() {
		HashMap<String, String> map = new HashMap<>();
		map.put("thuan", "send email success");
		return new ResponseEntity<Object>(map, HttpStatus.OK);
	}
}