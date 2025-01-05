// package org.example.services;

// import org.junit.jupiter.api.*;
// import org.junit.jupiter.api.condition.DisabledIf;
// import org.junit.jupiter.api.condition.EnabledIf;

// import java.util.Date;

// import static org.junit.jupiter.api.Assertions.*;

// @TestInstance(TestInstance.Lifecycle.PER_CLASS)
// public class CalculatorServiceTest {

// private CalculatorService calculatorService;

// @BeforeAll
// void beforeAllTests() {
// System.out.println("Before all tests");
// System.out.println("Test started at: " + new Date());
// calculatorService = new CalculatorService(); // Initialize the service
// }

// @AfterAll
// void afterAllTests() {
// System.out.println("After all tests");
// System.out.println("Test ended at: " + new Date());
// }

// @BeforeEach
// void beforeEachTest() {
// System.out.println("Before each test");
// System.out.println("Test started at: " + new Date());
// }

// @AfterEach
// void afterEachTest() {
// System.out.println("After each test");
// System.out.println("Test ended at: " + new Date());
// }

// @Test
// void addTest() {
// System.out.println("Running addTest");
// int result = calculatorService.add(5, 3);
// int expected = 8;
// assertEquals(expected, result);
// }

// @Test
// void subtractTest() {
// System.out.println("Running subtractTest");
// int result = calculatorService.subtract(10, 4);
// int expected = 6;
// assertEquals(expected, result);
// }

// @Test
// void multiplyTest() {
// System.out.println("Running multiplyTest");
// int result = calculatorService.multiply(3, 4);
// int expected = 12;
// assertEquals(expected, result);
// }

// @Test
// void sumAnyNumbersTest() {
// System.out.println("Running sumAnyNumbersTest");
// int result = calculatorService.sumAnyNumbers(1, 2, 3, 4, 5);
// int expected = 15; // Sum of 1 + 2 + 3 + 4 + 5
// assertEquals(expected, result);
// }

// @Disabled("This test is temporarily disabled.")
// @Test
// void ignoredTest() {
// System.out.println("This test should be ignored.");
// }

// @Test
// void testDivisionByZero() {
// System.out.println("Running testDivisionByZero");
// assertThrows(ArithmeticException.class, () -> {
// int result = 1 / 0; // This will throw ArithmeticException
// });
// }

// @Test
// @Timeout(value = 1) // Timeout in seconds
// void testPerformance() throws InterruptedException {
// System.out.println("Running testPerformance");
// Thread.sleep(500); // Simulate some work
// }

// @Test
// @Tag("Slow")
// void slowTest() {
// System.out.println("Running slowTest");
// }

// @Test
// void addTwoNumbersTest() {
// System.out.println("Running addTwoNumbersTest");
// int result = calculatorService.add(2, 8);
// int expected = 10;
// assertEquals(expected, result);
// }

// @Test
// void sumAnyNumberTest() {
// System.out.println("Running sumAnyNumberTest");
// int result = calculatorService.sumAnyNumbers(2, 7, 8, 9);
// int expected = 26; // Sum of 2 + 7 + 8 + 9
// assertEquals(expected, result);
// }
// }
