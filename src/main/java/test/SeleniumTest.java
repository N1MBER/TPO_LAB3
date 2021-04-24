package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.Configuration;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class SeleniumTest {
    public static WebDriver chromeDriver;

    @BeforeClass
    public static void init() {
        System.setProperty("webdriver.chrome.driver", Configuration.getProperty("chrome_driver_path"));
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void getTitle(){
        chromeDriver.get("https://fishki.net");
        String title = chromeDriver.getTitle();
        System.out.println(title);
        assertEquals("Fishki.net - Сайт хорошего настроения", title);
    }
}