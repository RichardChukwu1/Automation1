package testngClass;

import org.testng.annotations.Test;

public class DependOnMethodTest {
    @Test
    public void doLogin() {
        System.out.println("Login Successfully");
    }
    @Test
    public void logOut() {
        System.out.println("Logout Successfully");
    }
    @Test
    public void fillForm() {
        System.out.println("filling form");
    }
}
