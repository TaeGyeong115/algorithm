package silver.level5.test_4446;

import common.TestUtil;
import gold.test_10871.Main;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "Ita dotf ni dyca nsaw ecc.";
        String expectedOutput = """
            One ring to rule them all.
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }
}
