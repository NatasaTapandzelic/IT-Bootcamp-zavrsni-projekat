package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsPageTests extends BaseTest {

    @Test
    public void verifyYesRadioBtnFunctionality() {
        getRadioButtonsPage().open();
        getWait().until(ExpectedConditions.elementToBeClickable(getRadioButtonsPage().getYesRadioBtn()));
        getRadioButtonsPage().clickYesRadioBtn();
        assertVisibilityElement(getRadioButtonsPage().getYesText());
    }

    @Test
    public void verifyImpressiveRadioBtnFunctionality() {
        getRadioButtonsPage().open();
        getWait().until(ExpectedConditions.elementToBeClickable(getRadioButtonsPage().getImpressiveRadioBtn()));
        getRadioButtonsPage().clickImpressiveRadioBtn();
        assertVisibilityElement(getRadioButtonsPage().getImpressiveText());
    }
    @Test
    public void verifyNoRadioFunctionality(){
        getRadioButtonsPage().open();
        getRadioButtonsPage().clickNoRadioBtn();
        Assert.assertFalse(getRadioButtonsPage().getNoRadioBtn().isSelected());
    }
}