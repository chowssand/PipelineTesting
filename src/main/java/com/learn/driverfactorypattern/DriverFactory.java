package com.learn.driverfactorypattern;



public class DriverFactory {
    public static DriverManager getManager(DriverTypes type){
        DriverManager driverManager = null;

        switch(type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;
    }

}
