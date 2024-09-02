package com.hxw.config;

import com.hxw.serializer.SerializerKeys;
import lombok.Data;

@Data
public class RpcConfig {

    private String name = "hxw-rpc";

    private String version = "1.0";

    private String serverHost = "localhost";

    private Integer serverPort = 8080;

    private boolean mock = false;

    private String serializer = SerializerKeys.JDK;



}
