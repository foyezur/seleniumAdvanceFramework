package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class CataloguePageController extends ScriptBase {


        public CataloguePageController(WebDriver driver){
            PageFactory.initElements(driver,this);
        }
        public void homePageCatalogue(WebDriver driver, String catalogTab) {
            mouseOver(driver.findElement(By.xpath("//*[@id='block_top_menu']//a[@title='"+catalogTab+"']")),driver);

        }

        public void mouseOver(WebElement element, WebDriver driver){
            Actions actions=new Actions(driver);
            element=element;
            actions.moveToElement(element).perform();

        }

    }


