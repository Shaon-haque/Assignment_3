package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args){
        System.setProperty( " webdriver.crome.Driver "," src/main/resources/chromedriver.exe ");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get( "https://www.saucedemo.com/");
        String title = driver.getTitle();
        System.out.println(title);

        // WebElement  username = driver.findElement(By.id("user-name"));
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//input[@data-test=\"password\"]"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.xpath("//input[@class=\"submit-button btn_action\"]"));
        login.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement threeline = driver.findElement(By.xpath("//button[contains(@id,'react-burger-menu-btn')]"));
        System.out.println("Open Menu");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement Product = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        Product.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement addtocart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addtocart.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement add = driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]"));
        add.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement checkout = driver.findElement(By.xpath("//button[@data-test=\"checkout\" and @id=\"checkout\"]"));
        checkout.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement name = driver.findElement(By.xpath("//input[@id=\"first-name\"]"));
        name.sendKeys("shaon");

        WebElement last = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
        last.sendKeys("haque");

        WebElement postalcode = driver.findElement(By.xpath("//input[@id=\"postal-code\"]"));
        postalcode.sendKeys("1215");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement Continue = driver.findElement(By.xpath("//input[@id=\"continue\" and @type=\"submit\"]"));
        Continue.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement Finish = driver.findElement(By.xpath("//button[@class=\"btn btn_action btn_medium cart_button\"]"));
        Finish.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement X = driver.findElement(By.xpath("//a[text()=\"Twitter\"]"));
        X.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement FB = driver.findElement(By.xpath("//a[text()=\"Facebook\"]"));
        FB.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement LinkIn = driver.findElement(By.xpath("//a[text()=\"LinkedIn\"]"));
        LinkIn.click();

        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
