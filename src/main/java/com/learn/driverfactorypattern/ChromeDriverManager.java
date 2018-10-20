package com.learn.driverfactorypattern;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class ChromeDriverManager extends DriverManager {

    private ChromeDriverService chService;

    public void startService() {
        if(null == chService){
            try{
                chService = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File(System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe"))
                        .usingAnyFreePort()
                        .build();

                    chService.start();
            }catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public void stopService() {
        if(chService !=null & chService.isRunning()){
            chService.stop();
        }

    }

    public void createDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");

        driver = new ChromeDriver(chService,options);

    }
}
