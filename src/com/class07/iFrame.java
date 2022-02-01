package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Watchable;

public class iFrame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        //Switch to the desired id frame1 frame as out desired webelement is inside that frame
        driver.switchTo().frame(4);


        // as frame 2 doesnt lie inside frame1 so inorder to get there we need to
        //switch out focus to the deafult page
        driver.switchTo().defaultContent();
        // switch to the id frame2
        driver.switchTo().frame("frame2");

        // getting the webelement
        WebElement text1= driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is "+ text1.getText());

        //located the webelement
        WebElement text2 = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is "+text2.getText());

        //in order to click on webElment "Form"
//switch the focus back to the default
        driver.switchTo().defaultContent();
// i can simply locate element as it is not inside the frame and perform operations on it

    }
}
