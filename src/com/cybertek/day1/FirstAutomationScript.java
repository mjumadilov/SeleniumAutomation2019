package com.cybertek.day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationScript {

    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "/Users/maratjumadilov/Documents/selenium dependencies/drivers/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");



    }

}
