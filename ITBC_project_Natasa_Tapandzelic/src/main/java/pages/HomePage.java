package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    private WebElement elementsBtn;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getElementsBtn(){
        elementsBtn = getDriver().findElement(By.xpath("//div[@class='card mt-4 top-card']"));
        return elementsBtn;
    }
    public void open(){
        getDriver().get("https://demoqa.com/");
    }
    public void clickElementBtn(){
        getElementsBtn().click();
    }
}
