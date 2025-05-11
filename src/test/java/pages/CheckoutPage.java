package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstNameField = By.id("first-name");
    By lastNameField = By.id("last-name");
    By zipCodeField = By.id("postal-code");
    By continueButton = By.id("continue");

    @Step("Заполняем форму покупателя: {firstName}, {lastName}, {zipCode}")
    public CheckoutPage fillingForm(String firstName, String lastName, String zipCode){
        driver.findElement(firstNameField).click();
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(zipCodeField).sendKeys(zipCode);
        return this;
    }

    @Step("Нажимаем на кнопку continue")
    public OverviewPage clickToButton(){
        driver.findElement(continueButton).click();
        return new OverviewPage(driver);
    }
}
