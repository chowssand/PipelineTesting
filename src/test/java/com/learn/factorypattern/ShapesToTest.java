package com.learn.factorypattern;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ShapesToTest {
    Shape shape;
    @BeforeMethod
    public void setUp() throws Exception {
        shape= ShapeFactory.getShape("CIRCLE");
    }

    @Test
    public void testGetShape() throws Exception {
        shape.draw();
    }
}