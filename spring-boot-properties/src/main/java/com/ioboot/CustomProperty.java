package com.ioboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author WuJK
 * @create 2019/3/12 23:59
 */
@Component
@ConfigurationProperties(prefix = "ioboot.identity")
public class CustomProperty {
	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
