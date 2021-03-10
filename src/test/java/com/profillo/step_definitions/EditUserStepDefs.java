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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditUserStepDefs {
    @Given("the librarian logged in the application")
     public void the_librarian_logged_in_the_application() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(3);
        new LoginPage().login(ConfigurationReader.get("librarian_username"),
                ConfigurationReader.get("librarian_password"));
//helllo
   }

    @And("change the Full Name information with {string} and click Save changes")
    public void change_the_Full_Name_information_with_and_click_Save_changes(String name) {
        UserManagementPage fullName = new UserManagementPage();
        fullName.name.clear();
        BrowserUtils.waitFor(3);
        fullName.name.sendKeys(name);
        fullName.saveChanges.click();


    }

    @Then("librarian should get {string}")
    public void librarian_should_get(String string) {
       UserManagementPage popUp1 = new UserManagementPage();
        String expectedPopUp = "The user updated.";
        String actualPopUp = popUp1.popUp.getText();
        Assert.assertEquals("verify popUp", expectedPopUp, actualPopUp);


   }
}

