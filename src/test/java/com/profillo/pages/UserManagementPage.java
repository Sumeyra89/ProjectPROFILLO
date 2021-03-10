package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage extends BasePage {

    public UserManagementPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[contains(@placeholder, 'Full Name')]")
    public WebElement name;


    @FindBy(xpath = "//input[contains(@placeholder,'Password')]")
    public WebElement password;


    @FindBy(xpath ="//button[contains(@class, 'btn btn-primary')]")
    public WebElement saveChanges;

    @FindBy(css = ".toast-message")
    public WebElement popUp;
}

