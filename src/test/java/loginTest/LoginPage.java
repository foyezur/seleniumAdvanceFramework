package loginTest;


import base.ScriptBase;
import controller.LoginPageController;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage extends ScriptBase {
LoginPageController loginController;
    @BeforeTest
    public void beforeTest(){
        init();
    }
    @Test
    public void verifySigninButtonDisplayed(){
loginController = new LoginPageController(driver);

        loginController.signinButton(driver);
        loginController.inputEmail(driver,"email","Test@gmail.com");
        loginController.inputEmail(driver,"passwd","1234qwe");
        loginController.signinButton();
    }
    @Test
    public void verifyLogin() throws InterruptedException {
        loginController = new LoginPageController(driver);
       loginController.logIn();
    }
    @Test
    public void verifyInformationMyOrderDisplayed() throws InterruptedException {
        loginController = new LoginPageController(driver);
        Thread.sleep(500);
        loginController.verifyInformationDesk(driver,"My orders");
    }
    @Test
    public void verifyInformationMyCreditSlipsDisplayed() throws InterruptedException {
        loginController = new LoginPageController(driver);
        Thread.sleep(500);
        loginController.verifyInformationDesk(driver,"My credit slips");
    }
    @Test
    public void verifyInformationMyaddressesDisplayed() throws InterruptedException {
        loginController = new LoginPageController(driver);
        Thread.sleep(500);
        loginController.verifyInformationDesk(driver,"My addresses");
    }
    @Test
    public void verifyInformationMSitemapDisplayed() throws InterruptedException {
        loginController = new LoginPageController(driver);
        Thread.sleep(500);
        loginController.verifyInformationDesk(driver,"Sitemap");
    }
    @Test
    public void verifyInformationAboutusDisplayed() throws InterruptedException {
        loginController = new LoginPageController(driver);
        Thread.sleep(500);
        loginController.verifyInformationDesk(driver,"About us");
    }
    @Test
    public void verifyInformationContactusDisplayed() throws InterruptedException {
        loginController = new LoginPageController(driver);
        Thread.sleep(500);
        loginController.verifyInformationDesk(driver,"Contact us");
    }
    @Test
    public void verifyInformationOurstoresDisplayed() throws InterruptedException {
        loginController = new LoginPageController(driver);
        Thread.sleep(500);
        loginController.verifyInformationDesk(driver,"Our stores");
    }
    @Test
    public void verifyInformationBestsellersDisplayed() throws InterruptedException {
        loginController = new LoginPageController(driver);
        Thread.sleep(500);
        loginController.verifyInformationDesk(driver,"Best sellers");
    }
    @Test
    public void verifyInformationNewproductDisplayed() throws InterruptedException {
        loginController = new LoginPageController(driver);
        Thread.sleep(500);
        loginController.verifyInformationDesk(driver,"New products");
    }
    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}



