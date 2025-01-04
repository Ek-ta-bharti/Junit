package org.example.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalculatorServiceTest {

    // Rule to check for exceptions
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // @BeforeClass runs once before all tests (must be static)
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Before all tests");
        System.out.println("Test started at: " + new Date());
    }

    // @AfterClass runs once after all tests (must be static)
    @AfterClass
    public static void afterAllTests() {
        System.out.println("After all tests");
        System.out.println("Test ended at: " + new Date());
    }

    // @Before runs before each test
    @Before
    public void beforeEachTest() {
        System.out.println("Before each test");
        System.out.println("Test started at: " + new Date());
    }

    // @After runs after each test
    @After
    public void afterEachTest() {
        System.out.println("After each test");
        System.out.println("Test ended at: " + new Date());
    }

    // @Test is used to mark test methods
    @Test
    public void addTest() {
        System.out.println("Running addTest");
        int result = calculatorService.add(5, 3);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void subtractTest() {
        System.out.println("Running subtractTest");
        int result = calculatorService.subtract(10, 4);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void multiplyTest() {
        System.out.println("Running multiplyTest");
        int result = calculatorService.multiply(3, 4);
        int expected = 12;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumAnyNumbersTest() {
        System.out.println("Running sumAnyNumbersTest");
        int result = calculatorService.SumAnyNumbers(1, 2, 3, 4, 5);
        int expected = 15; // Sum of 1 + 2 + 3 + 4 + 5
        Assert.assertEquals(expected, result);
    }

    // @Ignore skips this test from running
    @Ignore("This test is temporarily disabled.")
    @Test
    public void ignoredTest() {
        System.out.println("This test should be ignored.");
    }

    // @Test with expected exception
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        System.out.println("Running testDivisionByZero");
        int result = 1 / 0; // This will throw ArithmeticException
    }

    // @Test with timeout
    @Test(timeout = 1000)  // Timeout in milliseconds
    public void testPerformance() throws InterruptedException {
        System.out.println("Running testPerformance");
        Thread.sleep(500);  // Simulate some work
    }

    // @Category is used to categorize tests
    @Category(SlowTests.class)
    @Test
    public void slowTest() {
        System.out.println("Running slowTest");
    }

    // Custom runner for tests (Here, it uses the default BlockJUnit4ClassRunner)
    @RunWith(BlockJUnit4ClassRunner.class)
    public static class SlowTests {
        // This is a marker interface used for categorizing tests
    }
}

//package org.example.services;
//
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//
//    @Test
//    public void addTwoNumbersTest() {
//        // Test the add method in CalculatorService
//        System.out.println("addTwoNumbersTest");
//        int result = calculatorService.add(2, 8);
//        int expected = 10;
//
//        Assert.assertEquals(expected, result);
//    }
//
//    @Test
//    public void sumAnyNumberTest() {
//        // Test the SumAnyNumbers method in CalculatorService
//        System.out.println("sumAnyNumberTest");
//        int result = calculatorService.SumAnyNumbers(2, 7, 8, 9);
//        int expected = 26; // Correct sum of 2 + 7 + 8 + 9
//
//        Assert.assertEquals(expected, result);
//    }
//
//    @BeforeClass
//    public static void init() {
//        System.out.println("Before all test cases");
//        System.out.println("Test started at: " + new Date());
//    }
//
//    @AfterClass
//    public static void end() {
//        System.out.println("After all test cases");
//        System.out.println("Test ended at: " + new Date());
//    }
//
//    @Before
//    public void beforeEach() {
//        System.out.println("Before each test case");
//        System.out.println("Test started at: " + new Date());
//    }
//
//    @After
//    public void cleanup() {
//        System.out.println("After each test case");
//        System.out.println("Test cleaned up at: " + new Date());
//    }
//}