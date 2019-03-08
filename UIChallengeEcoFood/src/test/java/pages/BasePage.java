package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    @FindBy(className = "fa fa-user")
    WebElement userlogin;


    protected WebDriver webDriver;

    public BasePage(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    public WebElement getLoader( ){
        WebElement loader = webDriver.findElement(By.className("page-loader"));
        return loader;
    }

    public  void waitToLoadPage(WebDriver webDriver, WebElement webElement){

        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }
    public static void waitToAlert(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.alertIsPresent());
    }
    public  void waitTobeVisibilityOf(WebDriver webDriver, WebElement webElement){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public static void waitTobeClickeable(WebDriver webDriver, WebElement webElement){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));


    }

    public static  void waitToGetAtribute(WebDriver webDriver,WebElement webElement){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.attributeContains(webElement,webElement.getText(),"Logout"));
    }

}
