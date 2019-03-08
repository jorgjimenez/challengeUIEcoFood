package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.Action.clickElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    WebElement usernameField = webDriver.findElement(By.id("username"));
    WebElement passwordField = webDriver.findElement(By.id("password"));


    public void fillFieldsLogin(String userName, String password) {
        usernameField.sendKeys(userName);
        passwordField.sendKeys(password);
        WebElement login = webDriver.findElement(By.id("login"));
        clickElement(webDriver, login);
    }
}
