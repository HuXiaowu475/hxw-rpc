package com.hxw;

import com.hxw.model.Entity;
import com.hxw.proxy.ServiceProxyFactory;
import com.hxw.service.EntityService;

public class ConsumerExample {

    public static void main(String[] args) {
        EntityService entityService = ServiceProxyFactory.getProxy(EntityService.class);
        Entity entity = new Entity();
        entity.setName("hxw");
        // 调用
        Entity newEntity = entityService.getEntity(entity);
        if (newEntity != null) {
            System.out.println(newEntity.getName());
        } else {
            System.out.println("user == null");
        }
    }

}
