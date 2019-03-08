package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action {
    public static void clickElement(WebDriver webDriver, WebElement webElement){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webElement).click().build().perform();
    }
}
