package com.example.chatgptbasedcookingingredients.controller;

import com.example.chatgptbasedcookingingredients.service.ChatGptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor

public class ChatGptController {

    private final ChatGptService chatGptService;

    @PostMapping
    public String chat(@RequestBody String message){
        return chatGptService.chatGpt(message);
    }
}
