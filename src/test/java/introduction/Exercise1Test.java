package chapter1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;

import static org.junit.Assert.*;

public class Exercise1Test {

    Exercise1 exercise1 = new Exercise1();

    @Test
    public void problem1Test() {
        assertEquals("  1.473", exercise1.problem1(1.4732));
        assertEquals("12345678.000", exercise1.problem1(12345678));
    }

    @Test
    public void problem2Test() {
        assertEquals("3.14", exercise1.problem2(2));
        assertEquals("3.1415", exercise1.problem2(4));
    }

    @Test
    public void problem3Test() {
        assertEquals("Monday", exercise1.problem3(2010, Calendar.AUGUST, Calendar.MONDAY));
    }

    @Test
    public void problem4Test() {
        System.out.println(Arrays.toString(exercise1.problem4(new int[] {4, 1, 9, 9, 9, 2, 7, 4, 7, 1})));
        assertArrayEquals(new int[]{1, 2, 4, 7, 9}, exercise1.problem4(new int[] {4, 1, 9, 9, 9, 2, 7, 4, 7, 1}));
    }
}