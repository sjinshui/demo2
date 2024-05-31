package com.alipay.demo.infrastructure.scheduler;

import com.alipay.antschedulerclient.serverless.model.ServerlessSimpleJobExecuteContext;
import com.alipay.antschedulerclient.serverless.result.ServerlessCommonResult;
import com.alipay.sofa.serverless.runtime.api.event.annotation.Func;
import com.alipay.sofa.serverless.runtime.api.event.annotation.Ingress;
import com.alipay.sofa.serverless.runtime.api.event.annotation.Scheduler;
import com.alipay.sofa.specs.annotation.scheduler.SchedulerTaskSpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * AntScheduler 快速入门文档：https://yuque.antfin-inc.com/docs/share/52027207-fd9a-426d-82ef-c127cec08cb7?# 《配置注解化快速入门》
 */
@Scheduler(name = "DEMO_SIMPLE_SERVERLESS_TASK")
@SchedulerTaskSpec(cron = "*/5 * * * * ?")
@Component
public class SimpleServerlessTaskSample {
    private static final Logger log = LoggerFactory.getLogger(SimpleServerlessTaskSample.class);

    @Ingress
    @Func
    public ServerlessCommonResult execute(ServerlessSimpleJobExecuteContext context) {
        //在这里添加您的业务逻辑
        log.info("简单任务执行成功!");
        //失败时调用.buildFailResult("false");
        return ServerlessCommonResult.buildSuccessResult();
    }
}
