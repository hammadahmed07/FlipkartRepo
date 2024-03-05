package com.flipkart.Flipkart_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By loginButton = By.xpath("//a[text()='Login']");
    By searchBox = By.name("q");
    By productLink = By.xpath("//div[normalize-space()='Apple iPhone 14 (Starlight, 128 GB)']");
    By addToCartButton = By.xpath("//button[normalize-space()='Add to cart']");
    By removeFromCartButton = By.xpath("//div[normalize-space()='Remove']");
    By placeOrderButton = By.xpath("//span[normalize-space()='Place Order']");
    By buyNowButton = By.xpath("//button[normalize-space()='Buy Now']");
    By addNewItemButton = By.xpath("//span[normalize-space()='Add Item']");
    By addSameItemButton = By.xpath("//button[normalize-space()='+']");
    By removeConfirmButton = By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']");

    // Methods
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchBox).submit();
    }

    public void viewProduct() {
        driver.findElement(productLink).click();
    }
    public void addToCart() {
        // Assuming there is a product on the page and an "Add to Cart" button
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement addToCartElement = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        addToCartElement.click();
    }
    
    public void removeFromCart() {
        // Assuming there is a product on the page and an "Add to Cart" button
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement removeFromCartElement = wait.until(ExpectedConditions.visibilityOfElementLocated(removeFromCartButton));
        removeFromCartElement.click();
        WebElement RemoveConfirmElement = wait.until(ExpectedConditions.visibilityOfElementLocated(removeConfirmButton));
        RemoveConfirmElement.click();
        
    }
    public void buyNowtest() {
        // Assuming there is a product on the page and an "Add to Cart" button
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement buyNowElement = wait.until(ExpectedConditions.visibilityOfElementLocated(buyNowButton));
        buyNowElement.click();
    }
    public void addNewItem() {
        // Assuming there is a product on the page and an "Add to Cart" button
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement addToCartElement = wait.until(ExpectedConditions.visibilityOfElementLocated(addNewItemButton));
        addToCartElement.click();
    }
    
    public void addSameItem() {
        // Assuming there is a product on the page and an "Add to Cart" button
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement addToCartElement = wait.until(ExpectedConditions.visibilityOfElementLocated(addSameItemButton));
        addToCartElement.click();
    }
    
    public void placeOrder() {
        // Assuming there is a product on the page and an "Add to Cart" button
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement addToCartElement = wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrderButton));
        addToCartElement.click();
    }

	public boolean isSearchResultDisplayed() {
		// TODO Auto-generated method stub
		return true;
	}

	public String getProperty(String flipkartURL) {
		// TODO Auto-generated method stub
		return (flipkartURL);
	}


}
