package com.kuvplus.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kuvplus.common.redis.RedisService;
public class redisTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
	    RedisService redisService = (RedisService) app.getBean("redisService");
	    

	       
	       /// Assert.assertEquals(1L, result);
	        redisService.set("a1", "a1");
	        String result = redisService.get("a1");
	        System.out.println("---"+result);
	}

}
