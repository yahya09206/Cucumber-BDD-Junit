package com.yahya.pages;

import com.yahya.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {



    public GoogleSearchPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


}
