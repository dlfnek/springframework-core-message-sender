package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageService;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        User user = new User("신한국", "신한국");
        String message = "기숙사 학식 맛있어요...";
        // cast 메서드를 이용하면, MessageSender로 타입캐스팅 해줌.

        // interface로 구현된 객체를 Join point로 설정할 경우, Proxy가 생성될 때, interface 객체로 생성이 됨.
        // 그래서 역공변성이 발생하면서 타입 에러가 발생하게 된다. 이를 해결하려면 CGLib 방식으로 동작시키거나, interface 객체를 통해서 객체를 생성해내야한다.
        MessageSender sms = context.getBean("smsMessageSender", MessageSender.class);
        sms.sendMessage(user, message);
    }
}
