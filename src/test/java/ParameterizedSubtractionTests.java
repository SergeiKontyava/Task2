import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedSubtractionTests {
    private int FirstNumber;
    private int SecondNumber;
    private int Result;

    public ParameterizedSubtractionTests(int firstNumber, int secondNumber, int result){
        this.FirstNumber = firstNumber;
        this.SecondNumber = secondNumber;
        this.Result = result;
    }

    @Test
    public void subtractionSetShouldBeCorrectTest(){
        Mathematics testClass = new Mathematics();
        testClass.setResult(1);
        testClass.deduct(FirstNumber, SecondNumber);
        assertEquals(Result, testClass.getResult());
        System.out.println("Test with: " + FirstNumber + " and " + SecondNumber  + " should be "+ Result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> numbersForSubtraction(){
        return Arrays.asList(new Object[][]{
                {1, 3, -2},
                {2, 3, -1},
                {5, 3, 2},
                {1, -3, 4}
        });
    }
}