package com.alipay.demo.application.rpc;

import com.alipay.sofa.lint.Example;
import com.alipay.demo.facade.rpc.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 本接口用于演示RPC服务调用
 */
@Example
@RestController
@RequestMapping("/example/rpc")
public class RpcSampleController {

    @Autowired
    @Qualifier(value = "rpcConsumer")
    private SampleService sampleService;

    @GetMapping
    public String helloRpc() {
        return sampleService.hello();
    }
}
