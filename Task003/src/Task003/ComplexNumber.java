/**
 * Created by DNS on 23.02.2016.
 */
public class ComplexNumber {
        private double Re;
        private double Im;


        public ComplexNumber(double Re, double Im) {
            this.Re = Re;
            this.Im = Im;
        }

        public ComplexNumber(){
            this(0,0);
        }

        public double getRe() {
            return Re;
        }

        public double getIm() {
            return Im;
        }

        public void setRe(double Re) {
            this.Re = Re;

        }

        public void setIm(double Im) {
            this.Im = Im;

        }
        public ComplexNumber add(ComplexNumber ComNumb) {
            ComplexNumber ComNumbRes = new ComplexNumber();
            ComNumbRes.Re = this.Re + ComNumb.getRe();
            ComNumbRes.Im = this.Im + ComNumb.getIm();
            return ComNumbRes;


        }

        public void add2(ComplexNumber ComNumb) {
            this.Re = this.Re + ComNumb.getRe();
            this.Im = this.Im + ComNumb.getIm();
            if (this.Im > 0) {
                System.out.println("add2 =" + Re + " + " + Im + "*i");
            } else {
                System.out.println("add2 =" + Re + " " + Im + "*i");
            }
        }
        public ComplexNumber sub(ComplexNumber ComNumb) {
            ComplexNumber ComNumbRes = new ComplexNumber();
            ComNumbRes.Re = this.Re - ComNumb.getRe();
            ComNumbRes.Im = this.Im - ComNumb.getIm();
            return ComNumbRes;
        }


        public void sub2(ComplexNumber ComNumb) {
            this.Re = this.Re - ComNumb.getRe();
            this.Im = this.Im - ComNumb.getIm();
            if (this.Im > 0) {
                System.out.println("sub2 =" + Re + " + " + Im + "*i");
            } else {
                System.out.println("sub2 =" + Re + " " + Im + "*i");

            }
        }
        public ComplexNumber mul(ComplexNumber ComNumb) {
            ComplexNumber ComNumbRes = new ComplexNumber();
            ComNumbRes.Re = this.Re * ComNumb.getRe() - this.Im * ComNumb.getIm();
            ComNumbRes.Im = this.Re * ComNumb.getIm() + this.Im * ComNumb.getRe();
            return ComNumbRes;
        }

        public void mul2(ComplexNumber ComNumb) {
            this.Re = this.Re * ComNumb.getRe() - this.Im * ComNumb.getIm();
            this.Im = this.Re * ComNumb.getIm() + this.Im * ComNumb.getRe();
            if(this.Im>0) {
                System.out.println("mul2 =" + Re + " + " + Im + "*i");
            }else{
                System.out.println("mul2 =" + Re + " " + Im + "*i");
            }
        }

        public ComplexNumber mulNumber(double numb) {
            ComplexNumber ComNumbRes = new ComplexNumber();
            ComNumbRes.Re = this.Re*numb;
            ComNumbRes.Im = this.Im*numb;
            return ComNumbRes;
        }

        public void mulNumber2(double numb){
            this.Re = this.Re*numb;
            this.Im = this.Im*numb;
            if(this.Im>0) {
                System.out.println("mulNumber2 =" + Re + " + " + Im + "*i");
            }else{
                System.out.println("mulNumber2 =" + Re + " " + Im + "*i");
            }

        }
        public ComplexNumber div(ComplexNumber ComNumb) {
            ComplexNumber ComNumbRes = new ComplexNumber();
            ComNumbRes.Re = this.Re * ComNumb.getRe() - this.Im * ComNumb.getIm();
            ComNumbRes.Im = this.Re * ComNumb.getIm() + this.Im * ComNumb.getRe();
            return ComNumbRes;
        }

        public void div2(ComplexNumber ComNumb) {
            this.Re = this.Re/ComNumb.getRe()+this.Im/ComNumb.getIm();
            this.Im = this.Re/ComNumb.getIm()+this.Im/ComNumb.getRe();
            if(this.Im>0) {
                System.out.println("div2 =" + Re + " + " + Im + "*i");
            }else{
                System.out.println("div2 =" + Re + " " + Im + "*i");
            }

        }
        public double length(){
            double length = Math.pow((Re*Re+Im*Im), 0.5);
            System.out.println("length ="+length);
            return length;

        }

        public double arg(){
            double arg = Math.atan(Im/Re);
            System.out.println("arg = ");
            return arg;
        }

        public String toString(){
            String str;
            if(this.Im>0) {
                str = this.Re + "+" + this.Im;
            }else{
                str = this.Re + " " + this.Im;
            }
            System.out.println("str = "+str);
            return str;
        }
        public boolean equals(ComplexNumber ComNumb){
            boolean eq;
            if (this.Re == ComNumb.Re && this.Im == ComNumb.Im) {
                eq = true;
            }else{
                eq = false;
            }
            return eq;
        }


}
