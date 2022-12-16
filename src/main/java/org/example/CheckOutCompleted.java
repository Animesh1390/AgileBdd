package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckOutCompleted extends Utils
{
private By _PrintMsg = By.xpath("//div[@class=\"page-title\"]/h1");
private  By _PrintMsg1 = By.xpath("//div[@class=\"section order-completed\"]//strong");
private  By _PrintMsg2 = By.xpath("//div[@class=\"order-number\"]/strong");
    public void toUserShouldCheckoutSuccessfully()
    {

       // WebElement element = driver.findElement(_PrintMsg);
      //  System.out.println(element.getText());

        WebElement element1 = driver.findElement(_PrintMsg1);
        System.out.println(element1.getText());

       // WebElement element3 = driver.findElement(_PrintMsg2);
       // System.out.println(element3);






    }
}
