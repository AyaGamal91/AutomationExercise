package org.example.stapDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void openBrowser()  {
        String browserName = configuration.get("browserName");
        if(browserName.contains("chrome")){
            driver=new ChromeDriver();

        }
        else if (browserName.contains("firefox"))
        {
        driver = new FirefoxDriver();




    }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationexercise.com/");

    }
    @After
    public void quitBrowser() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();

    }



}
