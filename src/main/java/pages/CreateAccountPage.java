package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

    private By socialTitleSection;
    private By firstNameField = By.id("field-firstname");
    private By lastNameField = By.id("field-lastname");
    private By emailField = By.id("field-email");
    private By passwordField = By.id("field-password");
    private By birthdateField = By.id("field-birthday");
    private By agreeToTermsCheckBox = By.xpath("//label[contains(., 'I agree to the terms and conditions')]");
    private By customerDataPrivacyCheckBox = By.xpath("//label[contains(., 'Customer data privacy')]");
    private By saveButton = By.xpath("//button[@data-link-action='save-customer']");

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void selectSocialTitleSection(String socialTitle) {
        socialTitleSection = By.xpath("//label[contains(.,'" + socialTitle + "')]");
        click(socialTitleSection);
    }

    public void setFirstName(String FirstName) {
        send(firstNameField, FirstName);
    }

    public void setLastName(String LastName) {
        send(lastNameField, LastName);
    }

    public void setEmail(String Email) {
        send(emailField, Email);
    }

    public void setPassword(String Password) {
        send(passwordField, Password);
    }

    public void setBirthdate(String month, String day, String year) {
        send(birthdateField, month + "/" + day + "/" + year);
    }

    public void clickOnAgreeToTermsCheckBox() {
        click(agreeToTermsCheckBox);
    }

    public void clickOnCustomerDataPrivacyCheckBox() {
        click(customerDataPrivacyCheckBox);
    }

    public HomePage clickOnSaveButton() {
        click(saveButton);
        return new HomePage(driver);
    }
}
