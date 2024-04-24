package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {

static String expectedMsg = "Your registration completed";

public void registrationDone(){
    String actualMsg = getText(By.className("result"));

//To verify Actual = Expected
    Assert.assertEquals(actualMsg,expectedMsg,"Registration not completed");

//click on continue once registered
    clickOnElement(By.xpath("//a[.='Continue']"));
}


}
