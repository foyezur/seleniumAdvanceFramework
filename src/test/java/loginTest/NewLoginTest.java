package loginTest;

import base.ScriptBase;
import controller.NewloginPageController;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewLoginTest extends ScriptBase {

    NewloginPageController newloginPageController;

    @Test
    public void verifyInvalidLogin() throws InterruptedException {
       newloginPageController= new NewloginPageController(driver);
        Thread.sleep(500);
        newloginPageController.InvalidSignIn("test@gmail.com","1234qwer");
    }

}


