package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {


    @Test (testName = "проверка функциональности интернет-магазина")
    @Owner("Евгения")
    @Epic("ITM-13")
    @Feature("ITM-13-1")
    @Story("ITM-13-1-1")
    @Description("проверка функциональности интернет-магазина")
    @Severity(SeverityLevel.CRITICAL)
    @Flaky
    @TmsLink("jira.com/ITM-13")
    @Issue("jira.com/ITM-13/1")
    @Link("htpps://www.saucedemo.com/")
    public void checkoutTest() {
        loginPage.open()
                .login("standard_user", "secret_sauce")
                .clickAddToCart("Sauce Labs Bike Light")
                .clickToCart()
                .clickToCheckout()
                .fillingForm("Ivan", "Ivanov", "12345")
                .clickToButton()
                .clickToFinish();
        Assert.assertEquals(finishPage.getMessage(), "Thank you for your order!");

    }

}
