package org.example;

import org.openqa.selenium.By;

public class EmailFriendPage extends Utils{

    public void enterFriendDetails (){
        //click on email a friend option
       // clickOnElement(By.xpath("//button[normalize-space()='Email a friend']"));
        //enter friends email
        typeText(By.xpath("//input[@id='FriendEmail']"),"qwerty"+randomDate()+"@gmail.com");
        //my email id using random date as email is stored we do not type it again we just click on that
        clickOnElement(By.xpath("//input[@id='YourEmailAddress']"));
        //typeText(By.xpath("//input[@name='YourEmailAddress']"),"Laura"+randomDate()+"@yahoo.com");
        //type text on comment box
        typeText(By.xpath("//textarea[@name='PersonalMessage']"),"Do buy this product, it is really good");
        //click on send email
        clickOnElement(By.name("send-email"));

    }
}
