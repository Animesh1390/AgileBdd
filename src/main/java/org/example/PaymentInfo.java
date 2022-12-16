package org.example;

import org.openqa.selenium.By;

public class PaymentInfo extends Utils
{
    private By _SelectCreditCard = By.id("CreditCardType");
    private By _CardholderName = By.id("CardholderName");
    private By _CardNumber = By.id("CardNumber");

    private By _Expirydate = By.id("ExpireMonth");
    private By _ExpireYear = By.id("ExpireYear");
    private By _Cvv = By.name("CardCode");
    private By _ContinueOnPaymentInfo = By.cssSelector("button.button-1.payment-info-next-step-button");




    public void toUpdatePaymentInfo()
    {
        waitForElementToBeVisible(_SelectCreditCard,10);
      selectFromDropdownByVisibleText(_SelectCreditCard,"Master card");
      typeText(_CardholderName,"Mr Patel");
      typeText(_CardNumber,"5319597555894039");
      selectFromDropdownByVisibleText(_Expirydate,"07");
      selectFromDropdownByVisibleText(_ExpireYear,"2024");
      typeText(_Cvv,"331");
      clickOnElement(_ContinueOnPaymentInfo);




    }
}
