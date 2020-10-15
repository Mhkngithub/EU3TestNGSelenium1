package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openBrowser {
    public static void main(String[] args) {
//webdriver, can you make chorome ready for me for automation
        WebDriverManager.chromedriver().setup();
//  make an object from chrome driver
        // webdiver represent the browser
        // we are creating driver for chrome browser
        // new chrome Driver()
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertekschool.com");

        //WebDriverManager.firefoxdriver().setup();
       // WebDriver driver = new FirefoxDriver();
       // driver.get("https://www.fscebook.com");

        driver.navigate().back();
    }

}
