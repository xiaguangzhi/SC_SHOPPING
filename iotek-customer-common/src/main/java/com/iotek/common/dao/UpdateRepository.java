package com.iotek.common.dao;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
public interface UpdateRepository<T> {
    Object updateEntity(T t);
    Object deleteEntity(T t);
    Object addEntity(T t);

}
