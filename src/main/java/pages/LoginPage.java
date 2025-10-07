package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By createAccountLink = By.partialLinkText("Create one here");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public CreateAccountPage clickOnCreateAccountLink() {
        click(createAccountLink);
        return new CreateAccountPage(driver);
    }
}