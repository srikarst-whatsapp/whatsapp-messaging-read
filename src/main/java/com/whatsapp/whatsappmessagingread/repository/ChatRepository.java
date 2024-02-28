package com.whatsapp.whatsappmessagingread.repository;

import org.springframework.data.repository.CrudRepository;

import com.whatsapp.whatsappmessagingread.entity.Chat;

public interface ChatRepository extends CrudRepository<Chat, String> {
}