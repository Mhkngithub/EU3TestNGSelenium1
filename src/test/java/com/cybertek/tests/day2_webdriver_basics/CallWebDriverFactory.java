package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class CallWebDriverFactory {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("CHROME");

        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("title = " + title);
    

    }
    
    
}
