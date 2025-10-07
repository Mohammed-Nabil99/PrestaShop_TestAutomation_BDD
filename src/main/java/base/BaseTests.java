package base;

import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    protected static WebDriver driver;
    protected static HomePage homePage;

    public void setUp() {
        driver = new ChromeDriver();
        goHome();
    }

    public void goHome() {
        driver.get("https://demo.prestashop.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
