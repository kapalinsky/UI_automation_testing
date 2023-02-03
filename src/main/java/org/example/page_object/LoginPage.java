package org.example.page_object;

import org.example.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver = DriverManager.getInstance();

    private final By loginField = By.id("user-name");
    private final By passwordField = By.name("password");
    private final By loginButton = By.xpath("//input[contains(@class,'submit-button')]");


    public void authorize(String login, String password) {
        driver.findElement(loginField).sendKeys(login);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}