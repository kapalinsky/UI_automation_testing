package org.example.step_definition;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import org.example.utils.DriverManager;
import org.openqa.selenium.WebDriver;

public class CommonStep {

    private final WebDriver driver = DriverManager.getInstance();

    @Given("user opens {string}")
    public void openUrl(String url) {
        driver.get(url);
    }
}