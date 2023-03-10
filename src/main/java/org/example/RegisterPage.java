package org.example;// org.example is the package in java to store the classes

import org.openqa.selenium.By; //contains the WebDriver class needed to instantiate a new browser loaded with a specific driver. org.
import org.testng.Assert; // Imported Assertions in TestNG are a way to verify that the expected .

public class RegisterPage extends Utils // Extends keyword used (Inheritance concept) to use Util class methods.
{
    String regMsg = "register";

    //Private Global Variable Declared to store the locator (By.xpath, Id ,Class name, use for same class only.)
    private  By _registerIcon = By.className("ico-register" );
    private By _genderField = By.id("gender-male");
    private By _firstNameField = By.id("FirstName");
    private By _lastNameField = By.id("LastName");
    private By _birthDayField = By.name("DateOfBirthDay");
    private By _dateOfBirthMonthField = By.name("DateOfBirthMonth");
    private By _dateOfBirthYearField =  By.name("DateOfBirthYear");
    private By _emailField = By.id("Email");
    private By _companyField = By.id("Company");
    private By _newsField = By.xpath("//input[@id='Newsletter']");
    private By _passWordField = By.id("Password");
    private By _confirmPasswordField = By.id("ConfirmPassword");
    private By _registerButtonSubmit  = By.id("register-button");

    private By _Continue = By.xpath("//a[@class=\"button-1 register-continue-button\"]");


    //  assertFalse() methods checks whether the expected value is false or not.
    // verifyUserIsOnRegisterPage Test Case for Register Page.




    public void verifyUserIsOnRegisterPage ()
    {
        Assert.assertEquals(regMsg ,"register");


    }

    public void enterRegistrationDetail() // Test Case for Registration Detail
    {
        //Reusable Method Called from Util Class & called Variable from Register Page.
        clickOnElement(_registerIcon);
        clickOnElement(_genderField);
        typeText(_firstNameField,LoadProp.getProperty("firstname"));
        typeText(_lastNameField,LoadProp.getProperty("lastname"));

        selectFromDropdownByVisibleText(_birthDayField,LoadProp.getProperty("dateofbirth"));
        selectFromDropdownByVisibleText(_dateOfBirthMonthField,LoadProp.getProperty("month"));
        selectFromDropdownByVisibleText(_dateOfBirthYearField,LoadProp.getProperty("year"));

        typeText(_emailField,LoadProp.getProperty("email")+getTimeStamp()+LoadProp.getProperty(("email1")));
        typeText(_companyField,LoadProp.getProperty("companyname"));
        clickOnElement(_newsField);

        typeText(_passWordField,LoadProp.getProperty("password"));
        typeText(_confirmPasswordField,LoadProp.getProperty("confirmpassword"));
        WaitForElementToBeClickable(_registerButtonSubmit,30);
        clickOnElement(_registerButtonSubmit);

        clickOnElement(_Continue);





    }





}
