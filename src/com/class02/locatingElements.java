package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.get("http:/facebook.com");
        driver.findElement(By.id("email")).sendKeys("shukbarovasandugash@gmail.com");
        driver.findElement(By.name("pass")).sendKeys(("S1012890190"));
       driver.findElement(By.name("login")).click();
       driver.findElement(By.linkText("forgotton")).click();
        driver.findElement(By.partialLinkText("forgotton")).click();
    }
}
