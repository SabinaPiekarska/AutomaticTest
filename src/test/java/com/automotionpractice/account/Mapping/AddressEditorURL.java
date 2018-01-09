package com.automotionpractice.account.Mapping;

import com.automotionpractice.account.TestingTools.BrowserFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddressEditorURL extends BrowserFunctions{

    //    Methods with web element locations from My Addresses page
    public WebElement getUpdateButton () {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/div/div/ul/li[9]/a[1]/span"));
    }
    public WebElement getSaveUpdateButton () {
        return driver.findElement(By.id("submitAddress"));
    }

}
