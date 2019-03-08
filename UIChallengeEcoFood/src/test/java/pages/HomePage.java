package pages;

import data.DataUserAcount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static utils.Action.clickElement;


public class HomePage extends BasePage {

    private final String prub;

    @FindBy(className = "page-loader")
    private WebElement loader;

    public HomePage( WebDriver webDriver) {
        super(webDriver);
        prub = "algo";
    }

    public void  register(String name, String lastName, String email, String userName, String password, String confirmPassword  ) {
        WebElement registerLink = webDriver.findElement(By.xpath("//a[contains(text(),'Registrarse')]"));
        waitToLoadPage(webDriver,getLoader());
        clickElement(webDriver,registerLink);
        waitToLoadPage(webDriver,getLoader());
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.fillFieldsRegister(
                name,
                lastName,
                email,
                userName,
                password,
                confirmPassword);
    }
    public void login( String userNameField, String passwordField){
        WebElement logginLink = webDriver.findElement(By.xpath("//a[text()='Iniciar sesión']"));
        waitToLoadPage(webDriver,getLoader());
        clickElement(webDriver,logginLink);
        waitToLoadPage(webDriver,getLoader());
        LoginPage loginPage = new  LoginPage(webDriver);
        loginPage.fillFieldsLogin(
               userNameField,
                passwordField

        );
        WebElement welcomeUser = webDriver.findElement(By.className("header-login"));
        waitTobeVisibilityOf(webDriver,welcomeUser);



    }
    public void logout() {

        WebElement welcomeUser = webDriver.findElement(By.className("header-login"));
        waitTobeVisibilityOf(webDriver,welcomeUser);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement logoutLink = webDriver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
        waitToLoadPage(webDriver,getLoader());
         clickElement(webDriver,logoutLink);
       }


    @FindBy(how = How.XPATH, using = "//div[@class='miso-prd-qty']")
    List<WebElement> productImageHomePage;

//    @FindBy(how = How.XPATH, using = "//a[@class='fa fa-pluus']")
//    List<WebElement>  productPlusButtonHomePage;

     public  void addProducts() {
//        List<WebElement> productImageHomePage= webDriver.findElements(By.xpath( "//div[@class='miso-prd-qty']"));

         webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                 waitTobeClickeable(webDriver,productImageHomePage.get(i));
                 clickElement(webDriver,productImageHomePage.get(1));
         webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> productPlusButtonHomePage= webDriver.findElements(By.xpath( "//a[@class='fa fa-plus']"));
                waitTobeClickeable(webDriver,productPlusButtonHomePage.get(1));
                 clickElement(webDriver,productPlusButtonHomePage.get(1));

     }
    }

