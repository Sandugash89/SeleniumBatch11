package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
      /*
       task1:(use xpath)
RMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed. */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Sandugash");
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.xpath("//input[@name='Submit']"));
        login.click();
        Thread.sleep(2000);
        WebElement span = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        System.out.println(span.getText());
        Thread.sleep(2000);
        driver.close();






    }
}
