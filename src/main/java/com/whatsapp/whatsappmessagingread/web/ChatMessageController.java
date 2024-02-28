package com.whatsapp.whatsappmessagingread.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatsapp.whatsappmessagingread.entity.ChatMessage;
import com.whatsapp.whatsappmessagingread.service.ChatMessageService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/chatmessage")
public class ChatMessageController {
    ChatMessageService chatMessageService;

    @GetMapping("/chat/{chatId}")
    public ResponseEntity<List<ChatMessage>> getChatMessages(@PathVariable String chatId) {
        List<ChatMessage> chatMessages = chatMessageService.getChatMessages(chatId);
        return new ResponseEntity<>(chatMessages, HttpStatus.CREATED);
    }
}
