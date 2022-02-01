package com.class05.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {
         /*HRMS Application Negative Login: Open chrome browser
        Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
        Enter valid username, Leave password field empty, Click on login button
        Verify error message with text “Password cannot be empty” is displayed.*/
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username= driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Sandugash");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        WebElement text = driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        System.out.println(text.getText());

        }
}
