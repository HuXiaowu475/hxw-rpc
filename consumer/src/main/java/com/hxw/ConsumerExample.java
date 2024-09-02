package com.hxw;

import com.hxw.config.RpcConfig;
import com.hxw.model.Entity;
import com.hxw.proxy.ServiceProxyFactory;
import com.hxw.service.EntityService;
import com.hxw.utils.ConfigUtils;

public class ConsumerExample {

    public static void main(String[] args) {

        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class, "rpc");
        System.out.println(rpc);


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
        long number = entityService.getNumber();
        System.out.println(number);

    }

}
