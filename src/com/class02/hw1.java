package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw1 {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("hppt://google.com");
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Sandugash");
        driver.findElement(By.name("customer.lastName")).sendKeys("Shukbarova");
        driver.findElement(By.id("customer.address.street")).sendKeys("W ELK ave");
        driver.findElement(By.id("customer.address.city")).sendKeys("Glendale");
        driver.findElement(By.id("customer.address.state")).sendKeys("California");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("91204");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("702002022");
        driver.findElement(By.name("customer.ssn")).sendKeys("000-03-0000");
        driver.findElement(By.name("customer.username")).sendKeys("Sandugash89");
        driver.findElement(By.name("customer.password")).sendKeys("Shukbarova");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Shukbarova");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);

        driver.quit();




    }
}
