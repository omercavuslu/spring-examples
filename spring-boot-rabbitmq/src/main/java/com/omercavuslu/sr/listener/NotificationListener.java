package com.omercavuslu.sr.listener;

import com.omercavuslu.sr.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "omer-cavuslu-queue")//doğrusu application.properties den okumak
    public void handleMessage(Notification notification){
        System.out.println("Message Received..");
        System.out.println(notification.toString());
    }
}
