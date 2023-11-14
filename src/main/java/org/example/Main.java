package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamil\\Desktop\\sda Tester\\java\\\\saucedemo\\Chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        loginPage.loginPage("standard_user", "secret_sauce");
        productPage.addProductToCart();
        productPage.chceckOutInformation("Jan","Kowalski","00-999");



    }
}