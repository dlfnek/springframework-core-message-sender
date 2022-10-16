package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DoorayMessageMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        User user = new User("test", "test");
        String message = "기숙사 학식 최고!";

        MessageSender dooray = context.getBean("doorayMessageSender", MessageSender.class);
        dooray.sendMessage(user, message);

    }
}
