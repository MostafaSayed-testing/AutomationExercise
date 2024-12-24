package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void click(By by) {
        driver.findElement(by).click();
    }



    public void setText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }


    public String getText(By by) {
        String text = driver.findElement(by).getText();
        return text;
    }

}

