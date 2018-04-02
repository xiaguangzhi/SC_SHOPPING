package com.iotek.common.po;

import java.io.Serializable;

/**
 * Created by xiaohuang on 2018/3/31.
 * ----------------The heart withered--------
 */
public class Entity implements Serializable {
    private Long  id;

    public Entity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

