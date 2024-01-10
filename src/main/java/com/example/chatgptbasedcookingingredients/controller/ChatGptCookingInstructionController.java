package com.example.chatgptbasedcookingingredients.controller;

import com.example.chatgptbasedcookingingredients.service.ChatGptCookingService;
import com.example.chatgptbasedcookingingredients.service.ChatGptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cooking")
@RequiredArgsConstructor
public class ChatGptCookingInstructionController {

    private final ChatGptCookingService chatGptCookingService;

    @PostMapping
    public String cooking(@RequestBody List<String> messages){
        return chatGptCookingService.chatGptCooking(messages);
    }
}
