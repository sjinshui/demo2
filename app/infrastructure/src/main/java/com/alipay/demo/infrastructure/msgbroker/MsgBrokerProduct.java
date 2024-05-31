package com.alipay.demo.infrastructure.msgbroker;

import com.alipay.msgbroker.client.entity.Message;
import com.alipay.msgbroker.client.exception.MsgBrokerClientException;
import com.alipay.msgbroker.client.publisher.PublishResult;
import com.alipay.msgbroker.client.publisher.Publisher;
import com.alipay.sofa.msgbroker.annotation.MsgBroker;
import com.alipay.sofa.msgbroker.annotation.MsgBrokerPublisher;
import com.alipay.sofa.specs.annotation.msgbroker.MsgBrokerPublisherSpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 通过注解方式发送消息：https://yuque.antfin-inc.com/middleware/msgbroker/ggy5yr
 */
@MsgBroker
public class MsgBrokerProduct {

    private static final Logger LOG = LoggerFactory.getLogger(MsgBrokerProduct.class);

    @MsgBrokerPublisher(
            topic = "TP_DEFAULT_UNIFORM_EVENT",
            eventcode = "EC_SOFABOOT_TEST",
            groupId = "P_sofaboot_test")
    @MsgBrokerPublisherSpec(description = "消息发送者描述")
    private Publisher<String> publisher;

    /**
     * Sends a message using MsgBroker client.
     */
    public void sendMessage(String messageToSend) {
        final Message<String> hello = publisher.messageBuilder().withPayload(messageToSend).build();

        try {
            final PublishResult result = publisher.publish(hello);
            LOG.info(">>>>>>>>>>>>>>>>>>>>>>> Publish message:[{}]", result);
        } catch (MsgBrokerClientException e) {
            LOG.error("Failed to publish message:[{}]", hello, e);
        }
    }

}
