package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class AddRandomProduct {
    WebDriver driver;
    public AddRandomProduct(WebDriver driver){
        this.driver = driver;}

    @FindBy(xpath ="//div[@class='pricebar']/button")
    List<WebElement> allButtonAddToCart;
    @FindBy(xpath ="//div[@class='inventory_item_name ']")
    List<WebElement> allInventoryProductName;

    public void addRandomProduct(){

        Random random = new Random();
        int randomIndex = random.nextInt(allButtonAddToCart.size());

        allButtonAddToCart.get(randomIndex).click();
        String productName = allInventoryProductName.get(randomIndex).getText();
        System.out.println("You add to Cart :" + productName);

    }
}
