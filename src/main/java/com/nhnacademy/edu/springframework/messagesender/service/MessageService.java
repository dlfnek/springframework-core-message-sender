package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

    private final MessageSender messageSender;

    public MessageService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public MessageService(MessageSender messageSender, String name) {
        System.out.println(name);
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        messageSender.sendMessage(new User("sample@email.com", "010-1010-1010"), "메세지");
    }
}
