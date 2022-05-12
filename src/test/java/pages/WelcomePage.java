package pages;
import org.openqa.selenium.WebDriver;



public class WelcomePage extends BasePage{

    public WelcomePage(WebDriver driver) {
        super(driver);
    }
    public void open(String url) {
        driver.get(url);
    }
}
