package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPageByMeri {
    public CalendarPageByMeri() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//ul[@id='appmenu']//li[7]/a")
    public WebElement calendarBtn;

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEventBtn;

    @FindBy (xpath = "//input[@class='app-sidebar-header__maintitle-input']")
    public WebElement eventTitleField;

    @FindBy(xpath = "(//div[@class='mx-input-wrapper']//input[@name='date'])[2]")
    public WebElement firstDate;

    @FindBy(xpath = "(//div[@class='mx-input-wrapper']//input[@name='date'])[3]")
    public WebElement secondDate;

    @FindBy(xpath = "//*[@id=\"tab-app-sidebar-tab-details\"]/div[1]/div[1]/div[2]/textarea")
    public WebElement location;

    @FindBy(xpath = "//textarea[@placeholder='Add a description']")
    public WebElement description;

    @FindBy(xpath = "(//span[.='Confirmed'])[1]")
    public WebElement status;

    @FindBy(xpath = "//span[.='Confirmed']")
    public WebElement confirmed;

    @FindBy(xpath = "//span[.='When shared show full event']")
    public WebElement showSharedField;

    @FindBy(xpath = "//span[.='When shared show']")
    public WebElement onlyBusy;

    @FindBy(xpath = "//span[.='Busy']")
    public WebElement showUs;

    @FindBy (xpath = "//*[@id=\"tab-app-sidebar-tab-details\"]/div[1]/div[6]/div[2]/div/div[2]/input")
    public WebElement categories;

    @FindBy(xpath ="//*[@id=\"tab-app-sidebar-tab-details\"]/div[1]/div[6]/div[2]/div/div[3]/ul/li[6]/span/span/span")
    public WebElement meeting;

    @FindBy (xpath = "//*[@id=\"tab-app-sidebar-tab-details\"]/div[2]/button")
    public WebElement saveBtn;

    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-view-day']")
    public WebElement viewBtn;

    @FindBy (xpath = "//span[@class='action-button__icon icon-view-day']")
    public WebElement day;

    @FindBy (xpath = "//span[@class='action-button__icon icon-view-week']")
    public WebElement week;

    @FindBy (xpath = "//span[@class='action-button__icon icon-view-month']")
    public WebElement month;


    @FindBy (xpath = "//span[@class='action-button__icon icon-view-list']")
    public WebElement list;






}
