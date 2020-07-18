package loginTest;


import base.ScriptBase;
import controller.LoginPageController;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginPage extends ScriptBase {
LoginPageController loginController;
    @Test
    public void verifyWebsideOpen(){
loginController = new LoginPageController(driver);
        init();
        loginController.signinButton(driver);
    }
    @Test
    public void verifyWebsideOpen2(){

        init();
    }
    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}



