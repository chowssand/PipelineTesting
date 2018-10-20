package com.learn.factorypattern;

public class ShapeFactory {

    public static Shape getShape(String typeOfShape){
        Shape shape=null;

        if(typeOfShape == null){
            return null;
        }
        if(typeOfShape.equalsIgnoreCase("circle")){
            shape = new Circle();
        }else if (typeOfShape.equalsIgnoreCase("rectangle")){
            shape = new Rectangle();
        }

        return shape;
    }
}
