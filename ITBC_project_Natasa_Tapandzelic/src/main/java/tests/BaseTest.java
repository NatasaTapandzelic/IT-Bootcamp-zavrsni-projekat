package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;
import pages.BrokenLinksPage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private HomePage homePage;
    private TextBoxPage textBoxPage;
    private CheckBoxPage checkBoxPage;
    private RadioButtonsPage radioButtonsPage;
    private JavascriptExecutor javascriptExecutor;
    private WebTablesPage webTablesPage;
    private ButtonsPage buttonsPage;
    private Actions actions;
    private LinksPage linksPage;
    private BrokenLinksPage brokenLinksPage;
    private WebTablesPage webTablesPage1;
    private Faker faker;



    public WebDriver getDriver() {
        return driver;
    }
    public WebDriverWait getWait(){
        return wait;
    }
    public HomePage getHomePage(){
        return homePage;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public RadioButtonsPage getRadioButtonsPage() {
        return radioButtonsPage;
    }

    public JavascriptExecutor getJavascriptExecutor(){
        return javascriptExecutor;
    }

    public CheckBoxPage getCheckBoxPage() {
        return checkBoxPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public Actions getActions() {
        return actions;
    }

    public LinksPage getLinksPage() {
        return linksPage;
    }

    public BrokenLinksPage getBrokenLinksPage() {
        return brokenLinksPage;
    }

    public WebTablesPage getWebTablesPage() {
        return webTablesPage;
    }

    public Faker getFaker() {
        return faker;
    }

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C://Users//hp1//Desktop//Chrome driver//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver,wait);
        textBoxPage = new TextBoxPage(driver,wait);
        javascriptExecutor = (JavascriptExecutor) driver;
        checkBoxPage = new CheckBoxPage(driver,wait);
        radioButtonsPage = new RadioButtonsPage(driver,wait);
        webTablesPage = new WebTablesPage(driver,wait);
        buttonsPage = new ButtonsPage(driver,wait);
        actions = new Actions(driver);
        linksPage = new LinksPage(driver,wait);
        brokenLinksPage = new BrokenLinksPage(driver,wait);
        webTablesPage1 = new WebTablesPage(driver,wait);
        faker = new Faker();

    }
    @BeforeMethod
    public void beforeEachTest(){
        getDriver().manage().window().maximize();
    }
    @AfterClass
    public void cleanUp(){
        getDriver().close();
    }

    public void scrollDown(int pixels){
    getJavascriptExecutor().executeScript("window.scrollBy(0,"+ pixels + ")","");
    }
    public void assertVisibilityElement(WebElement element){
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed());
    }
}


