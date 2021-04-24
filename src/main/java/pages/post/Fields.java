package pages.post;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fields {
    public WebDriver driver;
    @FindBy(xpath = "//*[@id=\"tour-step3\"]")
    private WebElement buttonNewPost;

    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='auth ru static-header static-header-top slider_mouse_event']/div[@class='main-container container clearfix compose']/div[@id='main-content']/div[@class='container clearfix post-add']/div[@id='main_add_form']/div[@class='title_hint_obj hint_container']/div[@class='publisher__input']/input[@id='new_post_title']")
    private WebElement postTitle;

    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='auth ru static-header static-header-top slider_mouse_event']/div[@class='main-container container clearfix compose']/div[@id='main-content']/div[@class='container clearfix post-add']/div[@id='main_add_form']/div[@class='description_hint_obj hint_container']/div[@class='publisher__input']/textarea[@id='description']")
    private WebElement postDescription;

    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='auth ru static-header static-header-top slider_mouse_event']/div[@class='main-container container clearfix compose']/div[@id='main-content']/div[@class='container clearfix post-add']/div[@id='main_add_form']/div[@class='category_hint_obj hint_container']/div[@class='publisher__tags publisher__cats clearfix']/div[@class='publisher__tags__col publisher__tags__col_first']/label")
    private WebElement radioType;

    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='auth ru static-header static-header-top slider_mouse_event']/div[@class='main-container container clearfix compose']/div[@id='main-content']/div[@class='container clearfix post-add']/div[@id='main_add_form']/div[@id='communities_list']/div[@class='publisher__input add_community_selector']/span[@class='custom-combobox']/a[@class='ui-button ui-widget ui-button-icon-only custom-combobox-toggle ui-corner-right']")
    private WebElement dropDownButton;

    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='auth ru static-header static-header-top slider_mouse_event']/ul[@id='ui-id-2']/li[@class='ui-menu-item'][1]")
    private WebElement category;

    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='auth ru static-header static-header-top slider_mouse_event']/div[@class='main-container container clearfix compose']/div[@id='main-content']/div[@class='container clearfix post-add']/div[@id='main_add_form']/div[@class='tags_hint_obj hint_container']/div[@class='publisher__input publisher__tags']/input[@id='tags']")
    private WebElement tagInput;

//    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='auth ru static-header static-header-top slider_mouse_event']/div[@class='main-container container clearfix compose']/div[@id='main-content']/div[@id='mydiv']/ul[@id='ui-id-1']/li[@class='ui-menu-item'][1]")
    @FindBy(xpath = "//*[@id=\"ui-id-1\"]/li[1]")
    private WebElement tagElement;

    @FindBy(xpath = "/html/body/div[5]/div[1]/div[1]/div/div[7]/div[1]/div[2]/div[1]/input")
    private WebElement inputTitle;

    @FindBy(xpath = "//*[@id=\"gallery_objects\"]/div[3]")
    private WebElement errorMessage;

    @FindBy(xpath = "//*[@id=\"main_add_form\"]/div[13]/button/strong")
    private WebElement sendButton;

    @FindBy(xpath = "/html/body/footer/div/nav[1]/ul[3]/li[1]/a")
    private WebElement text;

    @FindBy(xpath = "/html/body/div[11]/div/a")
    private WebElement cookieButton;

    @FindBy(xpath = "//*[@id=\"rate-3723871\"]/div[1]/button[1]")
    private WebElement like;

    @FindBy(xpath = "//*[@id=\"rate-3723871\"]/div[1]/button[2]")
    private WebElement dislike;
    @FindBy(xpath = "//*[@id=\"jGrowl\"]")
    private WebElement notification;

    @FindBy(xpath = "//*[@id=\"login\"]")
    private WebElement login;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"show-auth\"]/form/button")
    private WebElement submit;

    @FindBy(xpath = "/html/body/header/div[1]/nav[1]/ul/li[3]/a")
    private WebElement videoButton;

    @FindBy(xpath = "//*[@id=\"header-2\"]/div[1]/div/a")
    private WebElement videoButtonCurrent;

    public Fields(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
        this.driver = webDriver;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getVideoButton() {
        return videoButton;
    }

    public WebElement getVideoButtonCurrent() {
        return videoButtonCurrent;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getDislike() {
        return dislike;
    }

    public WebElement getLike() {
        return like;
    }

    public WebElement getNotification() {
        return notification;
    }

    public WebElement getCookieButton() {
        return cookieButton;
    }

    public WebElement getText() {
        return text;
    }

    public WebElement getSendButton() {
        return sendButton;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getInputTitle() {
        return inputTitle;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getButtonNewPost() {
        return buttonNewPost;
    }

    public WebElement getPostDescription() {
        return postDescription;
    }

    public WebElement getCategory() {
        return category;
    }

    public WebElement getDropDownButton() {
        return dropDownButton;
    }

    public WebElement getPostTitle() {
        return postTitle;
    }

    public WebElement getRadioType() {
        return radioType;
    }

    public WebElement getTagElement() {
        return tagElement;
    }

    public WebElement getTagInput() {
        return tagInput;
    }
}
