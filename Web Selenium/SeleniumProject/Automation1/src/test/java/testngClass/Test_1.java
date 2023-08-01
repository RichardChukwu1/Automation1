package testngClass;

import org.testng.annotations.*;

public class Test_1 {
    @Test
    public void doLogin() {
        System.out.println("Testing Login Screen");
    }

    @Test
    public void testFormFill() {
        System.out.println("Testing registration form");
    }

    @BeforeMethod
    public void openingBrowser() {
        System.out.println("Opening browser");
    }
    @BeforeTest
    public void openDBConnection() {
        System.out.println("Data opening");
    }
    @BeforeSuite
    public void runningSeleniumServer() {
        System.out.println("Starting selenium server");
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("Closing browser");
    }
    @AfterTest
    public void closedDBConnection() {
        System.out.println("Data close");
    }
    @AfterSuite
    public void closingSeleniumServer() {
        System.out.println("Closing Selenium Server");
    }
}
