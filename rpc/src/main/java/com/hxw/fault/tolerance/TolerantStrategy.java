package com.hxw.fault.tolerance;

import com.hxw.model.RpcResponse;

import java.util.Map;

public interface TolerantStrategy {

    /**
     * 容错
     *
     * @param context 上下文，用于传递数据
     * @param e       异常
     * @return
     */
    RpcResponse doTolerant(Map<String, Object> context, Exception e);
}

