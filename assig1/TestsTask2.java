
package assig1;
import assig1.TaxCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestsTask2 {
    @Test
    public void testPathT1() {
        double[] incomeList = {50000, 10000};
        int[] childAgeList = {2, 4, 6};
        double v = (50000 + 10000) * 0.2 - (3 * 4000);
        double expected = v;
        assertEquals(expected, TaxCalculator.computeTax(incomeList, childAgeList), 0.01);
    }

    @Test
    public void testPathT2() {
        double[] incomeList = {-1};
        int[] childAgeList = {2, 4, 6};
        double expected = -1;
        assertEquals(expected, TaxCalculator.computeTax(incomeList, childAgeList), 0.01);
    }

    @Test
    public void testPathT3() {
        double[] incomeList = {50000};
        int[] childAgeList = {2, 4, 6, 8};
        double expected = (50000 + 10000) * 0.2 - (3 * 4000);
        assertEquals(expected, TaxCalculator.computeTax(incomeList, childAgeList), 0.01);
    }

    @Test
    public void testPathT4() {
        double[] incomeList = {-1};
        int[] childAgeList = {2, 4, 6};
        double expected = -1;
        assertEquals(expected, TaxCalculator.computeTax(incomeList, childAgeList), 0.01);
    }

}
