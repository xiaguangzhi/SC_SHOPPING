package com.iotek.common.service;

import java.util.List;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
public interface QueryService<T> extends BaseQueryService {
    List<T>  findAll(Object... parms);
}
