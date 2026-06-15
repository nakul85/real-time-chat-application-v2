package com.nakul.chatapp.controller;

import com.nakul.chatapp.dto.ChatMessage;
import com.nakul.chatapp.entity.Message;
import com.nakul.chatapp.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@Controller
@RequiredArgsConstructor
public class ChatController {

    private final SimpMessagingTemplate messagingTemplate;
    private final MessageRepository messageRepository;

    @MessageMapping("/send")
    public void sendMessage(ChatMessage chatMessage) {

        Message message = new Message();
        message.setSender(chatMessage.getSender());
        message.setReceiver(chatMessage.getReceiver());
        message.setContent(chatMessage.getContent());
        message.setTimestamp(LocalDateTime.now());

        messageRepository.save(message);

        messagingTemplate.convertAndSendToUser(
                chatMessage.getReceiver(),
                "/queue/messages",
                chatMessage
        );
    }
}