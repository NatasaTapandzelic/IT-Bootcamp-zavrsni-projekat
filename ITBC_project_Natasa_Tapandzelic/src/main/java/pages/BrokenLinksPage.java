package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksPage extends BasePage{
    private WebElement validLink;
    private WebElement brokenLink;
    public BrokenLinksPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getValidLink() {
        validLink = getDriver().findElement(By.cssSelector("a[href='http://demoqa.com']"));
        return validLink;
    }

    public WebElement getBrokenLink() {
        brokenLink = getDriver().findElement(By.cssSelector("a[href='http://the-internet.herokuapp.com/status_codes/500']"));
        return brokenLink;
    }
    public void open(){
        getDriver().get("https://demoqa.com/broken");
    }
    public void clickValidLink(){
        getValidLink().click();
    }
    public void clickBrokenLink(){
        getBrokenLink().click();
    }

}
