package com.example.lab2.controller.impl;

import com.example.lab2.controller.TopicController;
import com.example.lab2.model.Topic;

public class TopicControllerImpl implements TopicController {
    private Topic topic;

    public TopicControllerImpl(Topic topic) {
        this.topic = topic;
    }

    public void update(String title, String content) {
        topic.setTitle(title);
        topic.setContent(content);
    }

    @Override
    public Topic get() {
        return topic;
    }
}
