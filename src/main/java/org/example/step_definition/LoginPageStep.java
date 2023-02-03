package org.example.step_definition;

import io.cucumber.java.en.Given;
import org.example.page_object.LoginPage;

public class LoginPageStep {

    LoginPage loginPage = new LoginPage();

    @Given("logins with username: {string} and password: {string}")
    public void userLogIn(String login, String password) {
        loginPage.authorize(login, password);
    }

}