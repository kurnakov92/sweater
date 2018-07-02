package com.kurnakov.sweater.service;

import com.kurnakov.sweater.domain.Message;
import com.kurnakov.sweater.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    private MessageRepository repository;

    @Override
    public void save(Message message) {
        repository.save(message);
    }

    @Override
    public List<Message> findAll() {
        return (List<Message>) repository.findAll();
    }

    @Override
    public List<Message> findByTag(String tag) {
        return repository.findByTag(tag);
    }


}
