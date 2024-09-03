package com.hxw;

import com.hxw.bootstrap.ConsumerBootstrap;
import com.hxw.config.RpcConfig;
import com.hxw.model.Entity;
import com.hxw.proxy.ServiceProxyFactory;
import com.hxw.service.EntityService;
import com.hxw.utils.ConfigUtils;
import io.etcd.jetcd.api.User;

public class ConsumerExample {

    public static void main(String[] args) {
        // 服务提供者初始化
        ConsumerBootstrap.init();

        // 获取代理
        EntityService userService = ServiceProxyFactory.getProxy(EntityService.class);
        Entity entity = new Entity();
        entity.setName("hxw");
        // 调用
        Entity newEntity = userService.getEntity(entity);
        if (newEntity != null) {
            System.out.println(newEntity.getName());
        } else {
            System.out.println("entity == null");
        }
    }
}
