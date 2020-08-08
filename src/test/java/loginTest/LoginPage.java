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
    }
    @Test
    public void verifyLogin(){
        loginController = new LoginPageController(driver);
       loginController.logIn();
    }
    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}



