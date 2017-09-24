package com.codelete.shareboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.codelete.shareboot.StartSpringBootMain;

@SpringBootTest(classes = StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestRedis {
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	@Test 
	public void testGet() {
		System.out.println(this.redisTemplate.opsForValue().get("shareboot"));
	}
}
