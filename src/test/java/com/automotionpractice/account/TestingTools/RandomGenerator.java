package com.automotionpractice.account.TestingTools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class RandomGenerator extends BrowserFunctions {

    private String randomPassword = generateRandomPassword(15);

    public String getRandomPassword() {
        return randomPassword;
    }

    //The basic method that generates random string with established length, uses variables from methods below
    public String generateRandomString (String chars, int x) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        while (sb.length() < x) { // length of the random string
            int index = (int) (random.nextFloat() * chars.length());
            sb.append(chars.charAt(index));
        }
        String output = sb.toString();
        return output;
    }

    //    Method that passes specified letters to generateRandomString method
    public String generateRandomWord(int x) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        return generateRandomString(letters, x);
    }

    //    Method that passes specified numbers to generateRandomString method
    public String generateRandomInt(int x){
        String numbers = "1234567890";
        return generateRandomString(numbers, x);
    }

    //Method that passes specified letters, numbers and special characters to generateRandomString method
    public String generateRandomPassword (int x) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890";
        return generateRandomString(chars, x);
    }

    //  Method that generate random click on web element from possible options
    public void randomClick(List<WebElement> options) {
        Random random = new Random();
        while (true) {
            int index = random.nextInt(options.size());
            if (index != 0) {
                options.get(index).click();
                break;
            }
            else {
                continue;
            }
        }
    }

    //    Method that generate random click on radio button options
    public void randomRadioClick (List<WebElement> options) {
        Random random = new Random();
        int index = random.nextInt(options.size());
        options.get(index).click();
    }

    // Method that counts the size of web element and passes it to randomClick method
    public void randomDropdownClick(WebElement element) {
        Select select = new Select(element);
        List <WebElement> elements = select.getOptions();
        randomClick(elements);
    }

    //Method that clicks on one of the dropdown options selected by text
    public void clicksDropdownText(WebElement element, String text) {
            Select select = new Select(element);
            select.selectByVisibleText(text);
    }

    //    Method that randomly generates boolean value
    public void generateRandomBoolean(WebElement element) {
        Random random = new Random();
        boolean value = random.nextBoolean();
        if (value==true) {
            element.click();
        }
    }
}