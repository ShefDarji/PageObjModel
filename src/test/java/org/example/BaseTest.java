package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {

    //obj created to call that class method into this class
    BrowserManager browserManager = new BrowserManager();

@BeforeMethod
public void startBrowser(){

    browserManager.openBrowser();
}
@AfterMethod
public void tearUp(){
    browserManager.closeBrowser();
}
}
