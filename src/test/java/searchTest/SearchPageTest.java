package searchTest;

import base.ScriptBase;
import controller.SearchController;
import org.testng.annotations.Test;

public class SearchPageTest extends ScriptBase {
    SearchController searchController;
    @Test
    public void verifySearchTopItems() throws InterruptedException {
        searchController=new SearchController(driver);
        searchController.searchItems("top");
    }
    @Test
    public void verifySearchCapItems() throws InterruptedException {
        searchController=new SearchController(driver);
        searchController.searchItems("Cap");
    }
    @Test
    public void verifySearchDressItems() throws InterruptedException {
        searchController=new SearchController(driver);
        searchController.searchItems("Dress");
    }


}
