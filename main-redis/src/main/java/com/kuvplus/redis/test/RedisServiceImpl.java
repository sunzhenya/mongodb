package com.kuvplus.redis.test;

import java.io.UnsupportedEncodingException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service(value = "redisService")
public class RedisServiceImpl implements RedisService {

       private RedisServiceImpl() {

    }

    @Autowired
    private RedisTemplate redisTemplate;

	public long del(String keys) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void set(byte[] key, byte[] value, long liveTime) {
		// TODO Auto-generated method stub
		
	}

	public void set(String key, String value, long liveTime) {
		// TODO Auto-generated method stub
		
	}

	public void set(String key, String value) {
		// TODO Auto-generated method stub
		
	}

	public void set(byte[] key, byte[] value) {
		// TODO Auto-generated method stub
		
	}

	public String get(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set keys(String pattern) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean exists(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	public String flushDB() {
		// TODO Auto-generated method stub
		return null;
	}

	public long dbSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String ping() {
		// TODO Auto-generated method stub
        return (String) redisTemplate.execute(new RedisCallback() {
            public String doInRedis(RedisConnection connection) throws DataAccessException {
                return connection.ping();
            }
        });
    }
}