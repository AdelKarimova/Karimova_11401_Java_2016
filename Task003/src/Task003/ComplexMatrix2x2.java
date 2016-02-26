/**
 * Created by DNS on 23.02.2016.
 */
public class ComplexMatrix2x2 {
    private ComplexNumber a[][];

    public ComplexMatrix2x2() {

    }

    public ComplexNumber getComplexNumber(int i, int j) {
        return this.a[i][j];
    }

    public ComplexMatrix2x2(ComplexNumber x) {
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                this.a[i][j] = x;
            }
        }

    }

    public ComplexMatrix2x2(ComplexNumber a00, ComplexNumber a01, ComplexNumber a10, ComplexNumber a11) {
        a00 = this.a[0][0];
        a01 = this.a[0][1];
        a10 = this.a[1][0];
        a11 = this.a[1][1];
    }

    public ComplexMatrix2x2 add(ComplexMatrix2x2 complexMatrix) {
        int n = 2;
        int i;
        int j;
        ComplexMatrix2x2 b = new ComplexMatrix2x2();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                b.a[i][j] = this.a[i][j].add(complexMatrix.a[i][j]);
            }
        }
        return b;
    }

    public ComplexMatrix2x2 mult(ComplexMatrix2x2 complexMatrix) {
        int n = 2;
        int i;
        int j;
        int k;
        ComplexMatrix2x2 b = new ComplexMatrix2x2();
        for (i = 0; i < this.a.length; i++) {
            for (j = 0; j < complexMatrix.a[0].length; j++) {
                for (k = 0; k < complexMatrix.a.length; k++) {
                    b.a[i][j] = this.a[i][k].mul(complexMatrix.a[k][j]);
                }
            }
        }
        return b;
    }

    public ComplexNumber det() {
        ComplexNumber det = this.a[0][0].mul(this.a[1][1]).div(this.a[1][0].mul(this.a[0][1]));
        return det;
    }
}


