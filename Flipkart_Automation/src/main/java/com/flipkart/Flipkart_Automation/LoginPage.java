package com.flipkart.Flipkart_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By usernameField = By.xpath("//input[@class='_2IX_2- VJZDxU']");
    By passwordField = By.xpath("//input[@type='password']");
    By loginButton = By.xpath("//button[@type='submit']");

    // Methods
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
