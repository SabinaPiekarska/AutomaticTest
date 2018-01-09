package com.automotionpractice.account.EditingFields;

import com.automotionpractice.account.Mapping.AuthenticationURL;
import com.automotionpractice.account.Mapping.FormURL;
import com.automotionpractice.account.Mapping.MainPageURL;
import com.automotionpractice.account.TestingTools.BrowserFunctions;
import com.automotionpractice.account.TestingTools.RandomGenerator;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FieldsEditor extends BrowserFunctions{

    RandomGenerator generator = new RandomGenerator();
    MainPageURL mainURL = new MainPageURL();
    AuthenticationURL authenticationURL = new AuthenticationURL();
    FormURL formURL = new FormURL();

    //    Method that clears the field first and then sends String to the web element
    public void editFields(WebElement element, String generator) {
        element.clear();
        element.sendKeys(generator);
    }

    //    Method that opens testing page and clicks on Sign In button on main page
    public void signIn() {
        openTestingPage();
        Assert.assertEquals(driver.getCurrentUrl(),getBasicURL());
        waitUntilPageLoads(mainURL.getSignInLink());
        mainURL.getSignInLink().click();
    }

    //    Method that logs into existing account
    public void logIn () {
        signIn();
        authenticationURL.getEMailAddress().sendKeys(getLogin());
        formURL.getPassw().sendKeys(getPassword());
        authenticationURL.getSingInButton().click();
    }

    //    Method that fills in day, month and year fields
    public void fillBirthday () {
        generator.randomDropdownClick(formURL.getBirthDayList());
        generator.randomDropdownClick(formURL.getBirthMonthList());
        generator.randomDropdownClick(formURL.getBirthYearList());
    }

    //    Method that ticks checkbox options
    public void fillAdditionalOptions () {
        generator.generateRandomBoolean(formURL.getNewsletterCheckbox());
        generator.generateRandomBoolean(formURL.getOfferCheckbox());
    }

    //  Method that clears and than fills in address related fields
    public void fillAddressInfo () {
        editFields(formURL.getCompany(), generator.generateRandomWord(25));
        editFields(formURL.getAddress(), generator.generateRandomWord(25));
        editFields(formURL.getAddress2(), generator.generateRandomWord(25));
        editFields(formURL.getCity(), generator.generateRandomWord(15));
        generator.clicksDropdownText(formURL.getCountry(), "United States");
        generator.randomDropdownClick(formURL.getStateList());
        editFields(formURL.getPostcode(), generator.generateRandomInt(5));
        editFields(formURL.getInfoTextarea(), generator.generateRandomWord(50));
        editFields(formURL.getPhone(), generator.generateRandomInt(10));
        editFields(formURL.getMobilePhone(), generator.generateRandomInt(10));
        editFields(formURL.getAlias(), generator.generateRandomWord(15));
    }
}
