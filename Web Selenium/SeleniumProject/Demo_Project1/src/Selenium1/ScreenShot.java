package Selenium1;

import com.sun.deploy.cache.Cache;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class ScreenshotTest {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Cache FileUtils;
        FileUtils.copyFile(srcFile, new File("C:\\Users\\Richard\\Documents")); //Create a folder where ur poject is located and add the url
    }
}
