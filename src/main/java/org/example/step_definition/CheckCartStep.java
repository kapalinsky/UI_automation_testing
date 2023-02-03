package org.example.step_definition;

import io.cucumber.java.en.Then;
import org.example.page_object.CartPage;
import org.testng.Assert;

public class CheckCartStep {

    CartPage cartPage = new CartPage();

    @Then("should be {string} item in the cart")
    public void checkingCart(String cartItem) {
        Assert.assertEquals(cartPage.getInventoryItemElement().getText(), cartItem);
    }
}