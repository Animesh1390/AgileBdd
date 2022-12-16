package org.example;

import org.openqa.selenium.By;

public class ConfirmOrder extends Utils
{

    private By _Confirm = By.cssSelector("button.button-1.confirm-order-next-step-button");
    public void toConfirmOrder()
    {

        clickOnElement(_Confirm);

    }
}
