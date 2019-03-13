package com.ioboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author WuJK
 * @create 2019/3/13 9:40
 */
@Component
public class YamlProperty {
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Value("${yaml.custom.id}")
	private String id;
}
