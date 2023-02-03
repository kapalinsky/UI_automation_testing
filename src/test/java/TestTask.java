import org.example.page_object.CartPage;
import org.example.page_object.InventoryPage;
import org.example.page_object.ItemPage;
import org.example.page_object.LoginPage;
import org.example.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.example.constants.Generic.SAUCE_URL;

public class TestTask {

    WebDriver driver;

    LoginPage loginPage;
    InventoryPage inventoryPage;
    ItemPage itemPage;
    CartPage cartPage;

    @BeforeMethod
    public void startUp() {
        driver = DriverManager.getInstance();
        loginPage = new LoginPage();
        inventoryPage = new InventoryPage();
        itemPage = new ItemPage();
        cartPage = new CartPage();

    }

    @Test
    public void addToCartProductTest() {
        driver.get(SAUCE_URL);
        loginPage.authorize("standard_user", "secret_sauce");
        Assert.assertEquals(inventoryPage.getTitleElement().getText(), "PRODUCTS");
        inventoryPage.clickOnProductByLabel("Sauce Labs Backpack");
        Assert.assertEquals(itemPage.getItemTitle().getText(), "Sauce Labs Backpack");
        itemPage.clickOnAddToCart();
        Assert.assertEquals(itemPage.getRemoveButtonTitle().getText(), "REMOVE");
        itemPage.goToCart();
        Assert.assertEquals(cartPage.getCartTitle().getText(), "YOUR CART");
        Assert.assertEquals(cartPage.getInventoryItemElement().getText(),"Sauce Labs Backpack");
    }


    @AfterMethod
    public void tearDown() {
        DriverManager.closeDriver();
    }
}