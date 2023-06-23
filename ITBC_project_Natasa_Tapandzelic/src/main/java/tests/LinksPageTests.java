package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksPageTests extends BaseTest{

    @Test
    public void verifyHomeLinkOpensInNewTab() {
        getLinksPage().open();
        getLinksPage().clickHomeLink();
        getLinksPage().openNewTab();
//        Assert.assertTrue(getDriver().getCurrentUrl().contains("demoqa.com"));
    }
    @Test
    public void verifyAPICallResponseForCreatedLink() throws InterruptedException {
        getLinksPage().open();
        scrollDown(300);
        getLinksPage().clickCreatedLink();
        scrollDown(200);
        assertVisibilityElement(getLinksPage().getCreatedLinkMessage());
    }
}
