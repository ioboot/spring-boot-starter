package com.ioboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author WuJK
 * @create 2019/3/13 0:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StaticPropertyTest {
	@Autowired
	StaticProperty staticProperty;

	@Test
	public void staticTest() {
		System.out.println(staticProperty.getStaticId());
	}
}