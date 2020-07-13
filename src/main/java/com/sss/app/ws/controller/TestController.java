package com.sss.app.ws.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
//import com.splunk.logging.*;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.slf4j.*;

@RestController
@RequestMapping("test") // http://server:8080/test/
public class TestController {
	
	
	//Logger logger = LoggerFactory.getLogger(TestController.class);
	//private static final Logger logger = LogManager.getLogger(TestController.class);
	//private static final Logger logger = LogManager.getLogger(TestController.class);
	//Logger logger = org.apache.logging.log4j.core.LoggerContext.getLogger("splunk.logger");
	//Logger logger = LoggerFactory.getLogger("splunk.logger");
	Logger logger = LogManager.getLogger(TestController.class);
	
	
	@GetMapping
	//public String getTest(@PathVariable String id) throws Exception {
	public String getTest(@RequestParam(name="name", required = false, defaultValue = "Mark") String name,
						  @RequestParam(name="exc", required = false, defaultValue = "false") String exc) throws Exception {

		
		logger.info("foo bar log: " + exc);
		
		if (exc.equals("false")) {
			logger.info("The querystring parameter name was supplied as: " + name);
			logger.info("The querystring parameter exc was supplied as: " + exc);
			logger.debug(".... debug test ...");
			return "This is a test.....";
		} else {
			logger.info("The querystring parameter name was supplied as: " + name);
			logger.info("The querystring parameter exc was supplied as: " + exc);
			logger.debug(".... debug test ...");
			throw new Exception("Give me an exception please");
		}

	}

}
