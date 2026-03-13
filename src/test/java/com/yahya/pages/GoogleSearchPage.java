package com.yahya.pages;

import com.yahya.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    @FindBy(name = "q")
    public WebElement searchBox;

    public GoogleSearchPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void searchWord(){

        searchBox.sendKeys("apple", Keys.ENTER);
    }
}
