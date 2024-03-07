package com.whatsapp.whatsappmessagingread.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whatsapp.whatsappmessagingread.entity.Chat;

public interface ChatRepository extends JpaRepository<Chat, String> {
}