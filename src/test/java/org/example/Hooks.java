package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.example.BasePage.driver;

public class Hooks
{
    DriverManager driverManager = new DriverManager();
    @Before
    public void setUp()
    {
        //The open() method opens a new browser window, or a new tab.
        driverManager.openBrowser();

    }
    @After
    public void teardown(Scenario scenario)
    {
        if (scenario.isFailed())
        {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/jpg","screenshots");



        }
        driverManager.closeBrowser();
    }


}



