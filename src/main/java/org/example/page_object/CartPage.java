package org.example.page_object;

import org.example.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private WebDriver driver = DriverManager.getInstance();


    private final By inventoryItemElement = By.className("inventory_item_name");
    private final By cartTitleElement = By.xpath("//span[@class='title']");


    public WebElement getInventoryItemElement() {
        return driver.findElement(inventoryItemElement);
    }

    public WebElement getCartTitle() {
        return driver.findElement(cartTitleElement);
    }
}