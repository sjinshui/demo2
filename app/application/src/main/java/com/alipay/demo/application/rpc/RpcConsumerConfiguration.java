package com.alipay.demo.application.rpc;

import com.alipay.demo.facade.rpc.SampleService;
import com.alipay.sofa.rpc.api.annotation.RpcConsumer;
import org.springframework.context.annotation.Configuration;

/**
 * SOFA RPC 快速入门文档：https://yuque.antfin-inc.com/docs/share/0ef12166-f668-4c0c-8f3b-ee6b3dd68e11?# 《RPC5接入最佳实践》
 */
@Configuration
public class RpcConsumerConfiguration {

    @RpcConsumer(value = "rpcConsumer", directUrl = "127.0.0.1:12200")
    private SampleService sampleService; //NOPMD
}