package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartOrderController {
    @FindBy(xpath = "//a[@title='View my shopping cart']")
    WebElement addCartButton;
    @FindBy(xpath = "//span[@class='navigation_page']")
    WebElement shoppingCard;

    public AddCartOrderController(WebDriver driver){
        PageFactory.initElements(driver,this);}
public void orderCartDisplyed(WebDriver driver,String summarytabs) throws InterruptedException {
        addCartButton.click();
        shoppingCard.isDisplayed();
        shoppingCartTabs(driver,summarytabs);
}
public void shoppingCartTabs(WebDriver driver, String summarytabs) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'"+ summarytabs+"')]")).isDisplayed();

}
}