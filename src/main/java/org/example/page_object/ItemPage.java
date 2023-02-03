package org.example.page_object;

import org.example.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemPage {

    private WebDriver driver = DriverManager.getInstance();

    private final By itemTitle = By.className("inventory_details_name");
    private final By removeButton = By.id("remove-sauce-labs-backpack");
    private final By addToCartButton = By.name("add-to-cart-sauce-labs-backpack");
    private final By goToCartButton = By.className("shopping_cart_link");


    public WebElement getItemTitle() {
        return driver.findElement(itemTitle);
    }

    public WebElement getRemoveButtonTitle() {
        return driver.findElement(removeButton);
    }

    public void clickOnAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void goToCart() {
        driver.findElement(goToCartButton).click();
    }
}