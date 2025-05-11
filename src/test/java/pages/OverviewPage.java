package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {
    WebDriver driver;

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    By finishButton = By.id("finish");

    @Step("Нажимаем на кнопку finish")
    public FinishPage clickToFinish(){
        driver.findElement(finishButton).click();
        return new FinishPage(driver);
    }
}
