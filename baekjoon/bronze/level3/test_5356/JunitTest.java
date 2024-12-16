package bronze.level3.test_5356;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                3
                5 A
                3 Z
                4 C
                """;
        String expectedOutput = """
                A
                BB
                CCC
                DDDD
                EEEEE

                Z
                AA
                BBB

                C
                DD
                EEE
                FFFF
                
                """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
