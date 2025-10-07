package steps;

import base.BaseTests;
import pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class E2ESteps {
    HomePage homePage;
    LoginPage loginPage;
    CreateAccountPage createAccountPage;
    ResultsPage resultsPage;
    ProductPage productPage;
    AddedToCartOverlay addedToCartOverlay;
    CartPage cartPage;

    @Given("user is in the home page")
    public void UserIsInTheHomePage() {
        homePage = new HomePage(BaseTests.getDriver());
    }

    @When("click on sign in text in home page")
    public void clickOnSignInText() {
        loginPage = homePage.clickOnSignInLink();
    }

    @When("click on create account link in login page")
    public void clickOnCreateAccountLink() {
        createAccountPage = loginPage.clickOnCreateAccountLink();
    }

    @When("select social title {string} in create account page")
    public void selectSocialTitle(String title) {
        createAccountPage.selectSocialTitleSection(title);
    }

    @When("enter first name {string} in create account page")
    public void enterFirstName(String firstName) {
        createAccountPage.setFirstName(firstName);
    }

    @When("enter last name {string} in create account page")
    public void enterLastName(String lastName) {
        createAccountPage.setLastName(lastName);
    }

    @When("enter email {string} in create account page")
    public void enterEmail(String email) {
        createAccountPage.setEmail(email);
    }

    @When("enter password {string} in create account page")
    public void enterPassword(String password) {
        createAccountPage.setPassword(password);
    }

    @When("enter birthdate with month {string}, day {string} and year {string} in create account page")
    public void enterPassword(String month, String day, String year) {
        createAccountPage.setBirthdate(month, day, year);
    }

    @When("click on agree to terms and conditions check box in create account page")
    public void clickOnAgreeToTermsAndConditions() {
        createAccountPage.clickOnAgreeToTermsCheckBox();
    }

    @When("click on agree to customer data privacy check box in create account page")
    public void clickOnAgreeToCustomerDataPrivacyCheckBox() {
        createAccountPage.clickOnCustomerDataPrivacyCheckBox();
    }

    @When("click on save button in create account page")
    public void clickOnSaveButtonInCreateAccountPage() {
        homePage = createAccountPage.clickOnSaveButton();
    }

    @When("enter {string} in search bar in home page")
    public void enterSearchBar(String search) {
        resultsPage = homePage.search(search);
    }

    @When("click on product number {int} in results page")
    public void clickOnProductNumber(int productIndex) {
        productPage = resultsPage.clickOnProductByIndex(productIndex);
    }

    @Then("product image is displayed in product details page")
    public void productImageIsDisplayed() {
        Assert.assertTrue(productPage.getProductImage().isDisplayed());
    }

    @When("click on add to cart button in product page")
    public void clickOnAddToCartButton() {
        addedToCartOverlay = productPage.clickAddToCartButton();
    }

    @When("click on proceed to checkout button in added to cart overlay")
    public void clickOnProceedToCheckout() {
        cartPage = addedToCartOverlay.clickOnProceedToCheckoutButton();
    }

    @Then("added product is displayed successfully in the cart page")
    public void itemIsDisplayedSuccessfully() {
        Assert.assertTrue(cartPage.getProductNameElement().isDisplayed());
    }
}

