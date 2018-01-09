package com.automotionpractice.account.TestCases;

import com.automotionpractice.account.EditingFields.FieldsEditor;
import com.automotionpractice.account.TestingTools.BrowserFunctions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn extends BrowserFunctions {

    FieldsEditor editor = new FieldsEditor();

    @Test
    //    Method that logs in into already existing account
    public void loggingIn () {
        editor.logIn();
        Assert.assertEquals(driver.getCurrentUrl(),getMyAccountEditionURL());
    }
}