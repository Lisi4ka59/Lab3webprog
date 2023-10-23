package com.lisi4ka.web_lab3;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("beanCoordinates")
@SessionScoped
public class BeanCoordinates implements Serializable {
    private String inputX = "10";

    public String getInputX() {
        return inputX;
    }

    public void setInputX(String inputX) {
        this.inputX = inputX;
    }
}