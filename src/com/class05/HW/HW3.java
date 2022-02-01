package com.class05.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    /*HW3 Go to facebook, click on create new account  page, Fill out the whole form, Click signup*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(@data-testid, 'open')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Eve");
        driver.findElement(By.name("lastname")).sendKeys("uak");
        driver.findElement(By.name("reg_email__")).sendKeys("11111");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
        //WebElement month= driver.findElement(By.cssSelector(""));
        driver.findElement(By.id("month")).sendKeys("December");
        driver.findElement(By.id("year")).sendKeys("1989");
        driver.findElement(By.xpath("//label[text()='Женщина']")).click();
        driver.findElement(By.name("websubmit")).click();


    }
}
