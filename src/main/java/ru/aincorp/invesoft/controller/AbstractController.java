package ru.aincorp.invesoft.controller;


import javafx.scene.Node;

/**
 * Created by Алмаз on 31.07.14.
 */
public class AbstractController implements Controller {

    private Node view;

    public Node getView() {
        return view;
    }

    public void setView(Node view) {
        this.view = view;
    }
}
