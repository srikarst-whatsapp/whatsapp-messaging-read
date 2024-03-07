package com.whatsapp.whatsappmessagingread.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;

import com.whatsapp.whatsappmessagingread.entity.Chat;
import com.whatsapp.whatsappmessagingread.entity.ChatMessage;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, String> {
    public Slice<ChatMessage> findAllByChat(Chat chat, Pageable pageable);
}