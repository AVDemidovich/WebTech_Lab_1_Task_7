/**
 * Created by Alexander_Demidovich on 10/8/2016.
 */

import Handler.Handler;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class JUnitTests {
    @Test
    public void ShellSort_RandomArray_trueReturned() {
        double[] actual = {13,4,6,81,23};
        double[] expected = {4,6,13,23,81};
        Handler.ShellSort(actual);
        assertArrayEquals(expected, actual,0.01);
    }
    @Test
    public void ShellSort_EmptyArray_EmptyArrReturned() {
        double[] actual = {};
        double[] expected = {};
        Handler.ShellSort(actual);
        assertArrayEquals(expected, actual,0.01);
    }
    @Test
    public void ShellSort_Null_EmptyArrReturned() {
        double[] actual = null;
        double[] expected = null;
        Handler.ShellSort(actual);
        assertArrayEquals(expected, actual,0.01);
    }
}

