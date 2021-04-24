package test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.Buttons;
import util.Configuration;

import java.util.concurrent.TimeUnit;

public class AuthTest {
    private static WebDriver webDriver;
    public static Buttons mainPage;
    private static Actions actions;
    private static String login;
    private static String password;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", Configuration.getProperty("chrome_driver_path"));
        login = Configuration.getProperty("fishki_login");
        password = Configuration.getProperty("fishki_password");
        webDriver = new ChromeDriver();
        actions = new Actions(webDriver);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://fishki.net");
        mainPage = new Buttons(webDriver);
    }

    @AfterClass
    public static void close(){
        webDriver.quit();
    }

//    @Test
//    public void auth(){
//        mainPage.getEnterArea().click();
//        mainPage.getInputLogin().sendKeys(login);
//        mainPage.getInputPassword().sendKeys(password);
//        mainPage.getEnterButton().click();
//        Assert.assertTrue(mainPage.getUserButton().isDisplayed());
//    }
//
    @Test
    public void incorrectAuth(){
        mainPage.getEnterArea().click();
        mainPage.getInputLogin().sendKeys(login);
        mainPage.getInputPassword().sendKeys("password");
        mainPage.getEnterButton().click();
        Assert.assertTrue(mainPage.getErrorText().isDisplayed());
    }

//    @Test
//    public void logout(){
//        mainPage.getEnterArea().click();
//        mainPage.getInputLogin().sendKeys(login);
//        mainPage.getInputPassword().sendKeys(password);
//        mainPage.getEnterButton().click();
//        actions.moveToElement(mainPage.getUserButton()).perform();
//        mainPage.getLogoutButton().click();
//        Assert.assertTrue(mainPage.getEnterArea().isDisplayed());
//    }
}
