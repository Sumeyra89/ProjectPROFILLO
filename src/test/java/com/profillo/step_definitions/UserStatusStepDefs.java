package com.profillo.step_definitions;

import com.profillo.pages.DashboardPage;
import com.profillo.pages.LoginPage;
import com.profillo.pages.UserGroupPage;
import com.profillo.pages.UserStatusPage;
import com.profillo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserStatusStepDefs {

    @When("librarian click the Users tab")
    public void librarian_click_the_Users_tab() {
        BrowserUtils.waitFor(3);
        new LoginPage().usersButton.click();
    }

    @Then("click Status dropdown,select ACTIVE,and click Save changes")
    public void click_Status_dropdown_select_ACTIVE_and_click_Save_changes() {
        BrowserUtils.waitFor(3);
        UserStatusPage drop=new UserStatusPage();
        drop.userStatusDropdown.click();
        Select select = new Select( new UserStatusPage().userStatusDropdown);
        select.selectByVisibleText("ACTIVE");
        drop.saveChanges.click();
    }
    @Then("click Status dropdown,select INACTIVE,and click Save changes")
    public void click_Status_dropdown_select_INACTIVE_and_click_Save_changes() {
        BrowserUtils.waitFor(3);
        UserStatusPage drop=new UserStatusPage();
        drop.userStatusDropdown.click();
        Select select = new Select( new UserStatusPage().userStatusDropdown);
        select.selectByVisibleText("INACTIVE");
        drop.saveChanges.click();
    }



   }




