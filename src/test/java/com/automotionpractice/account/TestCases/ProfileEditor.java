package com.automotionpractice.account.TestCases;

import com.automotionpractice.account.EditingFields.FieldsEditor;
import com.automotionpractice.account.Mapping.AddressEditorURL;
import com.automotionpractice.account.Mapping.FormURL;
import com.automotionpractice.account.Mapping.PersonalInformationEditorURL;
import com.automotionpractice.account.Mapping.ProfileEditorURL;
import com.automotionpractice.account.TestingTools.BrowserFunctions;
import com.automotionpractice.account.TestingTools.RandomGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileEditor extends BrowserFunctions {

    FormURL formURL = new FormURL();
    ProfileEditorURL profileURL = new ProfileEditorURL();
    PersonalInformationEditorURL personalInfoURL = new PersonalInformationEditorURL();
    AddressEditorURL addressURL = new AddressEditorURL();
    FieldsEditor editor = new FieldsEditor();
    RandomGenerator generator = new RandomGenerator();

    //    Method that clicks My Personal Information link on My ProfileEditor Page and edit all the available values
    public void editPersonalInfo () {
        editor.logIn();
        waitUntilPageLoads(profileURL.getMyPersonalInfo());
        profileURL.getMyPersonalInfo().click();
        generator.randomRadioClick(formURL.getGender());
        editor.editFields(personalInfoURL.getNewName(), generator.generateRandomWord(25));
        editor.editFields(personalInfoURL.getNewLastname(), generator.generateRandomWord(25));
        editor.fillBirthday();
        editor.fillAdditionalOptions();
        personalInfoURL.getOldPassword().sendKeys(getPassword());
        personalInfoURL.getSaveChangesButton().click();
        personalInfoURL.getReturnToAccountButton().click();
    }

    //    Method that clicks My Address link on My ProfileEditor Page and edit all the available values
    public void editAddress () {
        waitUntilPageLoads(profileURL.getMyAddress());
        profileURL.getMyAddress().click();
        waitUntilPageLoads( addressURL.getUpdateButton());
        addressURL.getUpdateButton().click();
        editor.fillAddressInfo();
        addressURL.getSaveUpdateButton().click();
    }

    @Test
    public void editProfile () {
        editPersonalInfo();
        Assert.assertEquals(driver.getCurrentUrl(), getMyAccountEditionURL());
        editAddress();
    }
}