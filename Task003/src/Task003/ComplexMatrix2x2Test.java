import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;

import java.lang.reflect.Method;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by DNS on 23.02.2016.
 */
public class ComplexMatrix2x2Test {
    private static ComplexMatrix2x2 nullMatrix;
    private static ComplexMatrix2x2 matrixOnOneValue;
    private static ComplexMatrix2x2 fullMatrix;

    @Before
    public void matrixCreation() {
        nullMatrix = new ComplexMatrix2x2();
        matrixOnOneValue = new ComplexMatrix2x2(new ComplexNumber(1, 1));
        fullMatrix = new ComplexMatrix2x2(new ComplexNumber(2, 3), new ComplexNumber(4, 1), new ComplexNumber(2, 5), new ComplexNumber(1, 2));
    }

    @Test
    public void nullMatrixShouldBeNull() {
        ComplexNumber number = mock(ComplexNumber.class);
        when(number.getRe()).thenReturn(0.0);
        when(number.getIm()).thenReturn(0.0);
        when(number.equals(anyObject())).thenCallRealMethod();
        Assert.assertTrue(nullMatrix.getComplexNumber(0, 0).equals(number) && nullMatrix.getComplexNumber(0, 1).equals(number) &&
                nullMatrix.getComplexNumber(1, 0).equals(number) && nullMatrix.getComplexNumber(1, 1).equals(number));
    }

    @Test
    public void constructorOnTheOneValueShouldBeCorrect() {
        ComplexNumber number1 = mock(ComplexNumber.class);
        when(number1.getRe()).thenReturn(1.0);
        when(number1.getIm()).thenReturn(1.0);
        when(number1.equals(anyObject())).thenCallRealMethod();
        Assert.assertTrue(matrixOnOneValue.getComplexNumber(0, 0).equals(number1) && matrixOnOneValue.getComplexNumber(0, 1).equals(number1) &&
                matrixOnOneValue.getComplexNumber(1, 0).equals(number1) && matrixOnOneValue.getComplexNumber(1, 1).equals(number1));
    }

    @Test
    public void constructorOfFullMatrixShouldBeCorrect() {
        ComplexNumber number1 = mock(ComplexNumber.class);
        when(number1.getRe()).thenReturn(2.0);
        when(number1.getIm()).thenReturn(3.0);
        when(number1.equals(anyObject())).thenCallRealMethod();
        ComplexNumber number2 = mock(ComplexNumber.class);
        when(number2.getRe()).thenReturn(4.0);
        when(number2.getIm()).thenReturn(1.0);
        when(number2.equals(anyObject())).thenCallRealMethod();
        ComplexNumber number3 = mock(ComplexNumber.class);
        when(number3.getRe()).thenReturn(2.0);
        when(number3.getIm()).thenReturn(5.0);
        when(number3.equals(anyObject())).thenCallRealMethod();
        ComplexNumber number4 = mock(ComplexNumber.class);
        when(number4.getRe()).thenReturn(1.0);
        when(number4.getIm()).thenReturn(2.0);
        when(number4.equals(anyObject())).thenCallRealMethod();
        Assert.assertTrue(fullMatrix.getComplexNumber(0, 0).equals(number1) && fullMatrix.getComplexNumber(0, 1).equals(number2) &&
                fullMatrix.getComplexNumber(1, 0).equals(number3) && fullMatrix.getComplexNumber(1, 1).equals(number4));
    }

    @Test
    public void complexMatrixMethodAddShouldBeCorrectOnMock(){
        ComplexMatrix2x2 result = fullMatrix.add(fullMatrix);
        ComplexNumber number1 = mock(ComplexNumber.class);
        when(number1.getRe()).thenReturn(4.0);
        when(number1.getIm()).thenReturn(6.0);
        when(number1.equals(anyObject())).thenCallRealMethod();
        ComplexNumber number2 = mock(ComplexNumber.class);
        when(number2.getRe()).thenReturn(8.0);
        when(number2.getIm()).thenReturn(2.0);
        when(number2.equals(anyObject())).thenCallRealMethod();
        ComplexNumber number3 = mock(ComplexNumber.class);
        when(number3.getRe()).thenReturn(4.0);
        when(number3.getIm()).thenReturn(10.0);
        when(number3.equals(anyObject())).thenCallRealMethod();
        ComplexNumber number4 = mock(ComplexNumber.class);
        when(number4.getRe()).thenReturn(2.0);
        when(number4.getIm()).thenReturn(4.0);
        when(number4.equals(anyObject())).thenCallRealMethod();
        Assert.assertTrue(result.getComplexNumber(0, 0).equals(number1) && result.getComplexNumber(0, 1).equals(number2) &&
                result.getComplexNumber(1, 0).equals(number3) && result.getComplexNumber(1, 1).equals(number4));
    }

    @Test
    public void complexMatrixMethodMultShouldBeCorrectOnMock(){
        ComplexMatrix2x2 result = matrixOnOneValue.mult(fullMatrix);
        ComplexNumber number1 = mock(ComplexNumber.class);
        when(number1.getRe()).thenReturn(-4.0);
        when(number1.getIm()).thenReturn(12.0);
        when(number1.equals(anyObject())).thenCallRealMethod();
        ComplexNumber number2 = mock(ComplexNumber.class);
        when(number2.getRe()).thenReturn(2.0);
        when(number2.getIm()).thenReturn(8.0);
        when(number2.equals(anyObject())).thenCallRealMethod();
        ComplexNumber number3 = mock(ComplexNumber.class);
        when(number3.getRe()).thenReturn(-4.0);
        when(number3.getIm()).thenReturn(12.0);
        when(number3.equals(anyObject())).thenCallRealMethod();
        ComplexNumber number4 = mock(ComplexNumber.class);
        when(number4.getRe()).thenReturn(2.0);
        when(number4.getIm()).thenReturn(8.0);
        when(number4.equals(anyObject())).thenCallRealMethod();
        Assert.assertTrue(result.getComplexNumber(0, 0).equals(number1) && result.getComplexNumber(0, 1).equals(number2) &&
                result.getComplexNumber(1, 0).equals(number3) && result.getComplexNumber(1, 1).equals(number4));
    }

    @Test
    public void complexMatrixShouldHaveMethodDet(){
        try {
            Method m = ComplexMatrix2x2.class.getMethod("det");
        } catch (NoSuchMethodException e) {
            Assert.fail(e.getMessage());
        }

    }

    @Test
    public void complexMatrixMethodDetShouldBeCorrect(){
        ComplexNumber number = mock(ComplexNumber.class);
        when(number.getRe()).thenReturn(-7.0);
        when(number.getIm()).thenReturn(-29.0);
        when(number.equals(anyObject())).thenCallRealMethod();
        Assert.assertTrue(fullMatrix.det().equals(number));

    }

}
