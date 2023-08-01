package testcases;

import pages.LoginPage;

public class LoginTest extends base {

    @Test
    public void loginTest() {
        reports.startTest("Login Test");

        LoginPage lp = new loginPage(driver);
        //test step
        reports.log(logStatus.INFO, "enter the correct username and password");
        LoginPage lp = new LoginPage(driver);
        lap.checkingItemTap(); //this will help you check that your test actually logged in and passed.
        lp.doLogin("Richard Chukwu","richard_chukwu77@yahoo.com");
    }
}
