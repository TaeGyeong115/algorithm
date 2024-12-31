package bronze.level1.test_2775.kotlin;

import junit.framework.TestCase.assertEquals
import org.junit.Test
import util.TestUtil

class JunitTest {

    @Test
    fun test1() {
        val input = """
            2
            1
            3
            2
            3
        """.trimIndent()
        val expectedOutput = """
            6
            10
            
        """.trimIndent()

        val actualOutput = TestUtil.executeTest(input) { main() }
        assertEquals(expectedOutput, actualOutput)
    }

}
