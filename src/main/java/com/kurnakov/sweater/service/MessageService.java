package com.kurnakov.sweater.service;

import com.kurnakov.sweater.domain.Message;

import java.util.List;

public interface MessageService {

    void save(Message message);

    List<Message> findAll();
    List<Message> findByTag(String tag);

}
