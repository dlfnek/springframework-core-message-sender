package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String[] args) {
        new MessageService(new EmailMessageSender()).doSendMessage();
        new MessageService(new SmsMessageSender()).doSendMessage();
    }
}