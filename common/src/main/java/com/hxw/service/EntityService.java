package com.hxw.service;

import com.hxw.model.Entity;

public interface EntityService {

    Entity getEntity (Entity entity);

    default short getNumber() {
        return 1;
    }

}
