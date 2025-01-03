package silver.level2.test_6603.v3;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            7 1 2 3 4 5 6 7
            8 1 2 3 5 8 13 21 34
            0
            """;
        String expectedOutput = """
            1 2 3 4 5 6
            1 2 3 4 5 7
            1 2 3 4 6 7
            1 2 3 5 6 7
            1 2 4 5 6 7
            1 3 4 5 6 7
            2 3 4 5 6 7

            1 2 3 5 8 13
            1 2 3 5 8 21
            1 2 3 5 8 34
            1 2 3 5 13 21
            1 2 3 5 13 34
            1 2 3 5 21 34
            1 2 3 8 13 21
            1 2 3 8 13 34
            1 2 3 8 21 34
            1 2 3 13 21 34
            1 2 5 8 13 21
            1 2 5 8 13 34
            1 2 5 8 21 34
            1 2 5 13 21 34
            1 2 8 13 21 34
            1 3 5 8 13 21
            1 3 5 8 13 34
            1 3 5 8 21 34
            1 3 5 13 21 34
            1 3 8 13 21 34
            1 5 8 13 21 34
            2 3 5 8 13 21
            2 3 5 8 13 34
            2 3 5 8 21 34
            2 3 5 13 21 34
            2 3 8 13 21 34
            2 5 8 13 21 34
            3 5 8 13 21 34
            
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
