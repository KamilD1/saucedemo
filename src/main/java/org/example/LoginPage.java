package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement passwordBox;

    @FindBy(id = "login-button")
    WebElement loginButton;


    public void loginPage(String login, String password) {
        userName.sendKeys(login);
        passwordBox.sendKeys(password);
        loginButton.click();
    }
}
