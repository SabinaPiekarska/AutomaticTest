package com.automotionpractice.account.TestCases;

import com.automotionpractice.account.EditingFields.FieldsEditor;
import com.automotionpractice.account.Mapping.ElementsLocations;
import com.automotionpractice.account.TestingTools.BrowserFunctions;
import com.automotionpractice.account.TestingTools.RandomGenerator;
import org.testng.annotations.Test;

public class ProfileEditor extends BrowserFunctions {

    ElementsLocations element = new ElementsLocations();
    FieldsEditor editor = new FieldsEditor();
    RandomGenerator generator = new RandomGenerator();

//    //    Method that logs into existing account
//    public void logIn () throws InterruptedException {
//        editor.signIn();
//        element.getEMailAddress().sendKeys(getLogin());
//        element.getPassw().sendKeys(getPassword());
//        element.getSingInButton().click();
//    }

    //    Method that clicks My Personal Information link on My ProfileEditor Page and edit all the available values
    public void editPersonalInfo () throws InterruptedException {
        editor.logIn();
        Thread.sleep(2000);
        waitUntilPageLoads(element.getMyPersonalInfo());
        element.getMyPersonalInfo().click();
        generator.randomRadioClick(element.getGender());
        editor.editFields(element.getNewName(), generator.generateRandomWord(25));
        editor.editFields(element.getNewLastname(), generator.generateRandomWord(25));
        editor.fillBirthday();
        editor.fillAdditionalOptions();
        element.getOldPassword().sendKeys(getPassword());
        element.getSaveChangesButton().click();
        element.getReturnToAccountButton().click();
    }

    //    Method that clicks My Address link on My ProfileEditor Page and edit all the available values
    public void editAddress () throws InterruptedException {
        waitUntilPageLoads(element.getMyAddress());
        element.getMyAddress().click();
        waitUntilPageLoads( element.getUpdateButton());
        element.getUpdateButton().click();
        editor.fillAddressInfo();
        element.getSaveUpdateButton().click();
    }

    @Test
    public void editProfile () throws InterruptedException {
        editPersonalInfo();
        editAddress();
    }

}