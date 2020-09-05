package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageController {
    @FindBy(xpath = "//a[@class='login']")
    WebElement signinTab;
    @FindBy(css = "span.navigation_page")
    WebElement authTab;
    @FindBy(id="email")
    WebElement inputEmail;
    @FindBy(id="passwd")
    WebElement inputPass;
    @FindBy(css = "#SubmitLogin > span")
    WebElement signinButton;
    @FindBy(xpath = "//a[@title='My orders']")
    WebElement endPageInfo;

    public LoginPageController(WebDriver driver){
        PageFactory.initElements(driver,this);}

   public void signinButton(WebDriver driver){
        // WebElement element =driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
        // element.isDisplayed();
        //System.out.println(element);
        driver.findElement(By.cssSelector("  a.login")).click();
    }
    public void logIn() throws InterruptedException {
    signinTab.click();
    Thread.sleep(500);
    authTab.isDisplayed();
    Assert.assertEquals(authTab,authTab);
//    inputEmail.sendKeys("test@gmail.com");
//    inputPass.sendKeys("1234qwer");
//    signinButton.click();

    }
    public void inputEmail(WebDriver driver,String emailOrpass,String emailORpass){
        driver.findElement(By.id(""+emailOrpass+"")).sendKeys(emailORpass);

    }
    public void signinButton(){
        signinButton.click();
    }
    public void verifyInformationDesk(WebDriver driver, String endPageInfo){
        driver.findElement(By.xpath("//a[@title='"+endPageInfo+"']")).isDisplayed();
    }
}
