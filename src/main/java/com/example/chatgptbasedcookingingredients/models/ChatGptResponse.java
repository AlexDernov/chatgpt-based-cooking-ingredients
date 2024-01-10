package com.example.chatgptbasedcookingingredients.models;

import java.util.List;

public record ChatGptResponse(
        String id,
        List<ChatGptChoice> choices
) {
}
