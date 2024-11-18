package isima.F2.CodeReview.benkhali;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AwesomePasswordCheckerTest {

    @Test
    void testMaskAff() {
        AwesomePasswordChecker checker;

        String dummyData = "1.0;2.0;3.0\n4.0;5.0;6.0";
        try {
            checker = new AwesomePasswordChecker(
                    new ByteArrayInputStream(dummyData.getBytes(StandardCharsets.UTF_8))
            );
        } catch (IOException e) {
            fail("Initialization failed due to IOException");
            return;
        }

        // Test case 1: Simple password
        String password = "password";
        int[] expectedMask = {2, 1, 1, 1, 2, 1, 1, 2};
        assertArrayEquals(expectedMask, checker.maskAff(password));

        // Test case 2: Mixed characters
        password = "Pass123!@";
        int[] expectedMask2 = {4, 1, 1, 1, 5, 5, 5, 6, 6};
        assertArrayEquals(expectedMask2, checker.maskAff(password));
    }

    void tesComputeMD5(){
        String input = "test";
        String expectedHash = "098f6bcd4621d373cade4e832627b4f6";
        assertEquals(expectedHash, AwesomePasswordChecker.ComputeMD5(input));
    }
}
