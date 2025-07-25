package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.example.stapDefs.Hooks.driver;

public class BasePage {


    public BasePage(){
        PageFactory.initElements(driver,this);
    }
}
