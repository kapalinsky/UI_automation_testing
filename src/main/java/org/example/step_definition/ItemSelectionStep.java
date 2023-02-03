package org.example.step_definition;

import io.cucumber.java.en.Given;
import org.example.page_object.InventoryPage;

public class ItemSelectionStep {

    InventoryPage inventoryPage = new InventoryPage();

    @Given("selects {string} item")
    public void productSelection(String label) {
        inventoryPage.clickOnProductByLabel(label);
    }

}