package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buttons {
    public WebDriver driver;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-settings']/ul[@class='header-settings__first-level']/li[@class='header-settings__item header-settings__item_f']")
    private WebElement languageButton;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest en static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-settings']/ul[@class='header-settings__first-level']/li[@class='header-settings__item header-settings__item_f']")
    private WebElement languageButtonEn;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest en static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-settings']/ul[@class='header-settings__first-level']/li[@class='header-settings__item header-settings__item_f']/ul[@class='header-settings__second-level on-hover on-top']/li[@class='nowrap'][1]")
    private WebElement languageButtonEnRu;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-settings']/ul[@class='header-settings__first-level']/li[@class='header-settings__item header-settings__item_f']/ul[@class='header-settings__second-level on-hover on-top']/li[@class='nowrap'][1]")
    private WebElement languageRu;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-settings']/ul[@class='header-settings__first-level']/li[@class='header-settings__item header-settings__item_f']/ul[@class='header-settings__second-level on-hover on-top']/li[@class='nowrap'][2]")
    private WebElement languageEn;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-recent']/a[@class='header-nav__link']")
    private WebElement newButton;
    @FindBy(xpath = "/html/body/header/div[1]/div/ul/li/a")
    private WebElement enterArea;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/section[@id='window']/div[@id='window-content']/div[@class='window-block']/div[@id='auth']/div[@id='show-auth']/form[@class='form-auth']/input[@id='login']")
    private WebElement inputLogin;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/section[@id='window']/div[@id='window-content']/div[@class='window-block']/div[@id='auth']/div[@id='show-auth']/form[@class='form-auth']/input[@id='password']")
    private WebElement inputPassword;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/section[@id='window']/div[@id='window-content']/div[@class='window-block']/div[@id='auth']/div[@id='show-auth']/form[@class='form-auth']/button[@class='btn-green btn-green--bdtl enter']")
    private WebElement enterButton;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-community']/a[@class='header-nav__link']")
    private WebElement communityButton;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-video']/a[@class='header-nav__link']")
    private WebElement videoButton;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-tag-sssr']/a[@class='header-nav__link']")
    private WebElement nostalgyButton;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-tag-ynews']/a[@class='header-nav__link']")
    private WebElement newsButton;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-auto']/a[@class='header-nav__link']")
    private WebElement autoButton;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-purge']/a[@class='header-nav__link']")
    private WebElement authorButton;

    //auth
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='auth ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/div[@class='header-user']/ul[@class='header-settings__first-level header-settings__relative']/li[@class='header-settings__item']")
    private WebElement userButton;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='auth ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/div[@class='header-user']/ul[@class='header-settings__first-level header-settings__relative']/li[@class='header-settings__item']/ul[@class='header-settings__second-level on-hover']/li[7]/a")
    private WebElement logoutButton;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/section[@id='window']/div[@id='window-content']/div[@class='window-block']/div[@id='auth']/div[@id='show-auth']/form[@class='form-auth']/div[@class='error']")
    private WebElement errorText;

    //new Page
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-recent']/ul[@class='header-nav__second-level']/li[@class='nav__block unique_block clearfix']/div[@class='nav__block__contents']/div[@id='header-0']/div[@class='tiny__info clearfix'][1]/div[@class='tiny__info__text']/a[@class='tiny__info__title']")
    private WebElement currentNew;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive fonts-loaded']/body[@class='guest ru static-header static-header-top']/div[@class='main-container container clearfix post']/div[@id='main-content']/div[@id='post']/h1[@class='content__title']")
    private WebElement titleCurrent;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-recent']/ul[@class='header-nav__second-level']/li[@class='nav__block unique_block clearfix']/div[@class='nav__block__contents']/div[@id='header-0']/div[@class='tiny__info clearfix'][1]/div[@class='tiny__info__text']/a[@class='tiny__info__title']")
    private WebElement titleStart;

    //community
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-community']/ul[@class='header-nav__second-level']/li[@class='nav__block unique_block clearfix']/div[@class='nav__block__contents']/div[@id='header-1']/div[@class='tiny__info clearfix'][1]/div[@class='tiny__info__text']/a[@class='tiny__info__title']")
    private WebElement currentCommunity;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive fonts-loaded']/body[@class='guest ru static-header static-header-top']/div[@class='main-container container clearfix post']/div[@id='main-content']/div[@id='post']/h1[@class='content__title']")
    private WebElement communityTitle;

    //video
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-video']/ul[@class='header-nav__second-level']/li[@class='nav__block clearfix']/div[@class='nav__block__contents']/div[@id='header-2']/div[@class='tiny__info clearfix'][1]/div[@class='tiny__info__text']/a[@class='tiny__info__title']")
    private WebElement currentVideo;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive fonts-loaded']/body[@class='video guest ru static-header static-header-top']/div[@class='main-container container clearfix post']/div[@id='main-content']/div[@id='post']/h1[@class='content__title']")
    private WebElement videoTitle;

    //nostalgia
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-tag-sssr']/ul[@class='header-nav__second-level']/li[@class='nav__block unique_block clearfix']/div[@class='nav__block__contents']/div[@id='header-11']/div[@class='tiny__info clearfix'][1]/div[@class='tiny__info__text']/a[@class='tiny__info__title']")
    private WebElement currentNostalgia;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive fonts-loaded']/body[@class='guest ru static-header static-header-top']/div[@class='main-container container clearfix post']/div[@id='main-content']/div[@id='post']/h1[@class='content__title']")
    private WebElement nostalgiaTitle;

    //news
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-tag-ynews']/ul[@class='header-nav__second-level']/li[@class='nav__block unique_block clearfix']/div[@class='nav__block__contents']/div[@id='header-12']/div[@class='tiny__info clearfix'][1]/div[@class='tiny__info__text']/a[@class='tiny__info__title']")
    private WebElement currentNews;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive fonts-loaded']/body[@class='guest ru static-header static-header-top']/div[@class='main-container container clearfix post']/div[@id='main-content']/div[@id='post']/h1[@class='content__title']")
    private WebElement newsTitle;

    //auto
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-auto']/ul[@class='header-nav__second-level']/li[@class='nav__block clearfix']/div[@class='nav__block__contents']/div[@id='header-13']/div[@class='tiny__info clearfix'][1]/div[@class='tiny__info__text']/a[@class='tiny__info__title']")
    private WebElement currentAuto;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='auto guest ru static-header static-header-top']/div[@class='main-container container clearfix post']/div[@id='main-content']/div[@id='post']/h1[@class='content__title']")
    private WebElement autoTitle;

    //author
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='guest ru static-header static-header-top']/header[@class='header position-fixed header_media_real']/div[@class='container clearfix']/nav[@class='header-nav']/ul[@class='header-nav__first-level']/li[@class='header-nav__item moved_link-purge']/ul[@class='header-nav__second-level']/li[@class='nav__block unique_block clearfix']/div[@class='nav__block__contents']/div[@id='header-20']/div[@class='tiny__info clearfix'][1]/div[@class='tiny__info__text']/a[@class='tiny__info__title']")
    private WebElement currentAuthor;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive fonts-loaded']/body[@class='guest ru static-header static-header-top']/div[@class='main-container container clearfix post']/div[@id='main-content']/div[@id='post']/h1[@class='content__title']")
    private WebElement authorTitle;

    //actions
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='auth ru static-header static-header-top']/div[@class='main-container container clearfix post']/div[@id='main-content']/div[@id='post']/div[@class='post_content']/div[@class='content__icons clearfix allow-rate']/div[@id='rate-3717029']/div[@class='expanded-rate']/button[@class='icon__60 icon__60--like rate-link like']")
    private WebElement like;
    @FindBy(xpath = "/html[@class='no-js design2016 html--adaptive']/body[@class='auth ru static-header static-header-top']/div[@class='main-container container clearfix post']/div[@id='main-content']/div[@id='post']/div[@class='post_content']/div[@class='content__icons clearfix allow-rate']/span[@class='icon__bg--meta icon__60 icon__60--favorites-top']/span[@class='icon__60__text counter-fav']")
    private WebElement favorite;




    public Buttons(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
        this.driver = webDriver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getErrorText() {
        return errorText;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getLanguageButtonEn() {
        return languageButtonEn;
    }

    public WebElement getLanguageButtonEnRu() {
        return languageButtonEnRu;
    }

    public WebElement getEnterArea() {
        return enterArea;
    }

    public WebElement getEnterButton() {
        return enterButton;
    }

    public WebElement getInputLogin() {
        return inputLogin;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getUserButton() {
        return userButton;
    }

    public WebElement getLanguageButton() {
        return languageButton;
    }

    public WebElement getLanguageEn() {
        return languageEn;
    }

    public WebElement getLanguageRu() {
        return languageRu;
    }

    public WebElement getCommunityButton() {
        return communityButton;
    }

    public WebElement getAuthorButton() {
        return authorButton;
    }

    public WebElement getAutoButton() {
        return autoButton;
    }

    public WebElement getNewButton() {
        return newButton;
    }

    public WebElement getNewsButton() {
        return newsButton;
    }

    public WebElement getNostalgyButton() {
        return nostalgyButton;
    }

    public WebElement getVideoButton() {
        return videoButton;
    }

    public WebElement getCurrentNew() {
        return currentNew;
    }

    public WebElement getTitleCurrent() {
        return titleCurrent;
    }

    public WebElement getTitleStart() {
        return titleStart;
    }

    public WebElement getAuthorTitle() {
        return authorTitle;
    }

    public WebElement getAutoTitle() {
        return autoTitle;
    }

    public WebElement getCommunityTitle() {
        return communityTitle;
    }

    public WebElement getCurrentAuthor() {
        return currentAuthor;
    }

    public WebElement getCurrentAuto() {
        return currentAuto;
    }

    public WebElement getCurrentCommunity() {
        return currentCommunity;
    }

    public WebElement getCurrentNews() {
        return currentNews;
    }

    public WebElement getCurrentNostalgia() {
        return currentNostalgia;
    }

    public WebElement getCurrentVideo() {
        return currentVideo;
    }

    public WebElement getNewsTitle() {
        return newsTitle;
    }

    public WebElement getNostalgiaTitle() {
        return nostalgiaTitle;
    }

    public WebElement getVideoTitle() {
        return videoTitle;
    }

    public WebElement getLike() {
        return like;
    }

    public WebElement getFavorite() {
        return favorite;
    }
}
