package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchController {
@FindBy (id = "search_query_top")
    WebElement searchTab;
@FindBy(name = "submit_search") WebElement searchSubmit;
@FindBy(xpath = "//span[contains(text(),'1 result has been found.')]") WebElement searchTopResult;

    public SearchController(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

public void searchItems(String searchProduct) throws InterruptedException {
        Thread.sleep(1000);
        searchTab.clear();
        searchTab.sendKeys(searchProduct);
        searchSubmit.click();
//    Assert.assertEquals(searchTopResult,searchTopResult);
}
}
