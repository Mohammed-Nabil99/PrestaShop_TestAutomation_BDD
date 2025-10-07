package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddedToCartOverlay extends BasePage {

    private By proceedToCheckoutButton = By.partialLinkText("CHECKOUT");

    public AddedToCartOverlay(WebDriver driver){
        super(driver);
    }

    public CartPage clickOnProceedToCheckoutButton(){
        click(proceedToCheckoutButton);
        return new CartPage(driver);
    }
}
