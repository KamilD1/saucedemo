package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LockedOutUser {
    WebDriver driver;

    public LockedOutUser(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "user-name")
    WebElement userName;
    @FindBy(id = "password")
    WebElement loginBox;
    @FindBy(id = "login-button")
    WebElement loginButton;


    public void LockedUser(String login, String password) {
        userName.sendKeys(login);
        loginBox.sendKeys(password);
        loginButton.click();

        WebElement message = driver.findElement(By.className("error-message-container error"));
        String alfa = message.getText();


        //String message = errorMessage.getText();
        System.out.println(alfa);
    }

}
