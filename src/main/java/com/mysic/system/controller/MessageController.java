package com.mysic.system.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jianan
 * @Date
 */
@RefreshScope
@RestController
public class MessageController {

	@Value("${server.port}")
	String message;

	@Value("${foo}")
	String message1;

	@RequestMapping("/")
	String getMessage() {
		return this.message + " " + message1;
	}
}
