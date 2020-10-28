package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenController {
    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenButton;
    @FindBy(xpath = "//*[@id='center_column']/h1/span[2]")
    WebElement totalProductDisply;
    @FindBy(css = "#subcategories > ul > li:nth-child(1) > div.subcategory-image > a > img")
    WebElement topsCatagoryButton;

    public WomenController(WebDriver driver){
        PageFactory.initElements(driver,this);}
   public void womenButtonWorking() throws InterruptedException {
        womenButton.click();
        Thread.sleep(1000);
        totalProductDisply.isDisplayed();
        topsCatagoryButton.click();
   }

}
