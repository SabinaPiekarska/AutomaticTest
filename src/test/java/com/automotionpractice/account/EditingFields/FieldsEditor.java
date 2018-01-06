package com.automotionpractice.account.EditingFields;

import com.automotionpractice.account.Mapping.ElementsLocations;
import com.automotionpractice.account.TestingTools.BrowserFunctions;
import com.automotionpractice.account.TestingTools.RandomGenerator;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FieldsEditor extends BrowserFunctions{

    RandomGenerator generator = new RandomGenerator();
    ElementsLocations element = new ElementsLocations();

    //    Method that clears the field first and then sends String to the web element
    public void editFields(WebElement element, String generator) {
        element.clear();
        element.sendKeys(generator);
    }

    //    Method that opens testing page and clicks on Sign In button on main page
    public void signIn() throws InterruptedException {
        openTestingPage();
        Assert.assertEquals(driver.getCurrentUrl(),getBasicURL());
        waitUntilPageLoads(element.getSignInLink());
        element.getSignInLink().click();
    }

    //    Method that fills in day, month and year fields
    public void fillBirthday () {
        generator.randomDropdownClick(element.getBirthDayList());
        generator.randomDropdownClick(element.getBirthMonthList());
        generator.randomDropdownClick(element.getBirthYearList());
    }

    //    Method that ticks checkbox options
    public void fillAdditionalOptions () {
        generator.generateRandomBoolean(element.getNewsletterCheckbox());
        generator.generateRandomBoolean(element.getOfferCheckbox());
    }

    //  Method that clears and than fills in address related fields
    public void fillAddressInfo () throws InterruptedException {
        editFields(element.getCompany(), generator.generateRandomWord(25));
        editFields(element.getAddress(), generator.generateRandomWord(25));
        editFields(element.getAddress2(), generator.generateRandomWord(25));
        editFields(element.getCity(), generator.generateRandomWord(15));
        generator.clicksDropdownText(element.getCountry(), "United States");
        generator.randomDropdownClick(element.getStateList());
        editFields(element.getPostcode(), generator.generateRandomInt(5));
        editFields(element.getInfoTextarea(), generator.generateRandomWord(50));
        editFields(element.getPhone(), generator.generateRandomInt(10));
        editFields(element.getMobilePhone(), generator.generateRandomInt(10));
        editFields(element.getAlias(), generator.generateRandomWord(15));
    }
}
