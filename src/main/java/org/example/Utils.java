package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    //method for clicking actions
public static void clickOnElement(By by){

    driver.findElement(by).click();
    }

//method to type text
public static void typeText(By by, String text){

    driver.findElement(by).sendKeys(text);
}

public static String randomDate(){
    DateFormat dateFormat = new SimpleDateFormat("yyMMddhhmm");
    Date date =new Date();
    return dateFormat.format(date);
}

//to get or store text
public static String getText(By by){

    return driver.findElement(by).getText();
}

//method to select drop down by Value
public static void selectByValue(By by, String text){

    Select select = new Select(driver.findElement(by));
    select.selectByValue(text);
}

//method to select drop down by Text
public static void selectByText(By by, String text){

    Select select = new Select(driver.findElement(by));
    select.selectByVisibleText(text);
}

//method to select drop down by Index
public static void selectByIndex(By by, int index){

    Select select = new Select(driver.findElement(by));
    select.selectByIndex(index);
    }

//method to use Explicit Wait
public static void explicitWait(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(by));
    }

//sleep method
public static void sleepMethod(){
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
