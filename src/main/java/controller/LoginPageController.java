package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageController {
    @FindBy(xpath = "//a[@class='login']")
    WebElement signinTab;
    @FindBy(id="email")
    WebElement inputEmail;
    @FindBy(id="passwd")
    WebElement inputPass;
    @FindBy(css = "#SubmitLogin > span")
    WebElement signinButton;

    public LoginPageController(WebDriver driver){
        PageFactory.initElements(driver,this);}

   public void signinButton(WebDriver driver){
        // WebElement element =driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
        // element.isDisplayed();
        //System.out.println(element);
        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
    }
    public void logIn() throws InterruptedException {
    signinTab.click();
    Thread.sleep(500);
    inputEmail.sendKeys("test@gmail.com");
    inputPass.sendKeys("1234qwer");
    signinButton.click();

    }

    }
