package browsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {
Public static WebDriver driver = null;
    //setting up testeng report
    static final ExtendReports reports = ExtendReports.get(base.class);
    @BeforeTest
    public void setup() throws IOException {
        reports.init(System.getProperty(("user.dir")+"/Users/richardchukwu/Desktop/Web Selenium/SeleniumProject/AutomationExercise/src/main/java/report/AutomationExerciseReport.html",true));

        //* property extention - to access with the help of propeties class*//

        Properties p = new Properties();

        FileInputStream fi = new FileInputStream("/Users/richardchukwu/Desktop/Web Selenium/SeleniumProject/AutomationExercise/src/main/java/browsers/global.properties");
        p.load(fi);

        if (p.getProperty("browser").contains("firefoxDriver")) {
            Webdriver = new FirefoxDriver();
        }else  if(p.getProperty("browser").contains("chrome")) {
            System.setProperties("web-driver.chrome.driver","value");
            driver = new ChromeDriver();
        }else {
            driver = new InternetExplorerDriver();

        }

        driver.get(p.getProperty(url));  //here you declared the url
        driver.manage().timeouts().implicitlywait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}