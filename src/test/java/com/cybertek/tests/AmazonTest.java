package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    /**
     * TASK
     * go to amazon.com
     * search for selenium
     * click search button
     * print 1-48 of 304 results for "selenium"
     *
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        Thread.sleep(3000);

        searchBox.sendKeys("selenium");

        Thread.sleep(2000);
        //click search button
        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        String resultText = result.getText();

        System.out.println("resultText = " + resultText);

        String expectedResult = "1-48 of over 5,000 results for";

        if(expectedResult.equals(resultText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedResult = " + expectedResult);
            System.out.println("resultText = " + resultText);
        }

        driver.quit();

    }


}