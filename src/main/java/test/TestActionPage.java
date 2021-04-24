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

public class TestActionPage {
    private static WebDriver webDriver;
    public static Buttons mainPage;
    public static Actions actions;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", Configuration.getProperty("chrome_driver_path"));
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

    public void goToNew(){
        actions.moveToElement(mainPage.getNewButton()).perform();
        mainPage.getCurrentNew().click();
    }

    @Test
    public void checkLike(){
        actions.moveToElement(mainPage.getNewButton()).perform();
        mainPage.getTitleStart().click();
        Assert.assertTrue(mainPage.getFavorite().isDisplayed());
    }
}
