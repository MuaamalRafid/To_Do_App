package com.example.demo;

import java.time.LocalDate;
import java.util.Date;

public class Tasks {
    private String text;
    private LocalDate date;
    Tasks(String text ,LocalDate date){
        this.text = text;
        this.date = date;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return getText()+"\t \t "+getDate();
    }
}
