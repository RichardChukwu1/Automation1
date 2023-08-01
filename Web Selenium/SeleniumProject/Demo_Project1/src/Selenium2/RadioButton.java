package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class RadioButton {

    public static void main(String[] args) {
        //open browser
        WebDriver driver = new FirefoxDriver();

        //navigate to site
        driver.get("ENTER WEB URL HERE");

        //driver.findElement(By.id("if you can find the id or if it's given by name change BY'id to By.name "));
        List<WebElement> radio = driver.findElements(By.name("preferred_color"));

        System.out.println(radio.get(0).getAttribute("value"));
        //When getting the radio button also consider indexing that's why I used 0
        System.out.println (radio.get(0).getDomAttribute("checked")); //checking whether the particular index is click.

        radio.get(0).click();// to click the radio button
        System.out.println(radio.get(0).getAttribute("checked"));//checking


    }
}
