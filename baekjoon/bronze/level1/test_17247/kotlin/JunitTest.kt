package bronze.level1.test_17247.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            3 4
            1 0 0 0
            0 0 0 0
            0 0 0 1
        """.trimIndent()
        val expectedOutput = "5"

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
