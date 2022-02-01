package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        // find element drop down
        WebElement days=driver.findElement(By.cssSelector("select#select-demo"));
        //use the select class to select from drop down

        Select select = new Select(days);
        //boolean isMul = select.isMultiple();
        System.out.println(select.isMultiple());
        //select the value from drop down using selectByIndex
        select.selectByIndex(1);
      //  Thread.sleep(2000);
      //  select.selectByIndex(2);
      //  Thread.sleep(2000);
      //  select.selectByIndex(7);
        //select by visible text
       // select.selectByVisibleText("Thursday");

        //select by value
        //select.selectByValue("Wednesday");
        List<WebElement> allOptions = select.getOptions();
        //int Size = allOptions.size();
        System.out.println(select.getOptions().size());

        //iterate through list all options and get the text of each option
        /*for (WebElement option:allOptions){
            System.out.println(option.getText());
        }*/
        for(int i=0; i< allOptions.size(); i++){
            String OptionText=allOptions.get(i).getText();
            System.out.println(OptionText);
        }
    }
}
