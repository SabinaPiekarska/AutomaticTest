package com.automotionpractice.account.TestCases;

import com.automotionpractice.account.Mapping.ElementsLocations;
import com.automotionpractice.account.TestingTools.BrowserFunctions;

public class SignOut{

    ElementsLocations element = new ElementsLocations();
    BrowserFunctions functions = new BrowserFunctions();

//    Method that logs out
    public void loggingOut () throws InterruptedException {
        functions.waitUntilPageLoads(element.getSignInLink());
        element.getSignOutButton().click();

    }
}