package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By title = By.xpath("//*[text() = 'Products']");
    String productPattern = "//*[text()='%s']/ancestor::div[@class='inventory_item']//button";
    By cart = By.cssSelector("[data-test='shopping-cart-link']");

    public boolean titleIsDisplayed() {
        return driver.findElement(title).isDisplayed();
    }

    @Step("Добавляем в корзину товар: {product}")
    public ProductsPage clickAddToCart(String product) {
        driver.findElement(By.xpath(String.format(productPattern, product))).click();
        return this;
    }

    @Step("Нажимаем на корзину")
    public CartPage clickToCart() {
        driver.findElement(cart).click();
        return new CartPage(driver);
    }
}
