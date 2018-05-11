package com.gf.dao;

/**
 * <p>Title: IRedisDao</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author guofu
 * @version 1.0
 * @date 2018-04-01 12:07
 */
public interface IRedisDao {

    void setKey(String key,String value);

    String getVale(String key);
}
