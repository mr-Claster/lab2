package com.example.lab2.controller.impl;

import com.example.lab2.controller.TopicController;
import com.example.lab2.model.Topic;
import com.example.lab2.view.ViewInterface;

public class TopicControllerImpl implements TopicController {
    private Topic topic;
    private ViewInterface view;

    public TopicControllerImpl(Topic topic, ViewInterface view) {
        this.topic = topic;
        this.view = view;
    }

    public void update(String title, String content) {
        topic.setTitle(title);
        topic.setContent(content);
    }

    public void display() {
        view.displayTopic(topic);
    }
}
