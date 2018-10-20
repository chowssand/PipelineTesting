package com.learn.com.learn.singleton;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.*;

public class SingleObjectTest {
    SingleObject so;
    @BeforeMethod
    public void setUp() throws Exception {
        so = SingleObject.getObjectInstancec();
    }

    public void firstMethodTest(){
        so.firstSingleObjectMethod();
    }
}