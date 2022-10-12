package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean(initMethod = "init")
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }

    @Bean(destroyMethod = "")
    public MessageSender emailMessageSender() {
        return new EmailMessageSender();
    }
}
