package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class ToDoController {


    @FXML
    private DatePicker taskDate;

    @FXML
    private ListView<Tasks> listView;

    @FXML
    private TextField texts;

    ObservableList<Tasks> list = FXCollections.observableArrayList();

    @FXML
    protected void addTasks() {

        list.add(new Tasks(texts.getText(), taskDate.getValue()));
        listView.setItems(list);
    }


    @FXML
    protected void deleteTask(ActionEvent event){
        list.remove(listView.getSelectionModel().getSelectedItem());
    }
}