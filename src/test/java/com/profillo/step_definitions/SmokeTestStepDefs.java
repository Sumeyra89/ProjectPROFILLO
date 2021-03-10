package com.profillo.step_definitions;

import com.profillo.pages.LoginPage;
import com.profillo.pages.UserGroupPage;
import com.profillo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SmokeTestStepDefs {


    @When("librarian click the users tab")
    public void librarian_click_the_Users_tab() {
        BrowserUtils.waitFor(3);
        new LoginPage().usersButton.click();


    }

    @And("Librarian click Edit User button")
    public void click_Edit_User_button() {
        BrowserUtils.waitFor(3);
        UserGroupPage bookBtn = new UserGroupPage();
        bookBtn.editUserButton.click();
    }
}
