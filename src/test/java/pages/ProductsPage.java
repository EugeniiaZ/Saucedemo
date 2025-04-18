package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By title = By.xpath("//*[text() = 'Products']");
    public boolean titleIsDisplayed() {
        return driver.findElement(title).isDisplayed();
    }
}
