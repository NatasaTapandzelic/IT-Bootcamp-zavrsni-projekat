package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxPageTests extends BaseTest{

    @Test
    public void verifyClickOnHomeCheckBox() {
        getCheckBoxPage().open();
        getCheckBoxPage().clickHomeBtn();
        assertVisibilityElement(getCheckBoxPage().getResultMessageCheckBoxHome());
    }
    @Test
    public void verifyClickOnPlusBtn(){
        getCheckBoxPage().open();
        getCheckBoxPage().clickPlusCheckbox();
        Assert.assertTrue(getCheckBoxPage().getCheckBoxesAfterClickOnPlusBtn().isDisplayed());

    }

}
