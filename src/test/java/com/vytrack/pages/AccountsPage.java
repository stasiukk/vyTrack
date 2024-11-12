package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountsPage extends BasePage{

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement button_filter_icon;


    @FindBy(xpath = "//span[@class='filter-items']/div[@class='filter-item oro-drop']/div[1]")
    public List<WebElement> button_filter_items;


}
