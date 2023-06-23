package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonsPage extends BasePage{
    private WebElement yesRadioBtn;
    private WebElement impressiveRadioBtn;
    private WebElement noRadioBtn;
    private WebElement yesText;
    private WebElement impressiveText;
    public RadioButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getYesRadioBtn() {
        yesRadioBtn = getDriver().findElement
                (By.xpath("//label[@for='yesRadio']"));
        return yesRadioBtn;
    }

    public WebElement getImpressiveRadioBtn() {
        impressiveRadioBtn = getDriver().findElement(By.xpath("//label[@for='impressiveRadio']"));
        return impressiveRadioBtn;
    }

    public WebElement getNoRadioBtn() {
        noRadioBtn = getDriver().findElement(By.xpath("//label[@for='noRadio']"));
        return noRadioBtn;
    }

    public WebElement getYesText() {
        yesText = getDriver().findElement(By.xpath("//span[contains(text(),'Yes')]"));
        return yesText;
    }

    public WebElement getImpressiveText() {
        impressiveText = getDriver().findElement(By.xpath("//span[contains(text(),'Impressive')]"));
        return impressiveText;
    }
    public void open(){
        getDriver().get("https://demoqa.com/radio-button");
    }
    public void clickYesRadioBtn(){
        getYesRadioBtn().click();
    }
    public void clickImpressiveRadioBtn(){
        getImpressiveRadioBtn().click();
    }
    public void clickNoRadioBtn(){
        getNoRadioBtn().click();
    }


}
