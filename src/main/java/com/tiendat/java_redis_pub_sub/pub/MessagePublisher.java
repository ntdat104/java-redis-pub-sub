package com.tiendat.java_redis_pub_sub.pub;

public interface MessagePublisher {
    void publish(String message);
    void publishAnother(String message);
}
