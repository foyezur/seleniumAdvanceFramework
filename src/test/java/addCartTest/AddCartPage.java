package addCartTest;

import base.ScriptBase;
import controller.AddCartOrderController;
import org.testng.annotations.Test;

public class AddCartPage extends ScriptBase {
    AddCartOrderController addCartOrderController;
    @Test
    public void verifyAddCartTestWithSignin() throws InterruptedException {
        addCartOrderController= new AddCartOrderController(driver);
        addCartOrderController.orderCartDisplyed(driver,"Sign in");
    }
    @Test
    public void verifyAddCartTestWithSummary() throws InterruptedException {
        addCartOrderController= new AddCartOrderController(driver);
        addCartOrderController.orderCartDisplyed(driver,"Summary");
    }
    @Test
    public void verifyAddCartTestWithAddress() throws InterruptedException {
        addCartOrderController= new AddCartOrderController(driver);
        addCartOrderController.orderCartDisplyed(driver,"Address");
    }
    @Test
    public void verifyAddCartTestWithShipping() throws InterruptedException {
        addCartOrderController= new AddCartOrderController(driver);
        addCartOrderController.orderCartDisplyed(driver,"Shipping");
    }
    @Test
    public void verifyAddCartTestWithPayment() throws InterruptedException {
        addCartOrderController= new AddCartOrderController(driver);
        addCartOrderController.orderCartDisplyed(driver,"Payment");
    }
}
