
/**

 * Created by DNS on 23.02.2016.
 */
public class Matrix2x2 {
    public double[][] a;

    public Matrix2x2() {

    }

    public Matrix2x2(double[][] a) {
       this.a = a;
    }


    public Matrix2x2 add(Matrix2x2 Matrix){
        int n = 2;
        int i;
        int j;
        double[][] a = {{1,1},{1,1}};
        Matrix2x2 b = new Matrix2x2(a);
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                b.a[i][j] = this.a[i][j] + Matrix.a[i][j];
            }
        }
        return b;
    }

    public Matrix2x2 sub(Matrix2x2 Matrix) {
        int n = 2;
        int i;
        int j;
        double[][] a = {{0,0},{0,0}};
        Matrix2x2 b = new Matrix2x2(a);
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                b.a[i][j] = this.a[i][j] - Matrix.a[i][j];
            }
        }
        return b;
    }

    public Matrix2x2 multNumber(double k) {
        int n = 2;
        int i;
        int j;
        Matrix2x2 b = new Matrix2x2();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                b.a[i][j] = this.a[i][j] * k;
            }
        }
        return b;
    }

    public Matrix2x2 mult(Matrix2x2 Matrix) {
        int n = 2;
        int i;
        int j;
        int k;
        Matrix2x2 b = new Matrix2x2();
        for (i = 0; i < this.a.length; i++) {
            for (j = 0; j < Matrix.a[0].length; j++) {
                for (k = 0; k < Matrix.a.length; k++) {
                    b.a[i][j] = this.a[i][k] * Matrix.a[k][j];
                }
            }
        }
        return b;
    }

    public double det() {
        double det = a[0][0] * a[1][1] - a[1][0] * a[0][1];
        return det;
    }

    public Matrix2x2 transpon() {
        a[0][0] = this.a[0][0];
        a[0][1] = this.a[1][0];
        a[1][0] = this.a[0][1];
        a[1][1] = this.a[1][1];
        return this;
    }

    public Matrix2x2 inverseMatrix() {
        Matrix2x2 b = new Matrix2x2();
        b.a[0][0] = this.a[1][1];
        b.a[0][1] = this.a[1][0];
        b.a[1][0] = this.a[0][1];
        b.a[1][1] = this.a[0][0];
        double det = a[0][0] * a[1][1] - a[1][0] * a[0][1];
        b.a[0][0] = this.a[0][0] / det;
        b.a[0][1] = this.a[1][0] / det;
        b.a[1][0] = this.a[0][1] / det;
        b.a[1][1] = this.a[1][1] / det;
        return b;


    }

}


