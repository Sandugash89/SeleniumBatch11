package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement singleCheckBox = driver.findElement(By.cssSelector("input#isAgeSelected"));
        // check the check box
        singleCheckBox.click();
        Thread.sleep(2000);
        //uncheck the check box
       singleCheckBox.click();
        //Task 2 check all the text boxes simultaneously
        //Select a xpath that has common attribute value for all the checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        //print the number of checkBoxes
        int size=checkBoxes.size();
        System.out.println("The total number of checkboxes is : "+size);

        //iterate through
        for(WebElement checkBox:checkBoxes){

            //get the attribute "value" of all checkbox
            String valueofAttribute=checkBox.getAttribute("value");
            System.out.println(valueofAttribute);

            //select the checkBox with the text option3
            if(valueofAttribute.equalsIgnoreCase("Option-3")){
                checkBox.click();
            }
}
}}
