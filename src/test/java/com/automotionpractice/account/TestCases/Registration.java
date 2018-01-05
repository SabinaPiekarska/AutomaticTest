package com.automotionpractice.account.TestCases;

import com.automotionpractice.account.EditingFields.FieldsEditor;
import com.automotionpractice.account.Mapping.ElementsLocations;
import com.automotionpractice.account.TestingTools.BrowserFunctions;
import com.automotionpractice.account.TestingTools.RandomGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Registration extends BrowserFunctions {

    ElementsLocations element = new ElementsLocations();
    RandomGenerator generator = new RandomGenerator();
    FieldsEditor editor = new FieldsEditor();
    String temporaryEMail;
    String password = generator.generateRandomPassword(15);

    @Test(priority = 1)
    //    Method that opens temporary e-mail page, waits to load and copies mail name to String
    public void createEMail() throws InterruptedException {
        openTemporaryMailPage();
        waitUntilPageLoads(element.getTemporaryEMail());
        temporaryEMail = element.getTemporaryEMail().getAttribute("value");
        Assert.assertEquals(driver.getCurrentUrl(),"https://temp-mail.org/pl/");
    }
    @Test(priority = 2)
    //    Method that opens testing page and clicks on Sign In button on main page
    public void signIn() throws InterruptedException {
        openTestingPage();
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php");
        waitUntilPageLoads(element.getSignInLink());
        element.getSignInLink().click();
    }
    @Test(priority = 3)
    //    Methods that enters e mail to create an account
    public void createAnAccount() throws InterruptedException {
        waitUntilPageLoads(element.getEMail());
        Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=authentication&back=my-account");
        element.getEMail().sendKeys(temporaryEMail);
        element.getSubmitButton().click();
    }
    @Test(priority = 4)
    //    Method that fills in personal information form fields with proper values
    public void fillPersonalInformation () throws InterruptedException {
        Thread.sleep(2000);
        waitUntilPageLoads(element.getName());
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        generator.randomRadioClick(element.getGender());
        element.getName().sendKeys(generator.generateRandomWord(25));
        element.getLastName().sendKeys(generator.generateRandomWord(25));
        element.getPassword().sendKeys(password);
    }
    @Test(priority = 5)
    //    Method that fills in all remaining fields in a form
    public void fillFields () throws InterruptedException {
        editor.fillBirthday();
        editor.fillAdditionalOptions();
        editor.fillAddressInfo();
    }
    @Test(priority = 6)
    //    Method that clicks on register button
    public void registrationClick () {
        element.getRegisterButton().click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=my-account");
    }
}
