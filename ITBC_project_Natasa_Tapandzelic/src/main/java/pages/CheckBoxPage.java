package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends BasePage{

    private WebElement checkBoxHome;
    private WebElement resultMessageCheckBoxHome;
    private WebElement checkBoxPlus;
    private WebElement checkBoxMinus;
    private WebElement checkBoxesAfterClickOnPlusBtn;


    public WebElement getCheckBoxHome() {
        checkBoxHome = getDriver().findElement(By.xpath("//span[contains (text(), 'Home')]"));
        return checkBoxHome;
    }

    public WebElement getResultMessageCheckBoxHome() {
        resultMessageCheckBoxHome = getDriver().findElement(By.id("result"));
        return resultMessageCheckBoxHome;
    }

    public WebElement getCheckBoxPlus() {
        checkBoxPlus = getDriver().findElement(By.cssSelector("#tree-node > div > button.rct-option.rct-option-expand-all"));
        return checkBoxPlus;
    }

    public WebElement getCheckBoxMinus() {
        checkBoxMinus = getDriver().findElement(By.cssSelector("#tree-node > div > button.rct-option.rct-option-collapse-all"));
        return checkBoxMinus;
    }

    public WebElement getCheckBoxesAfterClickOnPlusBtn() {
        checkBoxesAfterClickOnPlusBtn = getDriver().findElement(By.cssSelector("#tree-node > ol > li > ol"));
        return checkBoxesAfterClickOnPlusBtn;
    }

    public CheckBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void open(){
        getDriver().get("https://demoqa.com/checkbox");
    }
    public void clickPlusCheckbox(){
      getCheckBoxPlus().click();
    }
    public void clickHomeBtn(){
        getCheckBoxHome().click();
    }

    public void clickMinusBtn(){
        getCheckBoxMinus().click();
    }

}
