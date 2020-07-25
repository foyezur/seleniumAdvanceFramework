package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageController {
    public LoginPageController(WebDriver driver){
        PageFactory.initElements(driver,this);}

    public void signinButton(WebDriver driver){
        // WebElement element =driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
        // element.isDisplayed();
        //System.out.println(element);
        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
    }
    }
