package ru.aincorp.invesoft.controller;


import javafx.scene.Node;

/**
 * Created by Алмаз on 31.07.14.
 */
public interface Controller {
    Node getView();
    void setView(Node view);
}
