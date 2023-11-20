package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AllElements {
    WebDriver driver;

    public AllElements(WebDriver driver) {
        this.driver = driver;
    }


    public void giveAllProduct() {

        List<String> listOfProduct = new ArrayList<>();
        listOfProduct.add("Sauce Labs Onesie");
        listOfProduct.add("Sauce Labs Fleece Jacket");
        listOfProduct.add("Sauce Labs Bolt T-Shirt");

        for (String element : listOfProduct) {
            String button = "add-to-cart-" + element.replace(" ", "-");
            driver.findElement(By.id(button.toLowerCase())).click();


        }
    }
}
