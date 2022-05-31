package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WelcomePage;
import pages.GosUslugi;
import pages.Icons;
import pages.Pixenio;
import java.time.Duration;
import static framework.Browser.driver;

public class TestTask extends BaseTest {

    @Test
    public void firstTest() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.open("https://icons8.com");
        Icons icon = new Icons(driver);
        icon.checkClickEmoji();
        Assert.assertEquals(driver.getCurrentUrl(), "https://icons8.com/icons/emoji", "emoji page don't open");
    }

    @Test
    public void secondTestAuth() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.open("https://pixenio.com");
        Pixenio pixenio = new Pixenio(driver);
        pixenio.checkAuthorization();
        WebElement secondPage = driver.findElement(By.className("steps"));
        Assert.assertTrue(secondPage.isDisplayed(), "you don't authorization on web-site");
    }

    @Test
    public void thirdTestWait() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.open("https://www.gosuslugi.ru");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("app-portal")));
        GosUslugi gosuslugi = new GosUslugi(driver);
        gosuslugi.checkWaitDisplayed();
        Assert.assertEquals(driver.getCurrentUrl(), "https://esia.gosuslugi.ru/login/", "page for authorization don't open");
    }
}
