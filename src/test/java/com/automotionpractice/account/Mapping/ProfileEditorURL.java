package com.automotionpractice.account.Mapping;

import com.automotionpractice.account.TestingTools.BrowserFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProfileEditorURL extends BrowserFunctions{

    //    Methods with web elements locations from My ProfileEditor page
    public WebElement getMyPersonalInfo () {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a/span"));
    }
    public WebElement getMyAddress() {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[3]/a/span"));
    }
}
