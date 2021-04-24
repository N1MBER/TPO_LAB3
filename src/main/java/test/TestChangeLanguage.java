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

public class TestChangeLanguage {
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

//    @Test
//    public void changeToEn(){
//        actions.moveToElement(mainPage.getLanguageButton()).perform();
//        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        mainPage.getLanguageEn().click();
//        Assert.assertEquals("https://en.fishki.net/",webDriver.getCurrentUrl());
//    }

    @Test
    public void changeToRu(){
        webDriver.get("https://en.fishki.net/");
        actions.moveToElement(mainPage.getLanguageButtonEn()).perform();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.getLanguageButtonEnRu().click();
        Assert.assertEquals("https://fishki.net/",webDriver.getCurrentUrl());
    }
}
