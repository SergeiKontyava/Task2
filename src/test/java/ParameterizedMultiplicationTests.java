import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedMultiplicationTests {
    private int FirstNumber;
    private int SecondNumber;
    private int Result;

    public ParameterizedMultiplicationTests(int firstNumber, int secondNumber, int result){
        this.FirstNumber = firstNumber;
        this.SecondNumber = secondNumber;
        this.Result = result;
    }

    @Test
    public void multiplicationSetShouldBeCorrectTest(){
        Mathematics testClass = new Mathematics();
        testClass.setResult(0);
        testClass.multiply(FirstNumber, SecondNumber);
        assertEquals(Result, testClass.getResult());
        System.out.println("Divide: " + FirstNumber + " and " + SecondNumber  + " should be "+ Result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> numbersForSubtraction(){
        return Arrays.asList(new Object[][]{
                {6, 2, 12},
                {12, 4, 48},
                {6, 1, 6},
                {14, 4, 56}
        });
    }
}
