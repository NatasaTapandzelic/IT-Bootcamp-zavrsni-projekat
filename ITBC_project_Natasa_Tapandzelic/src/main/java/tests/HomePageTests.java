package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest{

    @Test
    public void verifyOpenElementsPage() {
        getHomePage().open();
        scrollDown(300);
        getHomePage().clickElementBtn();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/elements"));
    }
}
