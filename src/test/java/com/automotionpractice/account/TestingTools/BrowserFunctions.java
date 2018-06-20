package com.automotionpractice.account.TestingTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


public class BrowserFunctions {

    public static WebDriver driver;
    private String basicURL = "http://automationpractice.com/index.php";
    private String temporaryMail = "https://temp-mail.org/pl/";
    private String myAccountURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private String myAccountCreationURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
    private String myAccountEditionURL = "http://automationpractice.com/index.php?controller=my-account";
    private String login = "zxc@zxc.com";
    private String password = "zxc@123";
    private String temporaryEMailAddress;

    public String getMyAccountURL() {
        return myAccountURL;
    }

    public String getMyAccountCreationURL() {
        return myAccountCreationURL;
    }

    public String getMyAccountEditionURL() {
        return myAccountEditionURL;
    }

    public void setTemporaryEMailAddress(String temporaryEMailAddress) {
        this.temporaryEMailAddress = temporaryEMailAddress;
    }

    public String getTemporaryEMailAddress() {
        return temporaryEMailAddress;
    }

    public String getBasicURL() {
        return basicURL;
    }

    public String getTemporaryMail() {
        return temporaryMail;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @BeforeSuite
    //   Method that creates new Firefox driver and maximize browser window
    public void createDriver() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    //     Method that waits till specified element will be visible and enable to click
    public void waitUntilPageLoads(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 25);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //     Method that opens registration page
    public void openTestingPage (){
        driver.get(getBasicURL());
    }

    //     Method that opens temporary e-mail page
    public void openTemporaryMailPage() {
        driver.get(getTemporaryMail());
    }

    @AfterSuite
    public void closeBrowser() {
        driver.quit();
    }
}