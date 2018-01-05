package com.automotionpractice.account.TestingTools;
//import com.automotionpractice.account.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.List;

public class BrowserFunctions {
    public static WebDriver driver;
    String basicURL = "http://automationpractice.com/";
    String temporaryMail = "https://temp-mail.org/pl/";

//    public BrowserFunctions() {
//        this.driver = Main.driver;
//    }

//     Method that waits till specified element will be visible and enable to click
    @BeforeSuite
    public void createDriver() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public void waitUntilPageLoads(WebElement element) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, 25);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

//     Method that opens registration page
    public void openTestingPage (){
        driver.get(basicURL);
    }
//
//     Method that opens temporary e-mail page
    public void openTemporaryMailPage() {
        driver.get(temporaryMail);
    }

    @AfterSuite
    public void closeBrowser() {
        driver.quit();
    }
}