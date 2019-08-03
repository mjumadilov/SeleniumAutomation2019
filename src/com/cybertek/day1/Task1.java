package com.cybertek.day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class Task1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/maratjumadilov/Documents/selenium dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();



   /*     for (int i=0; i <=2; i++) {
            driver.get("http://cybertekschool.com");

      
        }
        driver.quit();
        */

       // driver.getPageSource();


        System.setProperty("webdriver.gecko.driver", "/Users/maratjumadilov/Documents/selenium dependencies/drivers/geckodriver");

        driver = new FirefoxDriver();
       for(int i =0; i<= 10; i++) {
           driver.get("http://youtube.com/watch?v=kkcS6Nc_TIU.com");
       }
        driver.quit();





    }
}
