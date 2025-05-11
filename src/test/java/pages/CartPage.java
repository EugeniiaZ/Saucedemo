package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    By checkout = By.id("checkout");

@Step("Нажимаем на кнопку checkout")
    public CheckoutPage clickToCheckout() {
        driver.findElement(checkout).click();
        return new CheckoutPage(driver);
    }
}
