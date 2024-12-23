package silver.level1.test_11660;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            4 3
            1 2 3 4
            2 3 4 5
            3 4 5 6
            4 5 6 7
            2 2 3 4
            3 4 3 4
            1 1 4 4
            """;
        String expectedOutput = """
            27
            6
            64
            """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_2() throws IOException {
        String input = """
            2 4
            1 2
            3 4
            1 1 1 1
            1 2 1 2
            2 1 2 1
            2 2 2 2
            """;
        String expectedOutput = """
            1
            2
            3
            4
            """;
        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
