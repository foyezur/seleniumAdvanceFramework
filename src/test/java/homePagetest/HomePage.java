package homePagetest;

import base.ScriptBase;
import controller.HomePageController;
import org.testng.annotations.Test;

public class HomePage extends ScriptBase {
    HomePageController homePageController;
    @Test
    public void verifyLoginButtonDisply(){

        homePageController=new HomePageController(driver);

        homePageController.homepageloginButton();

    }
}
