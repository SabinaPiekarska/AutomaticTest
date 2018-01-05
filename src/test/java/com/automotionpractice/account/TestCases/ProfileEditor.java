package com.automotionpractice.account.TestCases;

import com.automotionpractice.account.EditingFields.FieldsEditor;
import com.automotionpractice.account.Mapping.ElementsLocations;
import com.automotionpractice.account.TestingTools.BrowserFunctions;
import com.automotionpractice.account.TestingTools.RandomGenerator;
import org.testng.annotations.Test;

public class ProfileEditor extends FieldsEditor {

    ElementsLocations element = new ElementsLocations();
    BrowserFunctions functions = new BrowserFunctions();
    RandomGenerator generator = new RandomGenerator();
    Registration register = new Registration();
    String login = "zxc@zxc.com";
    String password = "zxc@123";

    @Test (priority = 1)
    //    Method that logs into existing account
    public void logIn () throws InterruptedException {
//        functions.openTestingPage();
//        functions.waitUntilPageLoads(element.getSignInLink());
//        element.getSignInLink().click();
        functions.createDriver();
        register.signIn();
        element.getEMailAddress().sendKeys(login);
        element.getPassword().sendKeys(password);
        element.getSingInButton().click();
    }

    @Test (priority = 2)
    //    Method that clicks My Personal Information link on My ProfileEditor Page and edit all the available values
    public void editPersonalInfo () throws InterruptedException {
        Thread.sleep(2000);
        functions.waitUntilPageLoads(element.getMyPersonalInfo());
        element.getMyPersonalInfo().click();
        generator.randomRadioClick(element.getGender());
        editFields(element.getNewName(), generator.generateRandomWord(25));
        editFields(element.getNewLastname(), generator.generateRandomWord(25));
        fillBirthday();
        fillAdditionalOptions();
        element.getOldPassword().sendKeys(password);
//        String newPassword = generator.generateRandomInt(15);
//        element.getPassword().sendKeys(newPassword);
//        element.getConfirmPassword().sendKeys(newPassword);
        element.getSaveChangesButton().click();
        element.getReturnToAccountButton().click();
    }

    @Test (priority = 3)
    //    Method that clicks My Address link on My ProfileEditor Page and edit all the available values
    public void editAddress () throws InterruptedException {
        functions.waitUntilPageLoads(element.getMyAddress());
        element.getMyAddress().click();
        functions.waitUntilPageLoads( element.getUpdateButton());
        element.getUpdateButton().click();
        fillAddressInfo();
        element.getSaveUpdateButton().click();
    }
}