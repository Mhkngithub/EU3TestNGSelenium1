package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmozonTest {

    /**
     * TASK
     * search for selenium
     * click search button
     * verify 1-48 of 304 results for " java "
     *
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");

        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        searchBox.sendKeys("java");

        WebElement search = driver.findElement(By.xpath("//span [@id='nav-search-submit-text']"));

        search.click();

        String expected = "1-48 of over 5,000 results for";

        String actual = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();

        System.out.println(actual);

        if (expected.equals(actual)){
            System.out.println("pass");
        }else {
            System.out.println("expected result :" + expected );
            System.out.println("actual result :"+ actual );
            System.out.println("fail");
        }

    }
}
