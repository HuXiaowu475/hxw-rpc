package com.hxw;

import com.hxw.model.Entity;
import com.hxw.registry.LocalRegistry;
import com.hxw.server.HttpServer;
import com.hxw.server.VertxHttpServer;
import com.hxw.service.EntityService;

public class ProviderExample {
    public static void main(String[] args) {

        RpcApplication.init();

        LocalRegistry.register(EntityService.class.getName(), EntityServiceImpl.class);
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
