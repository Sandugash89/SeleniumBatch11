package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto/");
        driver.manage().window().maximize();
        //enable the alert
        driver.findElement(By.cssSelector("button#alert")).click();
        Thread.sleep(2000);
        //switch the focus of selenium
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        //handling confirmation alert
        //enabling the confirmation alert
        driver.findElement(By.id("confirm")).click();
        Thread.sleep(2000);
        //get the text from the alert
        Alert confirmationAlert= driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        //cancel the alert;
        confirmationAlert.dismiss();
        //promt alert;
        //enable;
        driver.findElement(By.id("promt")).click();
        Thread.sleep(5000);
        //switch the focus
        Alert promptAlert = driver.switchTo().alert();
        //send some keys to this alert
        promptAlert.sendKeys("hello we need sleep");
        //accept
        promptAlert.accept();








    }
}
