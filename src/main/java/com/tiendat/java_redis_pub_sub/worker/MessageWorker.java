package com.tiendat.java_redis_pub_sub.worker;

import java.text.MessageFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.tiendat.java_redis_pub_sub.pub.MessagePublisher;

@Component
public class MessageWorker {
    
    private final MessagePublisher messagePublisher;

    public MessageWorker(MessagePublisher messagePublisher) {
        this.messagePublisher = messagePublisher;
    }

    @Scheduled(fixedDelay = 1000)
    public void publish() {
        messagePublisher.publish(MessageFormat.format("Alice: {0}", new Date().toString()));
        messagePublisher.publishAnother(MessageFormat.format("Bob: {0}", new Date().toString()));
    }

}
