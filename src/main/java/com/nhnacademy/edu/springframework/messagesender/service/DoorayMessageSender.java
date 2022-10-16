package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component("doorayMessageSender")
@PropertySource("classpath:/api.properties")
public class DoorayMessageSender implements MessageSender {

    String name;
    String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public DoorayMessageSender(@Value("${name}")String name, @Value("${url}")String url) {
        this.name = name;
        this.url = url;
        System.out.println("doorayMessageSender is created!");
    }

    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println("DoorayMessage send!");
        new DoorayHookSender(new RestTemplate(), this.url)
                .send(DoorayHook.builder()
                        .botName(this.name)
                        .text(message)
                        .build());
        return true;
    }
}
