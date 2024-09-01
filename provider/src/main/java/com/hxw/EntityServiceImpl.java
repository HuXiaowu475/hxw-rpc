package com.hxw;

import com.hxw.model.Entity;
import com.hxw.service.EntityService;

public class EntityServiceImpl implements EntityService {

    public Entity getEntity(Entity entity) {
        System.out.println("实体名称：" + entity.getName());
        return entity;
    }
}
