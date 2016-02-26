/**
 * Created by DNS on 23.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        double[][] a = {{1,1},{1,1}};
        Matrix2x2 m1 = new Matrix2x2(a);
        Matrix2x2 m2 = new Matrix2x2(a);
        System.out.println(m1);
        System.out.println(m1.sub(m2));

    }
}
