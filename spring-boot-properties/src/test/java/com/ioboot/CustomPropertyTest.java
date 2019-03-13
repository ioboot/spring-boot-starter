package com.ioboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author WuJK
 * @create 2019/3/13 0:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomPropertyTest {
	@Autowired
	CustomProperty customProperty;

	@Test
	public void customTest(){
		System.out.println(customProperty.getName());
		System.out.println(customProperty.getAddress());
	}
}