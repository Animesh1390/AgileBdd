package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs
{
    HomePage homePage = new HomePage();
    RegisterPage registerPage =new RegisterPage();
    RegisterReslutPage registerReslutPage = new RegisterReslutPage();

    Shipping shipping = new Shipping();
    PaymentInfo paymentInfo = new PaymentInfo();
    Payment payment = new Payment();
    ConfirmOrder confirmOrder = new ConfirmOrder();
    CheckOutCompleted checkOutCompleted =new CheckOutCompleted();
    CellPhones cellPhones = new CellPhones();
    Cart cart = new Cart();
    BillingCheckout billingCheckout = new BillingCheckout();


//    @Given("I am on register page")
//    public void i_am_on_register_page()
//    {
//        registerPage.verifyUserIsOnRegisterPage();
//
//    }
//    @When("I enter required registration details")
//    public void i_enter_required_registration_details()
//    {
//        registerPage.enterRegistrationDetail();
//
//    }
//
//    @Then("I should able to register successfully")
//    public void i_should_able_to_register_successfully()
//    {
//        registerReslutPage.RegisterResultToVerify();
//    }
//

    @Given("I am registered user")
    public void i_am_registered_user() {
        homePage.verifyRegisterButton();
        registerPage.verifyUserIsOnRegisterPage();
        registerPage.enterRegistrationDetail();


    }
    @When("I add product to cart")
    public void i_add_product_to_cart() {
        cellPhones.toverifyCellPhonePage();
        cart.toUpdateCarts();

    }
    @When("I enter personal details for checkout")
    public void i_enter_personal_details_for_checkout() {
        billingCheckout.toVerifyBiilyAddreessForCheckout();
        shipping.toAddShipingAddress();
        payment.toSelectPaymentOption();


    }
    @When("I enter valid card details")
    public void i_enter_valid_card_details() {
        paymentInfo.toUpdatePaymentInfo();


    }
    @Then("I should be able to buy a product successfully")
    public void i_should_be_able_to_buy_a_product_successfully() {
        confirmOrder.toConfirmOrder();
        checkOutCompleted.toUserShouldCheckoutSuccessfully();
    }






}
