package com.automotionpractice.account.Mapping;

import com.automotionpractice.account.TestingTools.BrowserFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPageURL extends BrowserFunctions {

    //    Method with web element location from main page
    public WebElement getSignInLink(){
        return driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
    }
}
