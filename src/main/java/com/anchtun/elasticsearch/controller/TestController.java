package com.anchtun.elasticsearch.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("elsticsearch")
@RestController
@Slf4j
public class TestController {

	@GetMapping("/")
	public String HomePage() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Welcome to the Home page, the Local Time is: " + localDateTime);
		return "Welcome to the Home page";
	}

	@GetMapping("/logs")
	public String LogsPage() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Welcome to the Logs page, the Local Time is: " + localDateTime);
		return "Welcome to the Logs page";
	}

	@GetMapping("/warn")
	public String WarnPage() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.warn("Welcome to the Warning page, the Local Time is: " + localDateTime);
		return "Welcome to the Warning page";
	}

	@GetMapping("/err")
	public String ErrorPage() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.error("Welcome to the Error page, the Local Time is: " + localDateTime);
		return "Welcome to the Error page";
	}
}
