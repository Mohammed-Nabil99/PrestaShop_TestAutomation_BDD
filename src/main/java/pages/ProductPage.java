package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    private By productImage = By.xpath("//img[@class='js-qv-product-cover img-fluid']");
    private By addToCartButton = By.xpath("//button[@class='btn btn-primary add-to-cart']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public AddedToCartOverlay clickAddToCartButton() {
        click(addToCartButton);
        return new AddedToCartOverlay(driver);
    }

    public WebElement getProductImage() {
        return findElement(productImage);
    }
}
