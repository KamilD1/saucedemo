package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class BuyWithDict {
    WebDriver driver;

    public BuyWithDict(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(className = "inventory_item_name")
    List<WebElement> inventoryItemWE5;
    @FindBy(xpath = "//div[@class='pricebar']/button")
    List<WebElement> allButtonAddToCart5;
    @FindBy(className = "shopping_cart_link")
    WebElement cartLink;


    public void giveMe() {

        WebElement[] inventoryItemWE= inventoryItemWE5.toArray(new WebElement[0]);
        WebElement[] allButtonAddToCart= allButtonAddToCart5.toArray(new WebElement[0]);

        String[] arrayProduct ={"Sauce Labs Onesie","Sauce Labs Fleece Jacket","Sauce Labs Bolt T-Shirt"};

        List<String> inventoryItemL = new ArrayList<>();

        for (int i = 0; i < inventoryItemWE.length; i++){
            String product = inventoryItemWE[i].getText();
            inventoryItemL.add(product);
        }

         String[] inventoryItemT= inventoryItemL.toArray(new String[0]);

        Map<String, WebElement> slownik = new HashMap<>();

        for (int i = 0; i < inventoryItemT.length; i++) {
            slownik.put(inventoryItemT[i],allButtonAddToCart[i]);
        }
        for (String key : arrayProduct){
            if(slownik.containsKey(key)){
                WebElement button = slownik.get(key);
                button.click();
            }
        }

        cartLink.click();
        driver.findElement(By.id("checkout")).click();


    }
}




