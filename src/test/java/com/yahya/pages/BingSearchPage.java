package com.yahya.pages;

import com.yahya.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingSearchPage {

    @FindBy(xpath = "//div/textarea[@id='sb_form_q']")
    public WebElement searchBox;

    public BingSearchPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void searchBox(){

        searchBox.sendKeys("orange", Keys.ENTER);

    }
}
