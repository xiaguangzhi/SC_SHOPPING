package com.iotek.common.controller;

import java.util.List;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
public interface QueryController<T> extends BaseQueryController<T> {
    List<T>  findAll(Object... parms);
}
