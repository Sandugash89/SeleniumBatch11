package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw2 {
    /*navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser (отредактировано)*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        WebElement createNewAccount= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccount.click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Sandugash");
        driver.findElement(By.name("lastname")).sendKeys("Shukbarova");
        driver.findElement(By.name("reg_email__")).sendKeys("shukbarova@mail.ru");
        driver.findElement(By.name("reg_passwd__")).sendKeys("asdfghk234");
        driver.findElement(By.id("day")).sendKeys("10");
        driver.findElement(By.id("month")).sendKeys("December");
        driver.findElement(By.id("year")).sendKeys("1989");
        Thread.sleep(2000);
        driver.findElement(By.name("sex")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        driver.quit();

    }
}
