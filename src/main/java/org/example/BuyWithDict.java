package org.example;

import java.math.*;

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
    List<WebElement> listInventoryItemWE;
    @FindBy(xpath = "//div[@class='pricebar']/button")
    List<WebElement> listAllButtonAddToCart;

    public void giveMe() {

        WebElement[] inventoryItemWE = listInventoryItemWE.toArray(new WebElement[0]);
        WebElement[] allButtonAddToCart = listAllButtonAddToCart.toArray(new WebElement[0]);

        String[] arrayProduct = {"Sauce Labs Onesie", "Sauce Labs Fleece Jacket", "Sauce Labs Bolt T-Shirt"};

        List<String> inventoryItemL = new ArrayList<>();

        for (int i = 0; i < inventoryItemWE.length; i++) {
            String product = inventoryItemWE[i].getText();
            inventoryItemL.add(product);
        }

        String[] inventoryItemT = inventoryItemL.toArray(new String[0]);

        Map<String, WebElement> mapItemButton = new HashMap<>();

        for (int i = 0; i < inventoryItemT.length; i++) {
            mapItemButton.put(inventoryItemT[i], allButtonAddToCart[i]);
        }


        for (String key : arrayProduct) {
            if (mapItemButton.containsKey(key)) {
                WebElement button = mapItemButton.get(key);
                button.click();
            }
        }
    }
}




