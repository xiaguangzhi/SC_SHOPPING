package com.iotek.common.service;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
public interface UpdateService<T> {
    Object updateEntity(T t);
    Object deleteEntity(T t);
    Object addEntity(T t);

}
