package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");

        MessageSendService service = context.getBean("messageSendService", MessageSendService.class);
        service.doSendMessage();
    }
}
