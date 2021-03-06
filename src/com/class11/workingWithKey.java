package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class workingWithKey {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // login to the website
        WebElement username = driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.cssSelector("input#ctl00_MainContent_password"));

        // using the KEYS
        username.sendKeys("Tester", Keys.TAB);
        password.sendKeys("test", Keys.ENTER);

    }
}
