package pages;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactor.initElements(driver,this);
    }
    /*Object that belong to this page*/

         By Signup/Login =By.xpath.click("<a href="/login"><i class="fa fa-lock"></i> Signup / Login</a>")
          By Name =.id("Name");
          By EmailAddress =By.xpath("Email")

    public void dologin(String myName) {
        driver.findElement(Signup / login) {
            driver.findElement("Name").sendKeys(myName)
            driver.findElement(Email Address)

        }
    }
}