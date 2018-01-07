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

    //    Method that opens temporary e-mail page, waits to load and copies mail name to String
    public void createEMail() {
        openTemporaryMailPage();
        waitUntilPageLoads(element.getTemporaryEMail());
        setTemporaryEMailAddress(element.getTemporaryEMail().getAttribute("value"));
        Assert.assertEquals(driver.getCurrentUrl(),getTemporaryMail());
    }

    //    Methods that enters e mail to create an account
    public void createAnAccount() throws InterruptedException {
        createEMail();
        editor.signIn();
        Thread.sleep(2000);
        waitUntilPageLoads(element.getEMail());
        Assert.assertEquals(driver.getCurrentUrl(), getMyAccountURL());
        element.getEMail().sendKeys(getTemporaryEMailAddress());
        element.getSubmitButton().click();
    }

    //    Method that fills in personal information form fields with proper values
    public void fillPersonalInformation () throws InterruptedException {
        Thread.sleep(2000);
        waitUntilPageLoads(element.getName());
        Assert.assertEquals(driver.getCurrentUrl(),getMyAccountCreationURL());
        generator.randomRadioClick(element.getGender());
        element.getName().sendKeys(generator.generateRandomWord(25));
        element.getLastName().sendKeys(generator.generateRandomWord(25));
        element.getPassw().sendKeys(generator.getRandomPassword());
    }

    //    Method that fills in all remaining fields in a form
    public void fillFields () {
        editor.fillBirthday();
        editor.fillAdditionalOptions();
        editor.fillAddressInfo();
    }

    //    Method that clicks on register button
    public void registrationClick () {
        element.getRegisterButton().click();
        Assert.assertEquals(driver.getCurrentUrl(), getMyAccountEditionURL());
    }

    @Test
    public void register () throws InterruptedException {
        createAnAccount();
        fillPersonalInformation();
        fillFields();
        registrationClick();
    }
}
