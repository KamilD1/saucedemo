package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BuyProduct {
    WebDriver driver;
    public BuyProduct(WebDriver driver){
        this.driver=driver;
    }


    public void buyNewProduct(){
        List<String> listOfProduct = new ArrayList<>();
        listOfProduct.add("Sauce Labs Onesie");
        listOfProduct.add("Sauce Labs Fleece Jacket");
        listOfProduct.add("Sauce Labs Bolt T-Shirt");

        for(String product: listOfProduct){

            int number = listOfProduct.indexOf(product);
            listOfProduct.set(number, "add-to-cart-" + product.replace(" ", "-").toLowerCase());
        }
        for (String element: listOfProduct){
            driver.findElement(By.id(element)).click();
        }
    }
}
