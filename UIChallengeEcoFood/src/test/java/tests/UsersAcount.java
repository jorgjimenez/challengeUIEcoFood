package tests;

import data.DataUserAcount;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;


public class UsersAcount {

    @FindBy(className = "fa fa-user")
    private WebElement userlog;

    private WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;

    @Before
    public void setup(){
        webDriver=new ChromeDriver();
        webDriver.get("http://ecofoodmarket.herokuapp.com/");
        homePage = PageFactory.initElements(webDriver,HomePage.class);
    }

    @Test
    public void succesfulRegistration() {
        this.homePage.register(
                DataUserAcount.getNameRegister(),
                DataUserAcount.getLasNameField(),
                DataUserAcount.getEmailField(),
                DataUserAcount.getUsernameField(),
                DataUserAcount.getPasswordField(),
                DataUserAcount.getConfirmField());
        BasePage.waitToAlert(webDriver);
        String alert =webDriver.switchTo().alert().getText();
        Assert.assertEquals("Usuario creado",alert);
    }

    @Test
    public void succesfulLogin() {

        ///////// PENDIENTE validar bien
        this.homePage.login(
                DataUserAcount.getUsernameField(),
                DataUserAcount.getPasswordField()
        );
        loginPage = PageFactory.initElements(webDriver,LoginPage.class);

        String textUserLogin = webDriver.findElement(By.xpath(".//div/div/div[2]/div/a[1]")).getText();
        Assert.assertEquals("Bienvenido pepitp9714",textUserLogin);
    }

    @Test
    public  void  unSuccessfulLogin(){
        ///////// PENDIENTE validar bien puede arreglarse con la vaidacion del atributo con un .gettext del elemento
        this.homePage.login(
                DataUserAcount.getUsernameInvalid(),
                DataUserAcount.getPaswordInvalid()
        );
        loginPage = PageFactory.initElements(webDriver,LoginPage.class);
        String textUserLogin = webDriver.findElement(By.id("exampleModalLongTitle")).getText();
        Assert.assertEquals("¡HA OCURRIDO UN ERROR!",textUserLogin);
    }

    @Test
    public void  logout() {
        this.homePage.login(
                DataUserAcount.getUsernameField(),
                DataUserAcount.getPasswordField()
        );
        homePage = PageFactory.initElements(webDriver,HomePage.class);
        this.homePage.logout();
        String textUserLogut = webDriver.findElement(By.xpath("//a[text()='Iniciar sesión']")).getText();
        Assert.assertEquals("Iniciar sesión",textUserLogut);
    }

    @Test
    public void addProductfromHomePage() throws InterruptedException {
        this.homePage.login(
                DataUserAcount.getUsernameField(),
                DataUserAcount.getPasswordField()
        );
        homePage = PageFactory.initElements(webDriver,HomePage.class);
        this.homePage.addProducts();
        String bla;
    }

    @After
    public void after(){

//        webDriver.quit();
    }

}
