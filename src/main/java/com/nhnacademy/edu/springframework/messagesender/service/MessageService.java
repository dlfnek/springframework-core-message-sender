package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

    private final MessageSender messageSender;

    @Value("${from}")
    private String name;

    public MessageService(@Qualifier("smsMessageSender") MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        System.out.println(name);
        messageSender.sendMessage(new User("sample@email.com", "010-1010-1010"), "메세지");
    }
}
