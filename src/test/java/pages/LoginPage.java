package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By loginField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By errorMessage = By.cssSelector("[data-test=error]");

    @Step("Открытие страницы LoginPage")
    public LoginPage open() {
        driver.get("https://www.saucedemo.com/");
        return this;
    }

    @Step("Вход в систему с логином: {user} и паролем: {password}")
    public ProductsPage login(String user, String password) {
        driver.findElement(loginField).sendKeys(user);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new ProductsPage(driver);
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();

    }
}
