package com.example.lab2.view.impl;

import com.example.lab2.model.Topic;
import com.example.lab2.view.ViewInterface;

public class CLIView implements ViewInterface {
    @Override
    public void displayTopic(Topic topic) {
        System.out.println("CLI View:");
        System.out.println("Title: " + topic.getTitle());
        System.out.println("Content: " + topic.getContent());
    }
}
