package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils{

//method to start browser and type url
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        driver.get("https://demo.nopcommerce.com/");
    }

//method to close the windows
    public void closeBrowser(){

        driver.quit();
    }

}
