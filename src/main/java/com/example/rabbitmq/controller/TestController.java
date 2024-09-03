package com.example.rabbitmq.controller;

import com.example.rabbitmq.service.TestService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class TestController {
    final TestService testService;

    @PostMapping("/send-message-your-gmail/{yourEmail}/{message}")
    public ResponseEntity<Void> test(@PathVariable("yourEmail") String email,
                                     @PathVariable("message") String message) {
        testService.sendMessage(email, message);
        return ResponseEntity.ok().build();
    }
}
