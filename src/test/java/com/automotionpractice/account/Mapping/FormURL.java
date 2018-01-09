package com.automotionpractice.account.Mapping;

import com.automotionpractice.account.TestingTools.BrowserFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FormURL extends BrowserFunctions{

    //    Methods with web elements locations from create an account page and My ProfileEditor page used for filling in form
    public List<WebElement> getGender () {
        return driver.findElements(By.name("id_gender"));
    }
    public WebElement getName(){
        return driver.findElement(By.id("customer_firstname"));
    }
    public WebElement getLastName(){
        return driver.findElement(By.id("customer_lastname"));
    }
    public WebElement getPassw(){
        return driver.findElement(By.id("passwd"));
    }
    public WebElement getBirthDayList(){
        return driver.findElement(By.id("days"));
    }
    public WebElement getBirthMonthList(){
        return driver.findElement(By.id("months"));
    }
    public WebElement getBirthYearList(){
        return driver.findElement(By.id("years"));
    }
    public WebElement getNewsletterCheckbox() { return driver.findElement(By.id("newsletter")); }
    public WebElement getOfferCheckbox(){
        return driver.findElement(By.id("optin"));
    }
    public WebElement getCompany(){
        return driver.findElement(By.id("company"));
    }
    public WebElement getAddress(){
        return driver.findElement(By.id("address1"));
    }
    public WebElement getAddress2(){
        return driver.findElement(By.id("address2"));
    }
    public WebElement getCity(){
        return driver.findElement(By.id("city"));
    }
    public WebElement getStateList(){
        return driver.findElement(By.id("id_state"));
    }
    public WebElement getPostcode(){
        return driver.findElement(By.id("postcode"));
    }
    public WebElement getCountry(){
        return driver.findElement(By.id("id_country"));
    }
    public WebElement getInfoTextarea(){
        return driver.findElement(By.id("other"));
    }
    public WebElement getPhone(){
        return driver.findElement(By.id("phone"));
    }
    public WebElement getMobilePhone(){
        return driver.findElement(By.id("phone_mobile"));
    }
    public WebElement getAlias(){
        return driver.findElement(By.id("alias"));
    }
    public WebElement getRegisterButton(){
        return driver.findElement(By.id("submitAccount"));
    }
}
