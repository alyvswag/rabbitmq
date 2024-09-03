package com.example.rabbitmq.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class EmailService {
    final  JavaMailSender javaMailSender;
    public void sendMail(String email,String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("support@domain.com");
        message.setTo(email);
        message.setText(text); // mail body
        message.setSubject("Gizli Mesaj"); // mail header
        javaMailSender.send(message);
    }

}
