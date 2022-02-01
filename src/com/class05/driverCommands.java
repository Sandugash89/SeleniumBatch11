package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //go to the websiteEbay.com
        driver.get("http://ebay.com");
        driver.manage().window().maximize();
        //get all the links that are there on ebay.com
        //as we have multiple elements with tag name a, so we use driver.findElements()
        //as there are multiple elements so we need to store it in list of WebElements
        List<WebElement> links= driver.findElements(By.tagName("a")); //dimond oprator
        //print the size of links
        System.out.println("The size of containing link "+ links.size());
        //print all the text of all the links
        for(WebElement link:links){
            //get the text out of the webElement link
            String linkText= link.getText();
            //only print the links that have some text and ignore the rest
            if(!linkText.isEmpty()){
                System.out.println(linkText);
                //print all the links along with the text
                // use the method .getAttribute to have the value of a particular attribute in the tag
                String linkAdress=link.getAttribute("href");
                System.out.println(linkAdress);
            }

        }

    }
}
