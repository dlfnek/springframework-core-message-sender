package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class ServiceConfig {

    @Autowired
    private MainConfig mainConfig;

    @Bean
    public MessageService messageService1() {
        return new MessageService(mainConfig.smsMessageSender());
    }

    @Bean
    public MessageService messageService2() {
        return new MessageService(mainConfig.emailMessageSender());
    }
}
