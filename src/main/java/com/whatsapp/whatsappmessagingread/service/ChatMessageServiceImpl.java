package com.whatsapp.whatsappmessagingread.service;

import com.whatsapp.whatsappmessagingread.entity.ChatMessage;
import com.whatsapp.whatsappmessagingread.repository.ChatMessageRepository;
import com.whatsapp.whatsappmessagingread.repository.ChatRepository;

import lombok.AllArgsConstructor;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ChatMessageServiceImpl implements ChatMessageService {
    ChatMessageRepository chatMessageRepository;
    ChatRepository chatRepository;

    public Slice<ChatMessage> getChatMessages(String chatId, int pageNumber) {
        @SuppressWarnings("null")
        Pageable firstPageWithTwoElements = PageRequest.of(pageNumber, 10, Sort.by("createdTimestamp").descending());
        Slice<ChatMessage> chatMessages = chatMessageRepository.findAllByChat(chatRepository.findById(chatId).get(),
                firstPageWithTwoElements);
        return chatMessages;
    }
}
