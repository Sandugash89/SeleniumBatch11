package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsQademo {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        Thread.sleep(3000);
        WebElement TextBox=driver.findElement(By.className("form-control"));
        TextBox.sendKeys("jdhsfajhhdjf");


    }
}
