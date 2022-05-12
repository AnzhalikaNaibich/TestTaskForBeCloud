package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Random;

public class Pixenio extends BasePage{
    private By login = By.xpath("//*[@id=\"navbar-menu\"]/div/div[2]/div/ul/li[2]/a/span");
    private By register = By.xpath("//*[@id=\"app\"]/div[3]/a");
    private By email = By.id("email");
    private By password = By.id("password");
    private By term = By.xpath("//*[@id=\"page-content\"]/div/div[2]/form/div[3]/label/span");
    private By agree = By.xpath("//*[@id=\"page-content\"]/div/div[2]/form/div[4]/label/span");
    private By buttonGetStarted = By.className("btn-primary");

    public Pixenio (WebDriver driver) {
        super(driver);
    }
    public void checkAuthorization(){
        driver.findElement(login).click();
        driver.findElement(register).click();

        Random random = new Random();
        int number = random.nextInt(1000);
        String text = "qwertyuiopasdfghjklzxcvbnm";
        char x = text.charAt(random.nextInt(text.length()));
        char y = text.charAt(random.nextInt(text.length()));
        char z = text.charAt(random.nextInt(text.length()));

        driver.findElement(email).sendKeys("" + x + y + z + number + "@mail.ru");
        driver.findElement(password).sendKeys("" + x + y + z + number);
        driver.findElement(term).click();
        driver.findElement(agree).click();
        driver.findElement(buttonGetStarted).click();
    }
}
