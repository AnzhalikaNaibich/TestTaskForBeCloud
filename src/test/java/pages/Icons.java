package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Icons extends BasePage {
    private By emoji = By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/section[2]/div[2]/a[3]");

    public Icons (WebDriver driver) {
        super(driver);
    }
    public void checkClickEmoji(){
        driver.findElement(emoji).click();
    }
}
