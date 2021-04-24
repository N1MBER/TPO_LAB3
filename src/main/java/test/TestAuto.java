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

public class TestAuto {
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
//
//    @Test
//    public void testAuto(){
//        mainPage.getAutoButton().click();
//        Assert.assertEquals("https://fishki.net/auto/",webDriver.getCurrentUrl());
//    }

    @Test
    public void checkAutoTarget() {
        actions.moveToElement(mainPage.getAutoButton()).perform();
        String title = mainPage.getCurrentAuto().getText();
        mainPage.getCurrentAuto().click();
        String current = mainPage.getAutoTitle().getText();
        String[] arr = title.split("\\(");
        String[] current_arr = current.split("\\(");
        Assert.assertEquals(arr[0].trim(), current_arr[0].trim());
    }
}
