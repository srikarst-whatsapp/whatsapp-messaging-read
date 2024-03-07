package com.whatsapp.whatsappmessagingread.service;

import org.springframework.data.domain.Slice;

import com.whatsapp.whatsappmessagingread.entity.ChatMessage;

public interface ChatMessageService {
    Slice<ChatMessage> getChatMessages(String chatId, int pageNumber);
}
