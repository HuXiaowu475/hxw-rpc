package com.hxw.model;

import java.io.Serializable;

public class Entity implements Serializable {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


}
