package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageController {
    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement signinButton;
    public HomePageController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
        public void homepageloginButton(){
            signinButton.click();
        }

}
