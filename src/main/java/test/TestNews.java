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

public class TestNews {
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
//    public void testNews(){
//        mainPage.getNewsButton().click();
//        Assert.assertEquals("https://fishki.net/tag/ynews/",webDriver.getCurrentUrl());
//    }

    @Test
    public void checkNewsTarget() {
        actions.moveToElement(mainPage.getNewsButton()).perform();
        String title = mainPage.getCurrentNews().getText();
        mainPage.getCurrentNews().click();
        String current = mainPage.getNewsTitle().getText();
        System.out.println(title);
        System.out.println(current);
        String[] arr = title.split("\\(");
        String[] current_arr = current.split("\\(");
        Assert.assertEquals(arr[0].trim(), current_arr[0].trim());
    }
}
