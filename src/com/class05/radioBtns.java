package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioBtns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php/");
        Thread.sleep(2000);
        //getting the element radio button webElement
        WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
        //click the radio btn Female


        //check if the radio btn is displayed
        boolean isDisplayed= femaleRadioBtn.isDisplayed(); // есть на сайтом или нет
        System.out.println("The female radio button is displayed on the webPage :"+isDisplayed);

        //check if the radio btn is enabled
        boolean isEnabled=femaleRadioBtn.isEnabled(); // можно ли кликать на кнопку
        System.out.println("The female radio button is enabled on the webPage :"+isEnabled);

        //check if the female radio button is selected
        boolean isSelected=femaleRadioBtn.isSelected(); // кликнули мы или нет
        System.out.println("The female radio button is selected on the webPage :"+isSelected);

        //Select the female radio button only if its enabled
        if(isEnabled){
            femaleRadioBtn.click();
        }

        //after clicking the button print if its selected or not
        isSelected= femaleRadioBtn.isSelected();
        System.out.println("The female radio button is selected on the webPage :"+isSelected);

    }
}
