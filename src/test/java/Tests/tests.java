package Tests;

import Pages.checkoutPage;
import Pages.homePage;
import Pages.loginPage;
import Pages.productPage;
import org.testng.annotations.Test;

public class tests extends testbase{
    homePage home ;
    loginPage login ;
    productPage product;
    checkoutPage check ;

    @Test
    public void userLoginWithExistingEmail() {

        home = new homePage(driver);
        login = new loginPage(driver);
        product = new productPage(driver);
        check = new checkoutPage(driver);


        //Home Page

        home.ClickOnLoginButton();


        //Login_To_ExistingAccount

        login.loginDataInfo("mostafasayed4243@gmail.com" , "Mostafa123");

       //Go_To_ProductPage_To_Add_The Product To The Cart Then Checkout

       product.clickOnProductPage();
       product.viewProduct();
       product.addProductToCart();
       product.goToCheckOutPage();

     //Complete The Checkout process and place the order

       check.clickOnProceedToCheckoutButton();
       check.clickOnPlaceOrderButton();
       check.paymentInfo( "Mostafa ElSayed" , "4558987245200022" , " 455 ", "02", "2026");
       check.clickOnSubmitButton();






    }


}
