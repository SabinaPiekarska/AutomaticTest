package com.automotionpractice.account.Mapping;

import com.automotionpractice.account.TestingTools.BrowserFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PersonalInformationEditorURL extends BrowserFunctions{

    //    Methods with web element locations from My Personal Information page
    public WebElement getNewName () {    return driver.findElement(By.id("firstname")); }
    public WebElement getNewLastname () {    return driver.findElement(By.id("lastname")); }
    public WebElement getOldPassword () {
        return driver.findElement(By.id("old_passwd"));
    }
    public WebElement getSaveChangesButton () {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/fieldset/div[11]/button"));
    }
    public WebElement getReturnToAccountButton () {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a/span"));
    }
}
