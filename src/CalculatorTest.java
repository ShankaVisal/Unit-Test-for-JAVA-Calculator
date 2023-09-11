import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void tenSubtractFiveIsFive() {
        double num1 = 10.0;
        double num2 = 5.0;

        Calculator.subtract(num1, num2);

        String capturedOutput = outputStream.toString().trim();

        assertEquals("Result: 5.0", capturedOutput);
    }
    @Test
    public void sevenSubtractEighthIsMinusOne() {
        double num1 = 7.0;
        double num2 = 8.0;

        Calculator.subtract(num1, num2);

        String capturedOutput = outputStream.toString().trim();

        assertEquals("Result: -1.0", capturedOutput);
    }

    @Test
    public void sevenAddFiveIsTwelve() {
        double num1 = 7.0;
        double num2 = 5.0;

        Calculator.add(num1, num2);

        String capturedOutput = outputStream.toString().trim();

        assertEquals("Result: 12.0", capturedOutput);
    }

    @Test
    public void MinusSevenAddMinusSixIsMinusThirteen() {
        double num1 = -7.0;
        double num2 = -6.0;

        Calculator.add(num1, num2);

        String capturedOutput = outputStream.toString().trim();

        assertEquals("Result: -13.0", capturedOutput);
    }

    @Test
    public void twoMultiplyTwoIsFour() {
        double num1 = 2.0;
        double num2 = 2.0;

        Calculator.multiply(num1, num2);

        String capturedOutput = outputStream.toString().trim();

        assertEquals("Result: 4.0", capturedOutput);
    }

    @Test
    public void fiveMultiplyMinusThreeIsMinusFifteen() {
        double num1 = 5.0;
        double num2 = -3.0;

        Calculator.multiply(num1, num2);

        String capturedOutput = outputStream.toString().trim();

        assertEquals("Result: -15.0", capturedOutput);
    }

    @Test
    public void tenDivideTwoIsFive() {
        double num1 = 10.0;
        double num2 = 2.0;

        Calculator.divide(num1, num2);

        String capturedOutput = outputStream.toString().trim();

        assertEquals("Result: 5.0", capturedOutput);
    }

    @Test
    public void sevenDivideTwoIsThree() {
        double num1 = 7.0;
        double num2 = 2.0;

        Calculator.divide(num1, num2);

        String capturedOutput = outputStream.toString().trim();

        assertEquals("Result: 3.5", capturedOutput);
    }

}
