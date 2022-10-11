package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSetterService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        MessageSetterService service = context.getBean("messageSetterService", MessageSetterService.class);
        service.doSendMessage();
    }
}
