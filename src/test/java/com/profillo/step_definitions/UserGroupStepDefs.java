package com.profillo.step_definitions;

import com.profillo.pages.DashboardPage;
import com.profillo.pages.LoginPage;
import com.profillo.pages.UserGroupPage;
import com.profillo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserGroupStepDefs {
    @When("librarian should be able to click the users tab")
    public void librarian_should_be_able_to_click_the_users_tab() {
        BrowserUtils.waitFor(3);
        new LoginPage().usersButton.click();
    }


    @Then("choose one user and click Edit User button")
    public void choose_one_user_and_click_Edit_User_button() {
        BrowserUtils.waitFor(3);
        UserGroupPage bookBtn = new UserGroupPage();
        bookBtn.editUserButton.click();
    }

    @Then("click User Group dropdown,select Librarian,and click Save changes")
    public void click_User_Group_dropdown_select_Librarian_and_click_Save_changes() {
        BrowserUtils.waitFor(3);
        UserGroupPage dropdown = new UserGroupPage();
        dropdown.userGroupDropdown.click();
        Select select = new Select(new UserGroupPage().userGroupDropdown);
        select.selectByVisibleText("Librarian");
        dropdown.saveChanges.click();

    }

    @Then("click User Group dropdown,select Students,and click Save changes")
    public void click_User_Group_dropdown_select_Students_and_click_Save_changes() {
        BrowserUtils.waitFor(3);
        UserGroupPage dropdown = new UserGroupPage();
        dropdown.userGroupDropdown.click();
        Select select = new Select(new UserGroupPage().userGroupDropdown);
        select.selectByVisibleText("Students");
        dropdown.saveChanges.click();
    }

}



