package test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import framework.Browser;

public class BaseTest {

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = Browser.getDriver();
        driver.manage().window().maximize();
    }
}
