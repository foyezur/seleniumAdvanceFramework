package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewloginPageController {
    @FindBy(xpath = "//*[@id='header']//a[@ class='login']")
    WebElement siginButton;
    @FindBy(id = "email")
    WebElement emailsendkeys;
    @FindBy(name = "passwd")
    WebElement passwdsendkeys;
    @FindBy(css = "#SubmitLogin > span")
    WebElement SiginSubmitButton;
    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    WebElement invalidSininButtonError;


    public NewloginPageController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void InvalidSignIn(String email, String pass) throws InterruptedException {
        siginButton.click();
        Thread.sleep(500);
        emailsendkeys.sendKeys(email);
        passwdsendkeys.sendKeys(pass);
        SiginSubmitButton.click();
        Assert.assertEquals(invalidSininButtonError,invalidSininButtonError);

    }

}
