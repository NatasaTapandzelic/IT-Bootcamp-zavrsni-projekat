package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TextBoxPage extends BasePage{
    private WebElement fullNameField;
    private WebElement emailField;
    private WebElement currentAddressField;
    private WebElement permanentAddressField;
    private WebElement submitBtn;
    private WebElement headerOfTextBox;
    private WebElement resultFieldWithData;
    private String validName;
    private String validEmail;
    private String currentAddress;
    private String permanentAddress;
    private String invalidEmailAddress;
    private WebElement errorEmailFieldWithRedBorders;

    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFullNameField() {
        fullNameField = getDriver().findElement(By.id("userName"));
        return fullNameField;
    }

    public WebElement getEmailField() {
        emailField = getDriver().findElement(By.id("userEmail"));
        return emailField;
    }

    public WebElement getCurrentAddressField() {
        currentAddressField = getDriver().findElement(By.id("currentAddress"));
        return currentAddressField;
    }

    public WebElement getPermanentAddressField() {
        permanentAddressField = getDriver().findElement(By.id("permanentAddress"));
        return permanentAddressField;
    }

    public WebElement getSubmitBtn() {
        submitBtn = getDriver().findElement(By.id("submit"));
        return submitBtn;
    }

    public WebElement getHeaderOfTextBox() {
        headerOfTextBox = getDriver().findElement(By.xpath("//div[@class='main-header']"));
        return headerOfTextBox;
    }

    public WebElement getOutputFieldWithData() {
        resultFieldWithData = getDriver().findElement(By.id("output"));
        return resultFieldWithData;
    }

    public String getValidName() {
        validName = "Natasa";
        return validName;
    }

    public String getValidEmail() {
        validEmail = "mail.example@gmail.com";
        return validEmail;
    }

    public String getValidCurrentAddress() {
        currentAddress = "Cara Lazara 30";
        return currentAddress;
    }

    public String getValidPermanentAddress() {
        permanentAddress = "Cara Lazara 30";
        return permanentAddress;
    }

    public String getInvalidEmailAddress() {
        invalidEmailAddress = "nekiMejlBez@";
        return invalidEmailAddress;
    }

    public WebElement getErrorEmailFieldWithRedBorders() {
        errorEmailFieldWithRedBorders = getDriver().findElement(By.xpath("//input[@class='mr-sm-2 field-error form-control']"));
        return errorEmailFieldWithRedBorders;
    }


    public void open(){
        getDriver().get("https://demoqa.com/text-box");
    }
    public void assertUrl(){
        Assert.assertTrue(getDriver().getCurrentUrl().contains("text-box"));
    }
    public void assertHeader(){
        String header = getHeaderOfTextBox().getText();
        Assert.assertEquals(header, "Text Box");
    }

    public void enterValidDataInTextBoxFields(){
        getFullNameField().sendKeys(getValidName());
        getEmailField().sendKeys(getValidEmail());
        getCurrentAddressField().sendKeys(getValidCurrentAddress());
        getPermanentAddressField().sendKeys(getValidPermanentAddress());
        getWait().until(ExpectedConditions.elementToBeClickable(getSubmitBtn()));
        getSubmitBtn().click();
    }

    public void verifyOutputMatch(){
        String resultField = getOutputFieldWithData().getText();
        Assert.assertTrue(resultField.contains(getValidName()));
        Assert.assertTrue(resultField.contains(getValidEmail()));
        Assert.assertTrue(resultField.contains(getValidCurrentAddress()));
        Assert.assertTrue(resultField.contains(getValidPermanentAddress()));
    }

    public void enterDataWithInvalidEmailInTextBoxFields(){
        getFullNameField().sendKeys(getValidName());
        getEmailField().sendKeys(getInvalidEmailAddress());
        getCurrentAddressField().sendKeys(getValidCurrentAddress());
        getPermanentAddressField().sendKeys(getValidPermanentAddress());
        getWait().until(ExpectedConditions.elementToBeClickable(getSubmitBtn()));
        getSubmitBtn().click();
    }
}

