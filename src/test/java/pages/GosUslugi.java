package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class GosUslugi extends BasePage{
    private By cifrovueProfessii = By.className("title-h5");
    private By record = By.className("button-container");

    public GosUslugi (WebDriver driver) {
        super(driver);
    }

    public void checkWaitDisplayed(){
        driver.findElement(cifrovueProfessii).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("discount-courses")));

        List<WebElement> courses = driver.findElements(By.className("course-img"));
        Random random = new Random();
        courses.get(random.nextInt(courses.size()-1)).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("course-details")));

        driver.findElement(record).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("form-container")));
    }
}
