package org.example.step_definition;

import io.cucumber.java.After;
import org.example.utils.DriverManager;

public class Hooks {

    @After
    public void tearDown() {
        DriverManager.closeDriver();
    }
}