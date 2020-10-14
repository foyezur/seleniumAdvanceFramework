package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FindDressesController {
    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
    WebElement dressButton;
    @FindBy(xpath = "//*[@id='subcategories']/ul/li[1]/div[1]/a/img")
    WebElement casualDress;
    @FindBy(xpath = "//*[@id='center_column']/h1/span[2]")
    WebElement productFoundButton;

    public FindDressesController(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
public void CasualDressFound(){
        dressButton.click();
        casualDress.click();
    Assert.assertEquals(productFoundButton,productFoundButton);
}
}
