package com.gf;

import com.gf.dao.IRedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    public static Logger logger = LoggerFactory.getLogger( SpringbootRedisApplicationTests.class );

    @Autowired
    private IRedisDao redisDao;

	@Test
	public void contextLoads() {
	}

    @Test
    public void test1(){
	    redisDao.setKey( "name" , "guofu" );
	    redisDao.setKey( "age" , "27");
	    logger.info( "name = " + redisDao.getVale( "name" ) );
        logger.info( "age = " + redisDao.getVale( "age" ) );
    }

}
