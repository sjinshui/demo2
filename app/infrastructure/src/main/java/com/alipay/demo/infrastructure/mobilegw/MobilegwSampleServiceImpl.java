package com.alipay.demo.infrastructure.mobilegw;

import org.springframework.stereotype.Component;

@Component
public class MobilegwSampleServiceImpl implements MobilegwSampleService{

    @Override
    public String hello() {
        return "Hello SOFA Stack";
    }
}
