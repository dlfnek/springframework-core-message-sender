package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSetterService {

    private MessageSender smsMessageSender;
    private MessageSender emailMessageSender;

    public MessageSetterService(MessageSender messageSender) {
        this.smsMessageSender = messageSender;
    }

    public MessageSetterService() {
    }

    public void setSmsMessageSender(MessageSender smsMessageSender) {
        System.out.println("Set by smsMessageSender");
        this.smsMessageSender = smsMessageSender;
    }

    public void setEmailMessageSender(MessageSender emailMessageSender) {
        System.out.println("Set by emailMessageSender");
        this.emailMessageSender = emailMessageSender;
    }

    public void doSendMessage() {
        smsMessageSender.sendMessage(new User("sample@email.com", "010-1010-1010"), "메세지");
        emailMessageSender.sendMessage(new User("sample@email.com", "010-1010-1010"), "메세지");
    }
}
