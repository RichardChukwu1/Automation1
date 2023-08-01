package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Locators {
    public static void main(String[] args) {

        /*
        * Test - to check login details
        * Step - Open browser
        *      - type in url
        *      - enter username pw into the field
        *      -click sign
        *      - you confirm login details
         */

        /*open browser*/
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver1 = new ChromeDriver();
        //WebDriver driver2 = new InternetExplorerDriver();

        /*type in url*/
        driver.get("https://www.amazon.co.uk/");

        /*username*/
        driver.findElement(By.id("username")).sendKeys("richard");

        /*password*/
        driver.findElement(By.id("username")).sendKeys("Joanne2018");

        /*click sign button*/
        driver.findElement(By.id("login")).click();


    }
}
