package com.automotionpractice.account.Mapping;

import com.automotionpractice.account.TestingTools.BrowserFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsLocations extends BrowserFunctions {

//    Method with web element location from temporary email page
    public WebElement getTemporaryEMail() {
        return driver.findElement(By.id("mail"));
    }

//    Method with web element location from main page
    public WebElement getSignInLink(){
        return driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
    }

//    Methods with web elements locations from authentication page
    public WebElement getEMail(){
        return driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
    }
    public WebElement getSubmitButton(){
        return driver.findElement(By.id("SubmitCreate"));
    }
    public WebElement getEMailAddress(){
        return driver.findElement(By.id("email"));
    }
    public WebElement getSingInButton(){
        return driver.findElement(By.id("SubmitLogin"));
    }

//    Methods with web elements locations from create an account page and My ProfileEditor page
    public List<WebElement> getGender () {
        return driver.findElements(By.name("id_gender"));
    }
    public WebElement getName(){
        return driver.findElement(By.id("customer_firstname"));
    }
    public WebElement getLastName(){
        return driver.findElement(By.id("customer_lastname"));
    }
    public WebElement getPassword(){
        return driver.findElement(By.id("passwd"));
    }
    public WebElement getBirthDayList(){
        return driver.findElement(By.id("days"));
    }
    public WebElement getBirthMonthList(){
        return driver.findElement(By.id("months"));
    }
    public WebElement getBirthYearList(){
        return driver.findElement(By.id("years"));
    }
    public WebElement getNewsletterCheckbox() { return driver.findElement(By.id("newsletter")); }
    public WebElement getOfferCheckbox(){
        return driver.findElement(By.id("optin"));
    }
    public WebElement getCompany(){
        return driver.findElement(By.id("company"));
    }
    public WebElement getAddress(){
        return driver.findElement(By.id("address1"));
    }
    public WebElement getAddress2(){
        return driver.findElement(By.id("address2"));
    }
    public WebElement getCity(){
        return driver.findElement(By.id("city"));
    }
    public WebElement getStateList(){
        return driver.findElement(By.id("id_state"));
    }
    public WebElement getPostcode(){
        return driver.findElement(By.id("postcode"));
    }
    public WebElement getCountry(){
        return driver.findElement(By.id("id_country"));
    }
    public WebElement getInfoTextarea(){
        return driver.findElement(By.id("other"));
    }
    public WebElement getPhone(){
        return driver.findElement(By.id("phone"));
    }
    public WebElement getMobilePhone(){
        return driver.findElement(By.id("phone_mobile"));
    }
    public WebElement getAlias(){
        return driver.findElement(By.id("alias"));
    }
    public WebElement getRegisterButton(){
        return driver.findElement(By.id("submitAccount"));
    }

//    Methods with web elements locations from My ProfileEditor page
    public WebElement getMyPersonalInfo () {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a/span"));
    }
    public WebElement getMyAddress() {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[3]/a/span"));
    }

//    Methods with web element locations from My Personal Information page
    public WebElement getNewName () {    return driver.findElement(By.id("firstname")); }
    public WebElement getNewLastname () {    return driver.findElement(By.id("lastname")); }

    public WebElement getOldPassword () {
        return driver.findElement(By.id("old_passwd"));
    }
    public WebElement getConfirmPassword () {
        return driver.findElement(By.id("confirmation"));
    }
    public WebElement getSaveChangesButton () {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/fieldset/div[11]/button"));
    }
    public WebElement getSignOutButton() {
        return driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"));
    }
    public WebElement getReturnToAccountButton () {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a/span"));
    }

//    Methods with web element locations from My Addresses page
    public WebElement getUpdateButton () {
        return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/div/div/ul/li[9]/a[1]/span"));
    }
    public WebElement getSaveUpdateButton () {
        return driver.findElement(By.id("submitAddress"));
    }
}
