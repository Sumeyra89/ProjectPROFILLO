package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStatusPage {
    public UserStatusPage() {
        PageFactory.initElements( Driver.get(), this);
    }
    @FindBy(xpath="//a[contains(@class,'btn btn-primary')]")
    public WebElement editUserButton;
    @FindBy(id = "status")
    public WebElement userStatusDropdown;
    @FindBy(xpath ="//button[contains(@class, 'btn btn-primary')]")
    public WebElement saveChanges;
}
