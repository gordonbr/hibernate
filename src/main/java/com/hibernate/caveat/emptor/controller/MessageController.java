package com.hibernate.caveat.emptor.controller;

import com.hibernate.caveat.emptor.model.Message;
import com.hibernate.caveat.emptor.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    private MessageRepository messageRepository;

    @Autowired
    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping("/message/{id}")
    Message getMessage(@PathVariable Long id) {
        return messageRepository.findById(id).orElse(new Message());
    }

    @GetMapping("/messages")
    Iterable<Message> getMessages() {
        return messageRepository.findAll();
    }

    @PutMapping("/message")
    void putMessage(@RequestBody String text) {
        Message message = new Message();
        message.setText(text);
        messageRepository.save(message);
    }

}
