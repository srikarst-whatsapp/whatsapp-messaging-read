package com.whatsapp.whatsappmessagingread.repository;

import org.springframework.data.repository.CrudRepository;

import com.whatsapp.whatsappmessagingread.entity.ChatMessage;

public interface ChatMessageRepository extends CrudRepository<ChatMessage, String> {
}