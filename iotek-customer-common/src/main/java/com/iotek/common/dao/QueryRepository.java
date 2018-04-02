package com.iotek.common.dao;

import java.util.List;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
public interface QueryRepository<T> extends BaseQueryRepository{
    List<T>  findAll(Object... parms);
}
