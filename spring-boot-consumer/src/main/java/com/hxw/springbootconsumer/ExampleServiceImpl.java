package com.hxw.springbootconsumer;

import com.hxw.model.Entity;
import com.hxw.service.EntityService;
import com.hxw.springboot.starter.annotation.RpcReference;
import org.springframework.stereotype.Service;



@Service
public class ExampleServiceImpl {

    @RpcReference
    private EntityService entityService;

    public void test() {
        Entity entity = new Entity();
        entity.setName("hxw");
        Entity resultEntity = entityService.getEntity(entity);
        System.out.println(resultEntity.getName());
    }

}
