package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

    public static void main(String[] args) {
        //open browser
        WebDriver driver = new FirefoxDriver();

        //navigate to site
        driver.get("ENTER WEB URL HERE");

        if (driver.findElement(By.id("enter the id")).isSelected()) {

            driver.findElement(By.id("ENTER ID")).click();
            //Assuming radio button is NOT selected you can use the following syntax
        }

    }
}
