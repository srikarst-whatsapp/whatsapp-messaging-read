package com.whatsapp.whatsappmessagingread.web;

import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.whatsapp.whatsappmessagingread.entity.ChatMessage;
import com.whatsapp.whatsappmessagingread.service.ChatMessageService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/chatmessage")
public class ChatMessageController {
    ChatMessageService chatMessageService;

    @GetMapping("/chat/{chatId}/page/{pageNumber}")
    public ResponseEntity<Slice<ChatMessage>> getChatMessages(@PathVariable String chatId,
            @RequestParam(defaultValue = "0") int pageNumber) {
        Slice<ChatMessage> chatMessages = chatMessageService.getChatMessages(chatId, pageNumber);
        return new ResponseEntity<>(chatMessages, HttpStatus.CREATED);
    }
}
