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

    List<String> allProductsName = new ArrayList<>();

    @FindBy(xpath = "//div[@class='inventory_item_name ']")
    List<WebElement> inventoryItem;
    @FindBy(className = "shopping_cart_link")
    WebElement cartLink;


    public void giveAllProduct() {

        List<String> listOfProduct = new ArrayList<>();
        listOfProduct.add("Sauce Labs Onesie");
        listOfProduct.add("Sauce Labs Fleece Jacket");
        listOfProduct.add("Sauce Labs Bolt T-Shirt");


        for (WebElement element : inventoryItem) {
            String productName = element.getText();
            allProductsName.add(productName);
        }

        listOfProduct.retainAll(allProductsName);

        for (String element : listOfProduct) {
            String button = "add-to-cart-" + element.replace(" ", "-");
            driver.findElement(By.id(button.toLowerCase())).click();


        }
        cartLink.click();
        driver.findElement(By.id("checkout")).click();

    }

}
