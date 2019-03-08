package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.Action.clickElement;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver webDriver) {
        super(webDriver);
    }
    WebElement nameField = webDriver.findElement(By.id("name"));
    WebElement lastNameField=  webDriver.findElement(By.id("lastname"));
    WebElement emailField= webDriver.findElement(By.id("email"));
    WebElement passwordField=  webDriver.findElement(By.id("pass1" ));
    WebElement confirmField=  webDriver.findElement(By.id("pass2"));
    WebElement usernameField=  webDriver.findElement(By.id("username"));
    WebElement registerButtomField = webDriver.findElement(By.id("register"));
    public void fillFieldsRegister(String name, String lastName, String email, String userName, String password, String confirmPassword) {
        nameField.sendKeys(name);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        usernameField.sendKeys(userName);
        passwordField.sendKeys(password);
        confirmField.sendKeys(confirmPassword);
        clickElement(webDriver,registerButtomField);


    }

}
