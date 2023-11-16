package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductTable {
    WebDriver driver;

    public ProductTable(WebDriver driver) {
        this.driver = driver;
    }

    String[] arrayOfProduct = new String[]{"Sauce Labs Onesie", "Sauce Labs Fleece Jacket", "Sauce Labs Bolt T-Shirt"};

    @FindBy(className = "shopping_cart_link")
    WebElement cartLink;
    @FindBy(id="checkout" )
    WebElement chceckout;


    public void SearchProduct() {
        for (String product : arrayOfProduct) {
            driver.findElement(By.linkText(product)).click();
            List<WebElement> buttonList = driver.findElements(By.xpath("//div//button"));
            WebElement buttonAdd = buttonList.get(3);
            buttonAdd.click();
            driver.findElement(By.id("back-to-products")).click();
        }

        cartLink.click();
        chceckout.click();



    }


}
