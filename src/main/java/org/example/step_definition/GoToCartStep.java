package org.example.step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.page_object.CartPage;
import org.example.page_object.ItemPage;

public class GoToCartStep {

    ItemPage itemPage = new ItemPage();

    @When("goes to the cart")
    public void goToTheCart() {
        itemPage.goToCart();
    }

}