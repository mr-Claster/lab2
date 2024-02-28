package com.example.lab2.controller;

import com.example.lab2.model.Topic;

public interface TopicController {

    void update(String title, String content);

    Topic get();
}
