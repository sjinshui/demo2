package com.alipay.demo.infrastructure.mobilegw;

import com.alipay.mobilegw.adapterservice.annotation.OperationType;

/**
 * 通过 {@link OperationType} 注解发布移动网关接口
 */
public interface MobilegwSampleService {

    @OperationType(value = "com.alipay.hello", name = "hello", desc = "hello")
    String hello();
}
