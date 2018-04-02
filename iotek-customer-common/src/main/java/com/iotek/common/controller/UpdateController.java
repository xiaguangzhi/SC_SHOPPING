package com.iotek.common.controller;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
public interface UpdateController<T> {
    Object updateEntity(T t);
    Object deleteEntity(T t);
    Object addEntity(T t);

}
