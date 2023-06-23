package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ButtonsPage extends BasePage{
    private WebElement doubleClickMeBtn;
    private WebElement rightClickMeBtn;
    private WebElement clickMeBtn;
    private WebElement doubleClickMeMessage;
    private WebElement rightClickMeMessage;
    private WebElement clickMeMessage;
    private Actions actions;
    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getDoubleClickMeBtn() {
        doubleClickMeBtn = getDriver().findElement(By.id("doubleClickBtn"));
        return doubleClickMeBtn;
    }

    public WebElement getRightClickMeBtn() {
        rightClickMeBtn = getDriver().findElement(By.id("rightClickBtn"));
        return rightClickMeBtn;
    }

    public WebElement getClickMeBtn() {
        clickMeBtn = getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
        return clickMeBtn;
    }

    public WebElement getDoubleClickMeMessage() {
        doubleClickMeMessage = getDriver().findElement(By.id("doubleClickMessage"));
        return doubleClickMeMessage;
    }

    public WebElement getClickMeMessage() {
        clickMeMessage= getDriver().findElement(By.id("dynamicClickMessage"));
        return clickMeMessage;
    }

    public WebElement getRightClickMeMessage() {
        rightClickMeMessage = getDriver().findElement(By.cssSelector("#rightClickMessage"));
        return rightClickMeMessage;
    }

    public Actions getActions() {
        return actions;
    }

    public void open(){
        getDriver().get("https://demoqa.com/buttons");
    }
    public void doubleClickOnDoubleBtn(){
        Actions actions = new Actions(getDriver());
        actions.doubleClick(getDoubleClickMeBtn()).perform();}
    public void verifyTextOfDoubleClickMessage(){
        String doubleClickText = getDoubleClickMeMessage().getText();
        String expectedText = "You have done a double click";
        Assert.assertEquals(doubleClickText,expectedText);
    }
    public void clickMeBtnClick(){
        getClickMeBtn().click();
    }

    public void verifyTextOfClickMessage(){
        String clickText = getClickMeMessage().getText();
        String expectedText = "You have done a dynamic click";
        Assert.assertEquals(clickText,expectedText);
    }
    public void rightClickOnRightClickBtn(){
        Actions actions = new Actions(getDriver());
        actions.contextClick(getRightClickMeBtn()).perform();
    }
    public void verifyTextOfRightClickMessage(){
        String rightClickText = getRightClickMeMessage().getText();
        String expectedText = "You have done a right click";
        Assert.assertEquals(rightClickText,expectedText);
    }
    public boolean isDoubleClickMessageDisplayed(){
        return getDoubleClickMeMessage().isDisplayed();
    }
    public boolean isClickMeMessageDisplayed(){
        return getClickMeMessage().isDisplayed();
    }

    public boolean isRightClickMeMessageDisplayed(){
        return getRightClickMeMessage().isDisplayed();
    }
}
