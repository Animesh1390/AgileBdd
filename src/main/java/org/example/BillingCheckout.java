package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class BillingCheckout extends  Utils
{

    private By _Country = By.id("BillingNewAddress_CountryId");
    private By _City = By.id("BillingNewAddress_City");
    private By _Address1 = By.id("BillingNewAddress_Address1");

    private By _PostCode = By.id("BillingNewAddress_ZipPostalCode");

    private By _PhoneNumber = By.id("BillingNewAddress_PhoneNumber");
        private By _ContinbueButton = By.cssSelector("button.button-1.new-address-next-step-button");











    public void toVerifyBiilyAddreessForCheckout()  {
        assertCurrentUrl("onepagecheckout");
        //selectFromDropdownByVisibleText(By.id("BillingNewAddress_CountryId"),"United Kingdom");
        selectFromDropdownByVisibleText(_Country,"United Kingdom");
        typeText(_City,"London");
        typeText(_Address1,"13 London Road");
        typeText(_PostCode," AbcAbc");
        typeText(_PhoneNumber,"123456789");
        clickOnElement(_ContinbueButton);


















    }
}
