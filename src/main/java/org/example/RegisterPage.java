package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {

//method to fill details on register page

public void fillRegistrationDetails(){
//type first name
    typeText(By.id("FirstName"),"Laura");

//type second name
    typeText(By.id("LastName"),"Smith");

//type DOB by value
    selectByValue(By.name("DateOfBirthDay"),"20");

//type MOB by text
    selectByText(By.name("DateOfBirthMonth"),"November");

//type YOB by index
    selectByIndex(By.name("DateOfBirthYear"),7);

//type email id using random date
    typeText(By.name("Email"),"Laura"+randomDate()+"@yahoo.com");

//type password
    typeText(By.name("Password"),"1234567");

//confirm password
    typeText(By.id("ConfirmPassword"),"1234567");

//click on register submit button
    clickOnElement(By.id("register-button"));


}

}
