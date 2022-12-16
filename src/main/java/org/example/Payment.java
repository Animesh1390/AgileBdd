package org.example;

import org.openqa.selenium.By;

public class Payment extends Utils
{

    private By _PaymentOption = By.id("paymentmethod_1");
    private By _ContinueOnPaymentPage = By.cssSelector("button.button-1.payment-method-next-step-button");


    public  void toSelectPaymentOption()
    {
        waitForElementToBeVisible(_PaymentOption,10);
        clickOnElement(_PaymentOption);
        clickOnElement(_ContinueOnPaymentPage);




    }

}
