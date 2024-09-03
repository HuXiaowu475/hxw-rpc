package com.hxw.config;

import com.hxw.fault.retry.RetryStrategyKeys;
import com.hxw.fault.tolerance.TolerantStrategyKeys;
import com.hxw.loadbalance.LoadBalancerKeys;
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

    private RegistryConfig registryConfig = new RegistryConfig();

    private String loadBalancer = LoadBalancerKeys.ROUND_ROBIN;

    private String retryStrategy = RetryStrategyKeys.NO;

    private String tolerantStrategy = TolerantStrategyKeys.FAIL_FAST;

}
