package com.lisi4ka.web_lab3;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named(value = "getData")
@SessionScoped

public class GetData implements Serializable {
    private String somedata;
    private String x, y;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }


    /**

     Creates a new instance of getData*/
    public GetData() {}

    public String getSomedata() {
        return somedata;
    }

    public void setSomedata(String somedata) {
        this.somedata = somedata;
    }

    public void imageclk(){
        somedata = "x="+x+"y="+y;
    }

}
