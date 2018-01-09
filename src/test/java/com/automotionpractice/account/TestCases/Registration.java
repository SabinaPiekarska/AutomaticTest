package com.automotionpractice.account.TestCases;

import com.automotionpractice.account.EditingFields.FieldsEditor;
import com.automotionpractice.account.Mapping.AuthenticationURL;
import com.automotionpractice.account.Mapping.FormURL;
import com.automotionpractice.account.Mapping.TemporaryMailURL;
import com.automotionpractice.account.TestingTools.BrowserFunctions;
import com.automotionpractice.account.TestingTools.RandomGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration extends BrowserFunctions {

    TemporaryMailURL tempMailURL = new TemporaryMailURL();
    AuthenticationURL authenticationURL = new AuthenticationURL();
    FormURL formURL = new FormURL();
    RandomGenerator generator = new RandomGenerator();
    FieldsEditor editor = new FieldsEditor();

    //    Method that opens temporary e-mail page, waits to load and copies mail name to String
    public void createEMail() {
        openTemporaryMailPage();
        waitUntilPageLoads(tempMailURL.getTemporaryEMail());
        setTemporaryEMailAddress(tempMailURL.getTemporaryEMail().getAttribute("value"));
        Assert.assertEquals(driver.getCurrentUrl(),getTemporaryMail());
    }

    //    Methods that enters e mail to create an account
    public void createAnAccount() {
        createEMail();
        editor.signIn();
        waitUntilPageLoads(authenticationURL.getEMail());
        Assert.assertEquals(driver.getCurrentUrl(), getMyAccountURL());
        authenticationURL.getEMail().sendKeys(getTemporaryEMailAddress());
        authenticationURL.getSubmitButton().click();
    }

    //    Method that fills in personal information form fields with proper values
    public void fillPersonalInformation () throws InterruptedException {
//        I know that method below isn't the best way to wait for page loading, but I had problems with waiting for an element to be clickable in this specific site
        Thread.sleep(2000);
        waitUntilPageLoads(formURL.getName());
        Assert.assertEquals(driver.getCurrentUrl(),getMyAccountCreationURL());
        generator.randomRadioClick(formURL.getGender());
        formURL.getName().sendKeys(generator.generateRandomWord(25));
        formURL.getLastName().sendKeys(generator.generateRandomWord(25));
        formURL.getPassw().sendKeys(generator.getRandomPassword());
    }

    //    Method that fills in all remaining fields in a form
    public void fillFields () {
        editor.fillBirthday();
        editor.fillAdditionalOptions();
        editor.fillAddressInfo();
    }

    //    Method that clicks on register button
    public void registrationClick () {
        formURL.getRegisterButton().click();
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
