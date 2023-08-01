package SeleniumDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class HandlingWindows {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("enter your file location");

        //handling two windows

        String parent  =driver.getWindowHandle(); //login page
        driver.findElement(By.linkText("Sign In")).click();

        Set<String> wlist = driver.getWindowHandles(); //parent and child window

        for(String s:wlist){

            if(!(s.equals(parent))){
                driver.switchTo().window(s);
                driver.findElement(By.id("signin")).sendKeys("gghgkkhlhllh");
                driver.close();
            }
        }
        driver.switchTo().window(parent);
        driver.findElement(By.id("username")).sendKeys("hghjhkajkjljajl");
    }
}
