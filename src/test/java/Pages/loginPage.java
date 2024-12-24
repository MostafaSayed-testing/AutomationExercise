package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends Base {


    // Locators of LoginPage

    final private By emailAddressFieldLocator = By.xpath("//*[@data-qa=\"login-email\"]");
    final private  By passwordFieldLocator = By.xpath("//*[@data-qa=\"login-password\"]");
    final private  By loginButtonLocator = By.xpath("//*[@data-qa=\"login-button\"]");

    public loginPage(WebDriver driver) {
        super(driver);
    }

    //Method to enter the User Login data

    public void loginDataInfo(String email , String password) {

      setText(emailAddressFieldLocator , email);
      setText(passwordFieldLocator , password);
      click(loginButtonLocator);
    }

public void clickOnLoginButton () {


        click(loginButtonLocator);}


}

