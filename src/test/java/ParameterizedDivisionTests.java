import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedDivisionTests {

    private int FirstNumber;
    private int SecondNumber;
    private int Result;

    public ParameterizedDivisionTests(int firstNumber, int secondNumber, int result){
        this.FirstNumber = firstNumber;
        this.SecondNumber = secondNumber;
        this.Result = result;
    }

    @Test
    public void divisionSetShouldBeCorrectTest(){
        Mathematics testClass = new Mathematics();
        testClass.setResult(0);
        testClass.divide(FirstNumber, SecondNumber);
        assertEquals(Result, testClass.getResult());
        System.out.println("Divide: " + FirstNumber + " and " + SecondNumber  + " should be "+ Result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> numbersForSubtraction(){
        return Arrays.asList(new Object[][]{
                {6, 2, 3},
                {12, 4, 3},
                {6, 1, 6},
                {14, 7, 2}
        });
    }
}
