package com.alipay.demo.infrastructure.msgbroker;

import com.alipay.msgbroker.client.entity.Message;
import com.alipay.msgbroker.client.subscriber.AsyncListenerContext;
import com.alipay.msgbroker.common.utils.StackTraceUtil;
import com.alipay.msgbroker.common.utils.ThreadFactoryImpl;
import com.alipay.sofa.common.thread.SofaThreadPoolExecutor;
import com.alipay.sofa.msgbroker.annotation.MsgBroker;
import com.alipay.sofa.msgbroker.annotation.MsgBrokerSubscriber;
import com.alipay.sofa.specs.annotation.msgbroker.ExchangeType;
import com.alipay.sofa.specs.annotation.msgbroker.MsgBrokerSubscriberSpec;
import com.alipay.sofa.specs.annotation.msgbroker.ZoneType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 通过注解方式订阅消息：https://yuque.antfin-inc.com/middleware/msgbroker/ggy5yr
 */
@MsgBroker
public class MsgBrokerConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(MsgBrokerConsumer.class);

    @MsgBrokerSubscriber(
            topic = "TP_DEFAULT_UNIFORM_EVENT",
            eventcode = "EC_SOFABOOT_TEST",
            groupId = "S_sofaboot_test",
            executor = "subscriberExecutor")
    @MsgBrokerSubscriberSpec(zoneType = ZoneType.GZone, exchangeType = ExchangeType.DIRECT, persistence = true)
    public void handleMessage(AsyncListenerContext context, Message<String> message) {
        LOG.info("<<<<<<<<<<<<<<<<<<<<<<< Handle message:[{}], payload :[{}], Stack:[{}]", message,
                message.getPayload(), StackTraceUtil.prettyPrintStackTrace());
        context.complete(true);
    }

    @Bean
    public SofaThreadPoolExecutor subscriberExecutor() {
        return new SofaThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(16),
                new ThreadFactoryImpl("SUBSCRIBER-"));
    }

}
