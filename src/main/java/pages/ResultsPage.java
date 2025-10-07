package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ResultsPage extends BasePage {
    private By searchedProducts = By.xpath("//div[@class='js-product product col-xs-12 col-sm-6 col-xl-3']");

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage clickOnProductByIndex(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(searchedProducts));
        products.get(productIndex - 1).click();
        return new ProductPage(driver);
    }
}
