package org.example.step_definition;


import io.cucumber.java.en.Given;
import org.example.page_object.ItemPage;

public class AddToCartStep {

    ItemPage itemPage = new ItemPage();

    @Given("adds item to the cart")
    public void addItemToTheCart() {
        itemPage.clickOnAddToCart();
    }
}