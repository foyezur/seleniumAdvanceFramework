package searchTest;

import base.ScriptBase;
import controller.SearchController;
import org.testng.annotations.Test;

public class SearchPageTest extends ScriptBase {
    SearchController searchController;
    @Test
    public void verifySearchTopItems() throws InterruptedException {
        searchController=new SearchController(driver);
        searchController.searchItems();
    }

}
