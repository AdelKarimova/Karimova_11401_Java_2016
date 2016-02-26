import org.junit.Assert;
import org.junit.Test;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Method;

/**
 * Created by DNS on 23.02.2016.
 */
public class Matrix2x2Test {

    @Test
    public void matrixShouldHaveCorrectSum(){
        double[][] massive1 ={{1.0,1.0},{1.0,1.0}};
        double[][] massive2 = {{2.0,2.0},{2.0,2.0}};
        Matrix2x2 m1 = new Matrix2x2(massive1);
        Matrix2x2 m2 = new Matrix2x2(massive2);
        double[][] massive3 = {{3.0,3.0},{3.0,3.0}};
        Assert.assertEquals(new Matrix2x2(massive3),m2.add(m1));
    }

    @Test
    public void matrixShouldHaveCorrectSub(){
        double[][] massive1 ={{1.0,1.0},{1.0,1.0}};
        double[][] massive2 = {{2.0,2.0},{2.0,2.0}};
        Matrix2x2 m1 = new Matrix2x2(massive1);
        Matrix2x2 m2 = new Matrix2x2(massive2);
        double[][] massive3 = {{1.0,1.0},{1.0,1.0}};
        Assert.assertEquals(new Matrix2x2(massive3),m2.sub(m1));
    }

    @Test
    public void matrixMethodMultNumberShouldBeCorrect(){
        int number=3;
        double[][] massive2 = {{2,2},{2,2}};
        Matrix2x2 m2 = new Matrix2x2(massive2);
        double[][] massive3 = {{6,6},{6,6}};
        Assert.assertEquals(new Matrix2x2(massive3),m2.multNumber(number));
    }

    @Test
    public void matrixMethodMultShouldBeCorrect(){

        double[][] massive1 = {{1,2},{2,1}};
        double[][] massive2 = {{2,2},{2,2}};
        Matrix2x2 m1 = new Matrix2x2(massive1);
        Matrix2x2 m2 = new Matrix2x2(massive2);
        double[][] massive3 = {{6,6},{6,6}};
        Assert.assertEquals(new Matrix2x2(massive3),m2.mult(m1));
    }

    @Test
    public void matrixShouldHaveMethodDet() {
        try {
            Method m = Matrix2x2.class.getMethod("det");
        } catch (NoSuchMethodException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void matrixShouldHaveMethodInverseMatrix() {
        try {
            Method m = Matrix2x2.class.getMethod("inverseMatrix");
        } catch (NoSuchMethodException e) {
            Assert.fail(e.getMessage());
        }
    }
    @Test
    public void equalsShouldWorkCorrectOnDifMatrix(){
        double[][] m1 = {{1,1},{1,1}};
        double[][] m2 = {{2,1},{1,1}};
        Matrix2x2 v = new Matrix2x2(m1);
        Matrix2x2 u = new Matrix2x2(m2);
        Assert.assertFalse(v.equals(u));
    }

    @Test
    public void equalsShouldWorkCorrectOnSameMatrix(){
        double[][] m1 = {{1,1},{1,1}};
        double[][] m2 = {{1,1},{1,1}};
        Matrix2x2 matrix1 = new Matrix2x2(m1);
        Matrix2x2 matrix2 = new Matrix2x2(m2);
        Assert.assertTrue(matrix1.equals(matrix2));
    }

    @Test
    public void matrixShouldHaveCorrectDet(){
        double[][] m2 = {{2,1},{1,2}};
        Matrix2x2 matrix1 = new Matrix2x2(m2);
        Assert.assertEquals(0, matrix1.det(), 1e-9);
    }

    @Test
    public void matrixMethodTransponShouldBeCorrect(){
        double[][] a = {{1,1},{2,2}};
        Matrix2x2 m1 = new Matrix2x2(a);
        double[][] b = {{1,2},{1,2}};
        Assert.assertEquals(new Matrix2x2(b),m1.transpon());

    }

    @Test
    public void matrixMethodInverseShouldBeCorrect(){
        double[][] a = {{5,5},{3,5}};
        Matrix2x2 m1 = new Matrix2x2(a);
        double[][] b = {{0.5,-0.5},{-0.3,0.5}};
        Assert.assertEquals(new Matrix2x2(b),m1.inverseMatrix());

    }

    @Test
    public void matrixShouldHaveMethodTranspon() {
        try {
            Method m = Matrix2x2.class.getMethod("transpon");
        } catch (NoSuchMethodException e) {
            Assert.fail(e.getMessage());
        }
    }

}
