package com.hxw;

import com.hxw.bootstrap.ProviderBootstrap;
import com.hxw.config.RegistryConfig;
import com.hxw.config.RpcConfig;
import com.hxw.model.Entity;
import com.hxw.model.ServiceMetaInfo;
import com.hxw.model.ServiceRegisterInfo;
import com.hxw.registry.LocalRegistry;
import com.hxw.registry.Registry;
import com.hxw.registry.RegistryFactory;
import com.hxw.server.HttpServer;
import com.hxw.server.VertxHttpServer;
import com.hxw.server.tcp.VertxTcpServer;
import com.hxw.service.EntityService;

import java.util.ArrayList;
import java.util.List;

public class ProviderExample {

    public static void main(String[] args) {
        // 要注册的服务
        List<ServiceRegisterInfo> serviceRegisterInfoList = new ArrayList<>();
        ServiceRegisterInfo serviceRegisterInfo = new ServiceRegisterInfo(EntityService.class.getName(), EntityServiceImpl.class);
        serviceRegisterInfoList.add(serviceRegisterInfo);

        // 服务提供者初始化
        //ProviderBootstrap.init(serviceRegisterInfoList);
        ProviderBootstrap.init((List<ServiceRegisterInfo<?>>) (List<?>) serviceRegisterInfoList);
    }
}


