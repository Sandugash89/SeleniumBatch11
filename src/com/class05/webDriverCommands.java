package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement userName=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("AON");
        //Delete the username entered
        Thread.sleep(2000);
        userName.clear();
        //Enter the new username
        Thread.sleep(2000);
        userName.sendKeys("Tester");
    }
}
