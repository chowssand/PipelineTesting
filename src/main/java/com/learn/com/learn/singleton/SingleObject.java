package com.learn.com.learn.singleton;

public class SingleObject {

    public static SingleObject instance = new SingleObject();

    private SingleObject(){
    }

    public static SingleObject getObjectInstancec(){
        return instance;
    }

    public void firstSingleObjectMethod(){
        System.out.println("Called from Single object");
    }
}
