package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinksPageTests extends BaseTest{
    @Test
    public void checkValidLink() throws InterruptedException {
        getBrokenLinksPage().open();
        scrollDown(400);
        getBrokenLinksPage().clickValidLink();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("demoqa.com"));
    }
    @Test
    public void checkBrokenLink(){
        getBrokenLinksPage().open();
        scrollDown(400);
        getBrokenLinksPage().clickBrokenLink();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("status_codes/500"));

    }
}
