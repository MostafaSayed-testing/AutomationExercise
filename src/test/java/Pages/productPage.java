package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage extends Base {

    //Product_Locators

    final private By productPageLinkLocator = By.xpath("//*[@href=\"/products\"]");
    final private By ViewFirstProductLocator = By.xpath("//*[@href=\"/product_details/1\"]");
    final private By addToCartButton = By.xpath("//*[@class=\"btn btn-default cart\"]");
    final private By viewCartButton = By.xpath("//*[@href=\"/view_cart\"]//u");

    public productPage(WebDriver driver) {
        super(driver);
    }

    //Product_Methods

    public void clickOnProductPage(){

        click(productPageLinkLocator);
    }


    public void viewProduct(){

        click(ViewFirstProductLocator);

    }

    public void addProductToCart(){


        click(addToCartButton);


    }

    public void goToCheckOutPage() {

        click(viewCartButton);
    }









}
