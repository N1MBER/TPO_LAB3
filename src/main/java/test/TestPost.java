package test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Buttons;
import pages.post.Fields;
import util.Configuration;

import java.util.concurrent.TimeUnit;

public class TestPost {
    private static WebDriver webDriver;
    public static Buttons mainPage;
    public static Actions actions;
    private static String login;
    private static String password;
    private static Fields fields;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", Configuration.getProperty("chrome_driver_path"));
        webDriver = new ChromeDriver();
        login = Configuration.getProperty("fishki_login");
        password = Configuration.getProperty("fishki_password");
        actions = new Actions(webDriver);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://fishki.net");
        mainPage = new Buttons(webDriver);
        fields = new Fields(webDriver);
    }

    public void auth(){
        mainPage.getEnterArea().click();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        fields.getLogin().sendKeys(login);
        fields.getPassword().sendKeys(password);
        fields.getSubmit().click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


//    @AfterClass
//    public static void close(){
//        webDriver.quit();
//    }

    @Test
    public void like(){
        auth();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actions.moveToElement(fields.getVideoButton()).perform();
//        String title = mainPage.getCurrentVideo().getText();
        fields.getVideoButtonCurrent().click();
        String[] arr = webDriver.getCurrentUrl().split("/");
        String id = arr[arr.length - 1].split("-")[0];
        System.out.println(id);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        String path = "//*[@id=\"rate-"+ id+"\"]/div[1]/button[1]";
        WebElement like = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
        like.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(fields.getNotification().isDisplayed());
    }
//
//    @Test
//    public void dislike(){
//        auth();
//        actions.moveToElement(mainPage.getVideoButton()).perform();
//        mainPage.getCurrentVideo().click();
//        String[] arr = webDriver.getCurrentUrl().split("/");
//        String id = arr[arr.length - 1].split("-")[0];
//        WebDriverWait wait = new WebDriverWait(webDriver, 10);
//        String path = "//*[@id=\"rate-"+ id+"\"]/div[1]/button[2]";
//        WebElement dislike = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
//        dislike.click();
//        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Assert.assertTrue(fields.getNotification().isDisplayed());
//    }

}
