package com.pattern.tests;

import com.learn.driverfactorypattern.DriverFactory;
import com.learn.driverfactorypattern.DriverManager;
import com.learn.driverfactorypattern.DriverTypes;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DriverFactoryTest {

    DriverManager driverManager;
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driverManager = DriverFactory.getManager(DriverTypes.CHROME);
        driver = driverManager.getDriver();
    }

    @Test
    public void testGetManager() throws Exception {
        driver.get("https://www.facebook.com");

    }
    @AfterMethod
    public void tearDown() {
        driverManager.quitDriver();
    }
}