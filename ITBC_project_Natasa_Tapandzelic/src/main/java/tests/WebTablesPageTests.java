package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesPageTests extends BaseTest{

    @Test
    public void VerifyAddingEnteredDataInANewRowInTheWebTable() throws InterruptedException {
        getWebTablesPage().open();
        getWebTablesPage().clickAddBtn();
        getWebTablesPage().enteringDataWithFaker();
        scrollDown(200);
        getWait().until(ExpectedConditions.visibilityOf(getWebTablesPage().getRowWithAddData()));
    }

}
