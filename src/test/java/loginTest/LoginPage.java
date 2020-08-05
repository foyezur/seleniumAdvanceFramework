package loginTest;


import base.ScriptBase;
import controller.LoginPageController;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginPage extends ScriptBase {
LoginPageController loginPageController;
    @Test
    public void verifyWebsideOpen(){
loginPageController = new LoginPageController(driver);
        init();
      // loginPageController.signinButton(driver);
    }
    @Test
    public void verifyWebsideOpen2(){

        init();
    }
    @Test
    public void verifyLogin(){
        init();
        loginPageController = new LoginPageController(driver);

        loginPageController.logIn();
    }
    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}



