package org.example;

import org.openqa.selenium.By;

public class Shipping extends Utils
{
    private By _ShippingMethod = By.xpath("//div[@class=\"method-name\"]//input[@id=\"shippingoption_0\"]");
    private By _Continue2 = By.cssSelector("button.button-1.shipping-method-next-step-button");

    public void toAddShipingAddress()
    {

        waitForElementToBeVisible(_ShippingMethod,10);
        clickOnElement(_ShippingMethod);
        clickOnElement(_Continue2);



    }

}
