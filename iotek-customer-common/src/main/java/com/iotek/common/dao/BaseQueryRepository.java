package com.iotek.common.dao;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
public interface BaseQueryRepository<T>{
    T  findById(Long id);

}
