package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageService;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            MessageSender smsMessageSender = context.getBean("smsMessageSender", SmsMessageSender.class);
            MessageSender emailMessageSender = context.getBean("emailMessageSender", EmailMessageSender.class);

            new MessageService(smsMessageSender).doSendMessage();
            new MessageService(emailMessageSender).doSendMessage();
        }
//        String location = "classpath:/beans.xml";
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(location);
        // 굳이 try with resource문을 작성하지 않아도 됨.
    }
}
