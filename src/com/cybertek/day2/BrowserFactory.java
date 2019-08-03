package com.cybertek.day2;


// June 23 Saturday

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {


    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
        //getDriver is a static method
        //so we don't need to create an object
        //to use that method
        //in order to call static members
        //we use classname not object name
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize(); // command to maximize browser
        driver.get("http://practice.cybertekschool.com");
    }

    //it's not main method
    //it's a method that returns object of webdriver
    //it can be firefox of chrome based on value of parameter
    //again, we create method to reuse a code
    //remember, if some code must be used at least twice
    //create method for this code
    //don't duplicate same code again and again
    public static WebDriver getDriver(String browser) {
        if (browser.equals("chrome")) {
            //we need to specify properties for chromedriver
            //otherwise, selenium will not know where to find chromedriver
            //1st param is webdriver type
            //2nd param is for path to the web driver
            //it's required by selenium web driver to interact with web browser
            System.setProperty("webdriver.chrome.driver", "/Users/maratjumadilov/Documents/selenium dependencies/drivers/chromedriver");
            // put your path to the webdriver
            return new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/maratjumadilov/Documents/selenium dependencies/drivers/geckodriver"); // put your path to the webdriver
            return new FirefoxDriver();
        } else {
            return null;
        }

    }
}