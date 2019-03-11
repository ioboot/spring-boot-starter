package com.ioboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author WuJK
 * @create 2019/3/11 22:25
 */
@SpringBootApplication
@Controller
public class HelloworldApplication {
	@GetMapping(value = "/")
	@ResponseBody
	public String index() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
}
