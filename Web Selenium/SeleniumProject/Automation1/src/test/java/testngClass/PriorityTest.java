package testngClass;

import org.testng.annotations.Test;

public class PriorityTest {
    @Test(priority = 1)

    public void testOne() {
        System.out.println("executing the one");
    }
    @Test(priority = 2)
    public void testTwo() {
        System.out.println("executing the Two");
    }
    @Test(priority = 4)
    public void testThree() {
        System.out.println("executing the three");
    }
    @Test(priority = 3)
    public void testFour() {
        System.out.println("executing the four");

    }
}
