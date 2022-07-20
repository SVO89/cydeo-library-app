package com.cydeo.library.stepDef;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.util.BrowserUtils;
import com.cydeo.library.util.ConfigurationReader;
import com.cydeo.library.util.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ObjectInputFilter;
import java.lang.module.Configuration;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));
    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        loginPage.signInBtn.click();
    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://library2.cydeo.com/#dashboard";
        Assert.assertEquals("The URL does not match",expectedURL, actualURL);
    }

    @When("I login as a student")
    public void i_login_as_a_student() {
        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        loginPage.signInBtn.click();
    }
    @Then("books should be displayed")
    public void books_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





}
