package com.profillo.step_definitions;

import com.profillo.pages.DashboardPage;
import com.profillo.pages.LoginPage;
import com.profillo.pages.UserGroupPage;
import com.profillo.pages.UserManagementPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.ConfigurationReader;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ParametersStepDefs {

        @And("change the Password information with {string} and click Save changes")
        public void change_the_Password_information_with_and_click_Save_changes (String password){
            UserManagementPage passWord = new UserManagementPage();
            passWord.password.clear();
            BrowserUtils.waitFor(3);
            passWord.password.sendKeys(password);
            passWord.saveChanges.click();
        }


    }
