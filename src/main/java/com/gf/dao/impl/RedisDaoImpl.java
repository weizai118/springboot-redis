package com.gf.dao.impl;

import com.gf.dao.IRedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * <p>Title: RedisDaoImpl</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author guofu
 * @version 1.0
 * @date 2018-04-01 12:09
 */
@Repository
public class RedisDaoImpl implements IRedisDao {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public void setKey(String key, String value) {
        redisTemplate.opsForValue().set( key , value , 2 , TimeUnit.MINUTES); // 设置1分钟过期
    }

    @Override
    public String getVale(String key) {

        return redisTemplate.opsForValue().get( key );
    }
}
