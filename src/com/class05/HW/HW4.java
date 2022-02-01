package com.class05.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW4 {
    public static void main(String[] args) throws InterruptedException {
        /*Go to ebay.com , get all the categories and print them in the console, select Computers/Tables & Networking
       click on search, verify the title of page*/
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        List<WebElement> allcategories = (List<WebElement>) driver.findElement(By.cssSelector("select#gh-cat option"));
       for(WebElement allCat:allcategories){
           String textofCat= allCat.getText();
           System.out.println(textofCat);
           if(textofCat.equals("Computers/Tablets & Networking")){
               allCat.click();
           }}

           driver.findElement(By.cssSelector("input#gh-btn")).click();
           driver.getTitle();

       }

    }

