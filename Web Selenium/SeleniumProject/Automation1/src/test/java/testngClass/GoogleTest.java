package testngClass;

import org.junit.Assert;
import org.junit.rules.ErrorCollector;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void validateGoogleTitle() {
        System.out.println("Starting");
        String expectedResult ="Google.com";
        String actualResult ="Yahoo.com";

        try {
            Assert.assertEquals(expectedResult, actualResult);
        }catch (Throwable t) {
            System.out.println("Error Occurred");
            //ErrorCollector.addVerificationFailure(t);

        }

        System.out.println("Ending");
    }
}
