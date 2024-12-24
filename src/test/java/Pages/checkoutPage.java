package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage extends Base{
    public checkoutPage(WebDriver driver) {super(driver); }


    //CheckOut_Page Locators

    final private By proceedToCheckoutButton = By.xpath("//*[@class=\"btn btn-default check_out\"]");
    final private By placeOrderButton = By.xpath("//*[@href=\"/payment\"]");

    final private By nameOnCardLocator = By.xpath("//*[@name=\"name_on_card\"]");
    final private By cardNumberLocator = By.xpath("//*[@name=\"card_number\"]");
    final private By cvvLocator = By.xpath("//*[@name=\"cvc\"]");
    final private By expirationMonthLocator = By.xpath("//*[@name=\"expiry_month\"]");
    final private By expirationYearLocator = By.xpath("//*[@name=\"expiry_year\"]");
    final private By payAndConfirmOrderButton = By.xpath("//*[@id=\"submit\"]");


//Methods

    public void clickOnProceedToCheckoutButton() {

        click(proceedToCheckoutButton);
    }

    public void clickOnPlaceOrderButton() {
        click(placeOrderButton);
    }


    public void paymentInfo(String CardName , String CardNumber , String CVV , String expirationMonth , String expirationYear)
    {

        setText(nameOnCardLocator , CardName);
        setText(cardNumberLocator , CardNumber);
        setText(cvvLocator , CVV);
        setText(expirationMonthLocator , expirationMonth);
        setText(expirationYearLocator , expirationYear);
    }

    public void clickOnSubmitButton() {


        click(payAndConfirmOrderButton);

    }









}
