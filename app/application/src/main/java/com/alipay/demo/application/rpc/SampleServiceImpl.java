package com.alipay.demo.application.rpc;

import com.alipay.demo.facade.rpc.SampleService;
import com.alipay.sofa.rpc.api.annotation.RpcProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SOFA RPC 快速入门文档：https://yuque.antfin-inc.com/docs/share/0ef12166-f668-4c0c-8f3b-ee6b3dd68e11?# 《RPC5接入最佳实践》
 */
@RpcProvider
public class SampleServiceImpl implements SampleService {
    private static final Logger log = LoggerFactory.getLogger(SampleServiceImpl.class);

    @Override
    public String hello() {
        log.info("当前线程名为:{}", Thread.currentThread().getName());
        return "欢迎使用 SOFABoot!";
    }
}
