package silver.level2.test_4358;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static util.ThrowingRunnable.runUnchecked;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String input = """
            Red Alder
            Ash
            Aspen
            Basswood
            Ash
            Beech
            Yellow Birch
            Ash
            Cherry
            Cottonwood
            Ash
            Cypress
            Red Elm
            Gum
            Hackberry
            White Oak
            Hickory
            Pecan
            Hard Maple
            White Oak
            Soft Maple
            Red Oak
            Red Oak
            White Oak
            Poplan
            Sassafras
            Sycamore
            Black Walnut
            Willow
            """;
        String expectedOutput = """
            Ash 13.7931
            Aspen 3.4483
            Basswood 3.4483
            Beech 3.4483
            Black Walnut 3.4483
            Cherry 3.4483
            Cottonwood 3.4483
            Cypress 3.4483
            Gum 3.4483
            Hackberry 3.4483
            Hard Maple 3.4483
            Hickory 3.4483
            Pecan 3.4483
            Poplan 3.4483
            Red Alder 3.4483
            Red Elm 3.4483
            Red Oak 6.8966
            Sassafras 3.4483
            Soft Maple 3.4483
            Sycamore 3.4483
            White Oak 10.3448
            Willow 3.4483
            Yellow Birch 3.4483
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
