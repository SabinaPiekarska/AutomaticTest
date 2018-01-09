package com.automotionpractice.account.Mapping;

import com.automotionpractice.account.TestingTools.BrowserFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TemporaryMailURL extends BrowserFunctions {

    //    Method with web element location from temporary email page
    public WebElement getTemporaryEMail() {
        return driver.findElement(By.id("mail"));
    }
}
