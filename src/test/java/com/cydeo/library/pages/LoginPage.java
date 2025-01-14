package com.cydeo.library.pages;

import com.cydeo.library.util.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://library2.cydeo.com/login.html
public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[text() = 'Sign in']")
    public WebElement signInBtn;
}