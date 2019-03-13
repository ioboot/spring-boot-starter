package com.ioboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author WuJK
 * @create 2019/3/13 0:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultPropertyTest {
	@Autowired
	DefaultProperty defaultProperty;

	@Test
	public void defaultTest() {
		System.out.println(defaultProperty.getUrl());
		System.out.println(defaultProperty.getUsername());
		System.out.println(defaultProperty.getPassword());
		System.out.println(defaultProperty.getDriverClassName());
	}
}