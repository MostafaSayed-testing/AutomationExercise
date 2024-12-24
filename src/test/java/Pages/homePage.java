package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends Base {
    public homePage(WebDriver driver) {
        super(driver);
    }
 //Locators Of HomePage
    final private By loginSignUpButton = By.xpath("//*[@href=\"/login\"]");


    public void ClickOnLoginButton(){

        click(loginSignUpButton);
    }

    public void clickOnSignButton() { click(loginSignUpButton);}
}










