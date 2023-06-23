package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsPageTests extends BaseTest {

    @Test
    public void verifyDoubleClickFunctionality() {
        getButtonsPage().open();
        getButtonsPage().doubleClickOnDoubleBtn();
        scrollDown(300);
        Assert.assertTrue(getButtonsPage().isDoubleClickMessageDisplayed());
        getButtonsPage().verifyTextOfDoubleClickMessage();
    }
    @Test
    public void verifyClickFunctionality() {
        getButtonsPage().open();
        scrollDown(300);
        getButtonsPage().clickMeBtnClick();
        Assert.assertTrue(getButtonsPage().isClickMeMessageDisplayed());
        getButtonsPage().verifyTextOfClickMessage();
    }

    @Test
    public void verifyRightClickFunctionality() {
        getButtonsPage().open();
        scrollDown(300);
        getButtonsPage().rightClickOnRightClickBtn();
        Assert.assertTrue(getButtonsPage().isRightClickMeMessageDisplayed());
        getButtonsPage().verifyTextOfRightClickMessage();
    }
}
