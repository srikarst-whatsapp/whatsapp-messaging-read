package com.whatsapp.whatsappmessagingread.service;

import com.whatsapp.whatsappmessagingread.entity.Chat;
import com.whatsapp.whatsappmessagingread.entity.ChatMessage;
import com.whatsapp.whatsappmessagingread.repository.ChatRepository;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ChatMessageServiceImpl implements ChatMessageService {
    ChatRepository chatRepository;

    public List<ChatMessage> getChatMessages(String chatId) {
        @SuppressWarnings("null")
        Chat chat = chatRepository.findById(chatId).get();
        return chat.getMessages();
    }
}
