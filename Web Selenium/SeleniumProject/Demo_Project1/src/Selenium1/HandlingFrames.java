package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.security.DrbgParameters;

public class HandlingFrames {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("ENTER URL");
        driver.switchTo().frame("enter the frame name");

        driver.findElement(By.id("Frame1txt")).clear(); //used this code to clear a text in that box
        driver.findElement(By.id("Frame1txt")).sendKeys("ajsjhsakjsjka"); //Just to replace with the id in string

        driver.switchTo().defaultContent(); //SWITCH TO TOP WINDOW
        driver.switchTo().frame("ENTER NAME"); //SWITCH TO FRAME C
        driver.findElement(By.id("Frame3txt")).clear(); //This code clears the default data inside the test field
        driver.findElement(By.id("Frame3txt")).sendKeys("yuuayiaiaiiauooa"); //It will enter this ID in the String


    }

}

