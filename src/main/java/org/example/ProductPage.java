package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement addToCart1;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart2;
    @FindBy(className = "shopping_cart_link")
    WebElement shopCart;
    @FindBy(id = "checkout")
    WebElement checkout;
    @FindBy(id = "first-name")
    WebElement firstName;
    @FindBy(id = "last-name")
    WebElement lastName;
    @FindBy(id = "postal-code")
    WebElement postalCode;
    @FindBy(id = "continue")
    WebElement continueButton;
    @FindBy(id = "finish")
    WebElement finishButton;
    @FindBy(className = "complete-header")
    WebElement completeHeader;
    @FindBy(id = "back-to-products")
    WebElement backHome;
    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutButton;
    @FindBy(className="shopping_cart_link")
    WebElement cartLink;

    public void addProductToCart() {
        addToCart1.click();
        addToCart2.click();
        shopCart.click();
        checkout.click();
    }

    public void chceckOutInformation(String fName, String lName, String zipCode) {
        cartLink.click();
        driver.findElement(By.id("checkout")).click();
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        postalCode.sendKeys(zipCode);
        continueButton.click();
        finishButton.click();
        String lastText = completeHeader.getText();
        System.out.println(lastText);
        backHome.click();
        //menuButton.click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        //logoutButton.click();
    }
}

