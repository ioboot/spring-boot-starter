package com.ioboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author WuJK
 * @create 2019/3/13 0:27
 */
@Component
public class StaticProperty {
	private static String staticId;

	@Value("${spring.custom.id4}")
	public void setStaticId(String staticId) {
		StaticProperty.staticId = staticId;
	}

	public String getStaticId() {
		return staticId;
	}
}
