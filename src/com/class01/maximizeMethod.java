package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeMethod {
    public static void main(String[]agrs){

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        // to maximize the window
        driver.manage().window().maximize();

        //to show fullscreen of your browser
        // driver.manage().window().fullscreen();
    }
}
