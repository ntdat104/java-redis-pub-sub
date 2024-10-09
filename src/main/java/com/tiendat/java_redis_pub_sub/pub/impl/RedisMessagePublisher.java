package com.tiendat.java_redis_pub_sub.pub.impl;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

import com.tiendat.java_redis_pub_sub.pub.MessagePublisher;

@Service
public class RedisMessagePublisher implements MessagePublisher {

    private final RedisTemplate<String, Object> redisTemplate;
    private final ChannelTopic topic;
    private final ChannelTopic anotherTopic;

    public RedisMessagePublisher(RedisTemplate<String, Object> redisTemplate, ChannelTopic topic, ChannelTopic anotherTopic) {
        this.redisTemplate = redisTemplate;
        this.topic = topic;
        this.anotherTopic = anotherTopic;
    }

    @Override
    public void publish(String message) {
        redisTemplate.convertAndSend(topic.getTopic(), message);
    }

    @Override
    public void publishAnother(String message) {
        redisTemplate.convertAndSend(anotherTopic.getTopic(), message);
    }
    
}
