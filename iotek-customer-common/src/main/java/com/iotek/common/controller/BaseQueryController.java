package com.iotek.common.controller;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
public interface BaseQueryController<T>{
    T  findById(Long id);

}
