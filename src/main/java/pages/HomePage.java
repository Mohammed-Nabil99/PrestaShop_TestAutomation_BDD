package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By searchField = By.name("s");
    private By signInText = By.id("_desktop_user_info");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ResultsPage search(String text) {
        send(searchField, text + "\n");
        return new ResultsPage(driver);
    }

    public LoginPage clickOnSignInLink() {
        switchToFrame("framelive");
        click(signInText);
        return new LoginPage(driver);
    }
}