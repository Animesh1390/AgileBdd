package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CellPhones extends Utils
{

  private By _AddtoCartCellPhone = By.xpath("//div[3][@class=\"item-box\"]/div[1]/div/div[3]//button[1]");
  private  By _ShoppingCart = By.xpath("//span[@class=\"cart-label\"]");




    public void toverifyCellPhonePage()
    {

        //assertCurrentUrl("cell-phones");

        clickOnElement(_AddtoCartCellPhone);
        clickOnElement(By.xpath("//span[@class=\"close\"]"));
        WebElement element = driver.findElement(_ShoppingCart);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        clickOnElement(By.cssSelector("button.button-1.cart-button"));














    }

}
