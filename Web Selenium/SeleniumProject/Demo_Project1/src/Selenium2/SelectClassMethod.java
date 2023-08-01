package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SelectClassMethod {

    public static void main(String[] args) {
        //this is a situation you want to select from the list of languages from the dropdown
        //open browser
        WebDriver driver = new FirefoxDriver();

        //navigate to site
        driver.get("ENTER WEB URL HERE");

        //implicitWait = it is written only for that particular package and it is applicable for the codes on that package
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);

        //ExplicitWait = only for that method

        WebDriverWait wat = new WebDriverWait(driver,30);
        WebElement sel = wat.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='searchLanguage']")));
        //WebElement sel = wat.until(ExpectedConditions.elementToBeClickable(By.id(By.xpath("");

        //driver.findElement(By.id("searchLanguage")).sendKeys("English");

        Select Select = new Select(driver.findElement(By.id("searchLanguage")));

        //sel.selectByIndex(15); // if ur index is 15 on the list of language from the dropdown you have to count it

        sel.selectedByValue("hi");  // You have to get what represent the value

    }
}
