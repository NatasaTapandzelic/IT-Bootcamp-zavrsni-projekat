package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxPageTests extends BaseTest{

    @Test
    public void outputDataVerificationWithValidCredential() {
        getTextBoxPage().open();
        getTextBoxPage().enterValidDataInTextBoxFields();
        scrollDown(300);
        Assert.assertTrue(getTextBoxPage().getOutputFieldWithData().isDisplayed());
        getTextBoxPage().verifyOutputMatch();
    }
    @Test
    public void outputDataVerificationWithInvalidEmail() {
        getTextBoxPage().open();
        getTextBoxPage().enterDataWithInvalidEmailInTextBoxFields();
        assertVisibilityElement(getTextBoxPage().getErrorEmailFieldWithRedBorders());
    }

    @Test
    public void verifyUrlAddressRoute(){
        getTextBoxPage().open();
        getTextBoxPage().assertUrl();
    }
    @Test
    public void verifyHeader(){
        getTextBoxPage().open();
        getTextBoxPage().assertHeader();
    }

}
