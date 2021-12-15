package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        /*task3:(use css)
goto:http://syntaxprojects.com/input-form-demo.php
fill in all the textboxes in the form (edited)
  */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name*='first']")).sendKeys("Sandugash");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder^='Last']")).sendKeys("Shukbarova");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='E-Mail Address']")).sendKeys("sandugash_shukbarova@mail.ru");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("7044140410");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='address']")).sendKeys("354 Elk avenue");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[placeholder='city']")).sendKeys("Glendale");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("select[name='state']")).sendKeys("California");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder^='Zip']")).sendKeys("91204");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder^='Website']")).sendKeys("evelin.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[value='no']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("Selenium BAtch11");
        Thread.sleep(2000);

    }
}
