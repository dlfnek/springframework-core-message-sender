package com.nhnacademy.edu.springframework.messagesender;

public class MessageService {

    private final MessageSender messageSender;

    public MessageService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        messageSender.sendMessage(new User("sample@email.com", "010-1010-1010"), "메세지");
    }
}
