package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        /* task2:(use advance xpath)
RMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
enter wrong password
Click on login button
Verify error message with text “Invalid Credenitals” is displayed. */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.id("txtPassword")).sendKeys("12234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        Thread.sleep(2000);
        WebElement span = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        System.out.println(span.getText());
        Thread.sleep(2000);
        driver.quit();


    }
}
