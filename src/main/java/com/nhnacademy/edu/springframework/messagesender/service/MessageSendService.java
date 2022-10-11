package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {

    private final MessageSender smsMessageSender;
    private final MessageSender emailMessageSender;

    public MessageSendService(MessageSender smsMessageSender, MessageSender emailMessageSender) {
        this.smsMessageSender = smsMessageSender;
        this.emailMessageSender = emailMessageSender;
    }

    public void doSendMessage() {
        // 안예쁨.. 코드를 한 줄로 줄이려면 파라미터에 user와 message를 받고, main 메서드에서 user와 메세지를 생성해서 주입시켜주면 예쁨.
        smsMessageSender.sendMessage(new User("sample@email.com", "010-1010-1010"), "메세지");
        emailMessageSender.sendMessage(new User("sample@email.com", "010-1010-1010"), "메세지");
    }
}
