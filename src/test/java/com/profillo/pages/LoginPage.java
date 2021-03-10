package com.profillo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.profillo.utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement userName;


    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(css ="button[type='submit']")
    public WebElement singIn;


    @FindBy(xpath="//span[text()='Users']")
    public WebElement usersButton;

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        singIn.click();
    }
}