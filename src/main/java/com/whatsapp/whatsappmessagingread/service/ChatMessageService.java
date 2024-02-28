package com.whatsapp.whatsappmessagingread.service;

import java.util.List;

import com.whatsapp.whatsappmessagingread.entity.ChatMessage;

public interface ChatMessageService {
    List<ChatMessage> getChatMessages(String chatId);
}
