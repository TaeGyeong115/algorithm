package silver.level1.test_1991.v2;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            7
            A B C
            B D .
            C E F
            E . .
            F . G
            D . .
            G . .
            """;
        String expectedOutput = """
            ABDCEFG
            DBAECFG
            DBEGFCA
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
