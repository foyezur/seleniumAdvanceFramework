package womenPageTest;

import base.ScriptBase;
import controller.WomenController;
import org.testng.annotations.Test;

public class WomenTest extends ScriptBase {
    WomenController womenController;
    @Test
    public void verifyWomenCatalogTest() throws InterruptedException {
        womenController= new WomenController(driver);
        womenController.womenButtonWorking();

    }
}
