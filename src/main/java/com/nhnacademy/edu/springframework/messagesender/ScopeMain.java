package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageService;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeMain {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            System.out.println("------------------------");
            new MessageService(context.getBean("smsMessageSender", SmsMessageSender.class)).doSendMessage();
            System.out.println("------------------------");
            new MessageService(context.getBean("emailMessageSender", EmailMessageSender.class)).doSendMessage();
            System.out.println("------------------------");
            new MessageService(context.getBean("smsMessageSender", SmsMessageSender.class)).doSendMessage();
            System.out.println("------------------------");
            new MessageService(context.getBean("emailMessageSender", EmailMessageSender.class)).doSendMessage();
            System.out.println("------------------------");
//            context.getBean("smsMessageSender",SmsMessageSender.class) // 이와 같이 출력할 수도 있음.
//                    .sendMessage(new User("exmaple@exam.com", "010-0000-0000"), "This is Message");
        }
    }
}
