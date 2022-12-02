package com.forum.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "/Users/Ciaran.Melarkey/source/chromedriver/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        // Navigate to home page
        chromeDriver.get("http://localhost:3000/forum/createpost");
        WebElement postTitle = chromeDriver.findElement(By.id("postTitle"));
        WebElement postText = chromeDriver.findElement(By.id("postText"));
        WebElement postCategory = chromeDriver.findElement(By.id("postCategory"));
        WebElement submit = chromeDriver.findElement(By.id("submit"));
        // Fill fields with data & sign up
        postTitle.sendKeys("John");
        postText.sendKeys("Doe");
        postCategory.click();
        postCategory.sendKeys(Keys.ARROW_UP,Keys.ENTER);
        submit.click();
        
    }
}
