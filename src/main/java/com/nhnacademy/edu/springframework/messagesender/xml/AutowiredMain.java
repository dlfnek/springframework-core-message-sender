package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.service.MessageService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        MessageService service = context.getBean("messageService", MessageService.class);
        service.doSendMessage();
    }
}
