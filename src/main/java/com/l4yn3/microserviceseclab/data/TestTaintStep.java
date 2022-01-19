package com.l4yn3.microserviceseclab.data;

public class TestTaintStep {
    String name;
    public void setName(String input){
        this.name = input;
    }
    public String getName(){
        return this.name;
    }
}
