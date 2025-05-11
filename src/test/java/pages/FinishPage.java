package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage {
    WebDriver driver;

    public FinishPage(WebDriver driver) {
        this.driver = driver;
    }

    By completeMessage = By.cssSelector("[data-test=complete-header]");

    public String getMessage(){
        return driver.findElement(completeMessage).getText();
    }
}
