package test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Buttons;
import util.Configuration;

import java.util.concurrent.TimeUnit;

public class MenuTest {
    private static WebDriver webDriver;
    public static Buttons mainPage;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", Configuration.getProperty("chrome_driver_path"));
        webDriver = new ChromeDriver();
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
//    public void testNewPage(){
//        mainPage.getNewButton().click();
//        Assert.assertEquals("https://fishki.net/recent/",webDriver.getCurrentUrl());
//    }

//    @Test
//    public void testCommunity(){
//        mainPage.getCommunityButton().click();
//        Assert.assertEquals("https://fishki.net/community/list/",webDriver.getCurrentUrl());
//    }

//    @Test
//    public void testVideo(){
//        mainPage.getVideoButton().click();
//        Assert.assertEquals("https://fishki.net/video/",webDriver.getCurrentUrl());
//    }
//
//    @Test
//    public void testNostalgia(){
//        mainPage.getNostalgyButton().click();
//        Assert.assertEquals("https://fishki.net/tag/sssr/",webDriver.getCurrentUrl());
//    }
//
//    @Test
//    public void testNews(){
//        mainPage.getNewsButton().click();
//        Assert.assertEquals("https://fishki.net/tag/ynews/",webDriver.getCurrentUrl());
//    }
//
//    @Test
//    public void testAuto(){
//        mainPage.getAutoButton().click();
//        Assert.assertEquals("https://fishki.net/auto/",webDriver.getCurrentUrl());
//    }
//
    @Test
    public void testAuthor(){
        mainPage.getAuthorButton().click();
        Assert.assertEquals("https://fishki.net/tag/jaavtor/",webDriver.getCurrentUrl());
    }
}
