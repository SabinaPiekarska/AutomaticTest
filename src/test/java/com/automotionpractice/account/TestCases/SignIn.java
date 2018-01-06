package com.automotionpractice.account.TestCases;

import com.automotionpractice.account.EditingFields.FieldsEditor;
import com.automotionpractice.account.Mapping.ElementsLocations;
import com.automotionpractice.account.TestingTools.BrowserFunctions;
import org.testng.annotations.Test;

public class SignIn extends BrowserFunctions{

    FieldsEditor editor = new FieldsEditor();

    @Test
    //    Method that logs in
    public void loggingIn () throws InterruptedException {
        editor.signIn();
        editor.logIn();
    }
}