package com.cybertek.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oznur {
        public static void main(String[] args) throws Exception{

                System.setProperty("webdriver.chrome.driver",
                        "/Users/maratjumadilov/Documents/selenium dependencies/drivers/chromedriver");


                WebDriver driver = new ChromeDriver();

                for(int i = 1; i <= 1000; i++ ) {
                        driver.manage().window().maximize();
                        driver.get("https://youtube.com/channel/UCjNwxPbNCs9xNiUGfV8PocQ");


                        driver.navigate().to("https://youtube.com/watch?v=-zgBj-4haJc&t=6s");
                        Thread.sleep(10000);
                        driver.navigate().back();
                        Thread.sleep(5000);

                        driver.navigate().to("http://youtube.com/watch?v=adrP15hZ6go");
                        Thread.sleep(25000);
                        driver.navigate().to("http://youtube.com/watch?v=PwMsysSDtlU");
                        Thread.sleep(25000);
                        driver.navigate().to("http://youtube.com/watch?v=BJimhaqOfjo");
                        Thread.sleep(25000);
                        driver.navigate().to("http://youtube.com/watch?v=daPaAUE-1R0");
                        Thread.sleep(25000);



                }
                driver.close();

        }

}
