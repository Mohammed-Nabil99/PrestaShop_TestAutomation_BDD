package pages;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    private By productName= By.xpath("//a[@data-id_customization='0']");

    public CartPage(WebDriver driver){
        super(driver);
    }

    public WebElement getProductNameElement(){
        return findElement(productName);
    }
}

