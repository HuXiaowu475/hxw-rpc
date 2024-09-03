package com.hxw.springbootprovider;

import com.hxw.model.Entity;
import com.hxw.service.EntityService;
import com.hxw.springboot.starter.annotation.RpcService;
import org.springframework.stereotype.Service;

@Service
@RpcService
public class EntityServiceImpl implements EntityService {

    public Entity getEntity(Entity entity) {
        System.out.println("实体名：" + entity.getName());
        return entity;
    }
}
