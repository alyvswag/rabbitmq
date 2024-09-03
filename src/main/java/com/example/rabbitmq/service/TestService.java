package com.example.rabbitmq.service;

import com.example.rabbitmq.producer.EmailProducer;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class TestService {
    final EmailProducer emailProducer;

    public void sendMessage(String email,String message) {
        emailProducer.sendEmailMessage(email,message);
    }
}
