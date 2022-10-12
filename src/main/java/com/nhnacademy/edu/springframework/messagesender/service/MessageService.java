package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.Annotation.Sms;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageService {

    private final MessageSender messageSender;

    @Autowired
    public MessageService(@Sms(dummy = true) MessageSender messageSender) {
        System.out.println("-----------construct call!!------------");
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        messageSender.sendMessage(new User("sample@email.com", "010-1010-1010"), "메세지");
    }
}
