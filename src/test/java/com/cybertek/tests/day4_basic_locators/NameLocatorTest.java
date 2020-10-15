package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome" );


        // make browser fullscreen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));

        fullNameInput.sendKeys("Mike Smith");

        // put some email and click sing up button
        Thread.sleep(3000);
        WebElement emailBox = driver.findElement(By.name("email"));
        emailBox.sendKeys("mikesmith@gmail.com");

        Thread.sleep(3000);

        WebElement SingUPButton = driver.findElement(By.name("wooden_spoon"));
        SingUPButton.click();


        

    }


}
