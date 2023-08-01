package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators2 {

    public static void main(String[] args) {
        /*open browser*/
        WebDriver driver = new FirefoxDriver();

        /*type url*/
        driver.get("type in your url");

        /*click on the link*/
        driver.findElement(By.linkText("Sign In")).click();

        driver.close();
        driver.quit();

    }
}
