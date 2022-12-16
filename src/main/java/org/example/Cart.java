package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Cart extends Utils
{

    private By _Qty = By.className("qty-input");

    private By _UpdateCart = By.id("updatecart");
    private By _TermsOfService =By.id("termsofservice");
    private By _Checkout = By.xpath("//div[@class=\"checkout-buttons\"]//button");


    public void toUpdateCarts()
    {
        //assertCurrentUrl("cart");
        driver.findElement(_Qty).sendKeys(Keys.BACK_SPACE);
        driver.findElement(_Qty).sendKeys("3");
        clickOnElement(_UpdateCart);
        clickOnElement(_TermsOfService);
        clickOnElement(_Checkout);




    }
}
