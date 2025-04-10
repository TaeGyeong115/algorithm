package gold.level4.test_2448;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = "24";
        String expectedOutput = """
                                   *                      \s
                                  * *                     \s
                                 *****                    \s
                                *     *                   \s
                               * *   * *                  \s
                              ***** *****                 \s
                             *           *                \s
                            * *         * *               \s
                           *****       *****              \s
                          *     *     *     *             \s
                         * *   * *   * *   * *            \s
                        ***** ***** ***** *****           \s
                       *                       *          \s
                      * *                     * *         \s
                     *****                   *****        \s
                    *     *                 *     *       \s
                   * *   * *               * *   * *      \s
                  ***** *****             ***** *****     \s
                 *           *           *           *    \s
                * *         * *         * *         * *   \s
               *****       *****       *****       *****  \s
              *     *     *     *     *     *     *     * \s
             * *   * *   * *   * *   * *   * *   * *   * *\s
            ***** ***** ***** ***** ***** ***** ***** *****
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
