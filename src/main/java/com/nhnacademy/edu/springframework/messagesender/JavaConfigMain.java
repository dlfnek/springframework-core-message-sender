package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageService;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        User user = new User("example@exam.com", "010-0101-0101");
        String message = "this is me!";
        // cast 메서드를 이용하면, MessageSender로 타입캐스팅 해줌.

        MessageSender sms = context.getBean(SmsMessageSender.class);
        sms.sendMessage(user, message);
    }
}
