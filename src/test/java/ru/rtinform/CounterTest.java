package ru.rtinform;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void countElements1() {

        int[] dataToCount = {1, 3, 4, 5, 1, 5, 4};

        Map<Integer, Integer> expectedResult = new HashMap<>();
        expectedResult.put(1, 2);
        expectedResult.put(3, 1);
        expectedResult.put(4, 2);
        expectedResult.put(5, 2);

        Counter counter = new Counter();
        Map<Integer, Integer> result = counter.countElements(dataToCount);

        assertEquals(expectedResult, result);

    }

    @Test
    public void countElements2() {

        int[] dataToCount = {};

        Map<Integer, Integer> expectedResult = new HashMap<>();

        Counter counter = new Counter();
        Map<Integer, Integer> result = counter.countElements(dataToCount);

        assertEquals(expectedResult, result);

    }

    @Test
    public void countElements3() {

        int[] dataToCount = {1, 1, 1, 1, 1, 1};

        Map<Integer, Integer> expectedResult = new HashMap<>();
        expectedResult.put(1, 6);

        Counter counter = new Counter();
        Map<Integer, Integer> result = counter.countElements(dataToCount);

        assertEquals(expectedResult, result);

    }

    @Test
    public void countElements4() {

        int[] dataToCount = {1, 2, 3, 4, 5, 1, 3, 5};

        Map<Integer, Integer> expectedResult = new HashMap<>();
        expectedResult.put(1, 2);
        expectedResult.put(2, 1);
        expectedResult.put(3, 2);
        expectedResult.put(4, 1);
        expectedResult.put(5, 2);

        Counter counter = new Counter();
        Map<Integer, Integer> result = counter.countElements(dataToCount);

        assertEquals(expectedResult, result);

    }

    @Test
    public void countElements5() {

        List<Integer> dataToCount = List.of(1, 2, 3, 4, 5, 1, 3, 5);

        Map<Integer, Integer> expectedResult = new HashMap<>();
        expectedResult.put(1, 2);
        expectedResult.put(2, 1);
        expectedResult.put(3, 2);
        expectedResult.put(4, 1);
        expectedResult.put(5, 2);

        Counter counter = new Counter();
        Map<Integer, Integer> result = counter.countElements(dataToCount);

        assertEquals(expectedResult, result);

    }
}