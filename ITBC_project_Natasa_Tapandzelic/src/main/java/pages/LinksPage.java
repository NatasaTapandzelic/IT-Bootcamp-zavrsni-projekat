package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

public class LinksPage extends BasePage{
    private WebElement homeLink;
    private WebElement createdLink;
    private WebElement createdLinkMessage;
    public LinksPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getHomeLink() {
        homeLink = getDriver().findElement(By.id("simpleLink"));
        return homeLink;
    }

    public WebElement getCreatedLink() {
        createdLink = getDriver().findElement(By.id("created"));
        return createdLink;
    }

    public WebElement getCreatedLinkMessage() {
        createdLinkMessage = getDriver().findElement(By.id("linkResponse"));
        return createdLinkMessage;
    }
    public void open(){
        getDriver().get("https://demoqa.com/links");
    }
    public void clickHomeLink(){
        getHomeLink().click();
    }

    public void clickCreatedLink(){
        getCreatedLink().click();
    }

    public void openNewTab(){
        ((JavascriptExecutor) getDriver()).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
    }
}
