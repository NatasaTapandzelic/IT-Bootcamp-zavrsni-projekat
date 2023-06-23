package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPage extends BasePage{
        Faker faker = new Faker();
        private WebElement addButton;
        private WebElement firstNameInput;
        private WebElement lastNameInput;
        private WebElement emailInput;
        private WebElement ageInput;
        private WebElement salaryInput;
        private WebElement departmentInput;
        private WebElement submitBtn;
        private WebElement rowWithAddData;

    public WebTablesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getAddButton() {
        addButton = getDriver().findElement(By.id("addNewRecordButton"));
        return addButton;
    }

    public WebElement getFirstNameInput() {
        firstNameInput = getDriver().findElement(By.id("firstName"));
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        lastNameInput = getDriver().findElement(By.id("lastName"));
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        emailInput = getDriver().findElement(By.id("userEmail"));
        return emailInput;
    }

    public WebElement getAgeInput() {
        ageInput = getDriver().findElement(By.id("age"));
        return ageInput;
    }

    public WebElement getSalaryInput() {
        salaryInput = getDriver().findElement(By.id("salary"));
        return salaryInput;
    }

    public WebElement getDepartmentInput() {
        departmentInput = getDriver().findElement(By.id("department"));
        return departmentInput;
    }

    public WebElement getSubmitBtn() {
        submitBtn = getDriver().findElement(By.id("submit"));
        return submitBtn;
    }

    public WebElement getRowWithAddData() {
        rowWithAddData = getDriver().findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.rt-table > div.rt-tbody > div:nth-child(4)"));
        return rowWithAddData;
    }
    public Faker getFaker() {
        return faker;
    }


    public void open(){
        getDriver().get("https://demoqa.com/webtables");
    }
    public void clickAddBtn(){
        getAddButton().click();
    }
    public void enteringDataWithFaker(){
        getFirstNameInput().sendKeys((CharSequence) faker.name().fullName());
        getLastNameInput().sendKeys((CharSequence) faker.name().lastName());
        getEmailInput().sendKeys((CharSequence) faker.internet().emailAddress());
        getAgeInput().sendKeys(String.valueOf(faker.number().numberBetween(18, 90)));
        getSalaryInput().sendKeys(String.valueOf(faker.number().numberBetween(400, 1500)));
        getDepartmentInput().sendKeys((CharSequence) faker.job().field());
        getSubmitBtn().click();
    }





}
