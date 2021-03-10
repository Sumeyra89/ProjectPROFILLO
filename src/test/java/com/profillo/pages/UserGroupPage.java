package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserGroupPage extends BasePage {

   public UserGroupPage() {
       PageFactory.initElements( Driver.get(), this);
    }
    @FindBy(xpath="//a[contains(@class,'btn btn-primary')]")    //   //a[@onclick='Users.edit_user(421)']
    public WebElement editUserButton;
    @FindBy(id = "user_group_id")
    public WebElement userGroupDropdown;
    //@FindBy(xpath = "//h5[text()='Edit User Information']")
    //public WebElement editWindow; //edit user information penceresi
    @FindBy(xpath ="//button[contains(@class, 'btn btn-primary')]")
    public WebElement saveChanges;
    @FindBy (xpath = "//div[@class='toast-message']") //updated
    public WebElement popUp;
}
