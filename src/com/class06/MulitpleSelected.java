package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class MulitpleSelected {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //navigate
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        //find the webElement dropDown
        WebElement statesDD = driver.findElement(By.cssSelector("select#multi-select"));

        //we can use select class so we will make an object of select class
        Select select=new Select(statesDD);

        //check if the dropdown is multiple
        //boolean isMul = select.isMultiple();
       System.out.println(select.isMultiple());

        select.selectByIndex(2);

        Thread.sleep(2000);

        select.selectByVisibleText("Texas");

        Thread.sleep(2000);

        select.selectByValue("Ohio");

        Thread.sleep(2000);

        select.deselectByIndex(2);

        Thread.sleep(2000);

        select.deselectByVisibleText("Texas");

        //to use iterator to get all the options text and print in the console
        List<WebElement> options = select.getOptions();
        Iterator<WebElement> it = options.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getText());
        }
}}
