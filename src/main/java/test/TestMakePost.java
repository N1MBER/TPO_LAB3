package test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
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

public class TestMakePost {
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
        mainPage.getInputLogin().sendKeys(login);
        mainPage.getInputPassword().sendKeys(password);
        mainPage.getEnterButton().click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void setFields() {
        fields.getButtonNewPost().click();
        fields.getPostTitle().sendKeys("Заголовок тестового поста");
        fields.getPostDescription().sendKeys("Описание тестового поста");
        fields.getRadioType().click();
        fields.getDropDownButton().click();
        fields.getCategory().click();
        fields.getTagInput().sendKeys("web, react, javascript, ");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(fields.getSendButton()));
        element.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(fields.getErrorMessage().isDisplayed());
    }

    @AfterClass
    public static void close(){
        webDriver.quit();
    }


    @Test
    public void makePost(){
        auth();
        setFields();
    }
}
