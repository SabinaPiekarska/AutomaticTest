package com.automotionpractice.account.Mapping;

import com.automotionpractice.account.TestingTools.BrowserFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AuthenticationURL extends BrowserFunctions{

    //    Methods with web elements locations from authentication page
    public WebElement getEMail(){
        return driver.findElement(By.id("email_create"));
    }
    public WebElement getSubmitButton(){
        return driver.findElement(By.id("SubmitCreate"));
    }
    public WebElement getEMailAddress(){
        return driver.findElement(By.id("email"));
    }
    public WebElement getSingInButton(){
        return driver.findElement(By.id("SubmitLogin"));
    }
}
