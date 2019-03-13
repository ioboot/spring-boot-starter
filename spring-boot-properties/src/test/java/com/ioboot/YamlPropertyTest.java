package com.ioboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author WuJK
 * @create 2019/3/13 9:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class YamlPropertyTest {
	@Autowired
	YamlProperty yamlProperty;

	@Test
	public void yamlTest() {
		System.out.println(yamlProperty.getId());
	}
}