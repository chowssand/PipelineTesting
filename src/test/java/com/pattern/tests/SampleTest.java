package com.pattern.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SampleTest {
WebDriver driver = new ChromeDriver();
    @Test
    public void test(){
        String n1 = "c";
        String n2 = "d";
        WebDriverWait w = new WebDriverWait(driver, 30);
       // w.until(ExpectedConditions.numberOfElementsToBeMoreThan);


        assertTrue(n1.equals(n2),String.format("'%s' is not equal to '%s'!",n1,n2));
    }

}