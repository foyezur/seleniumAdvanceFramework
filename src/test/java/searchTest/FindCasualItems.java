package searchTest;

import base.ScriptBase;
import controller.FindDressesController;
import org.testng.annotations.Test;

public class FindCasualItems extends ScriptBase {
    FindDressesController findDressesController;
    @Test
    public void casualItems(){
        findDressesController= new FindDressesController(driver);
        findDressesController.CasualDressFound();
    }
}
