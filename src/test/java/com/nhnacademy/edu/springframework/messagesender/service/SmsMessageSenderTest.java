package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SmsMessageSenderTest {

    @InjectMocks
    private MessageService messageService;

    @Mock
    private MessageSender messageSender;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void sendMessage() {

        when(messageSender.sendMessage(any(User.class), any(String.class))).thenReturn(true);

        boolean actual = messageService.doSendMessage();

        Assertions.assertThat(actual).isEqualTo(true);
    }

//    @Test
//    void sendMessage() {
//        MessageSender mockSender = Mockito.mock(MessageSender.class);
//
//        MessageService mockMessageService = new MessageService(mockSender);
//        mockMessageService.doSendMessage();
//
//        Mockito.verify(mockSender, Mockito.times(1)).sendMessage(any(User.class), any(String.class));
//    }
}