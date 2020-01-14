/**
 * @no 537
 * @name Complex Number Multiplication
 */
class Solution {
    private static class Complex {
        public int real;
        public int imag;

        public Complex(int real, int imag) {
            this.real = real;
            this.imag = imag;
        }

        public static Complex parseComplex(String number) {
            int indexOfAdditionSymbol = number.indexOf('+');
            int indexOfI = number.indexOf('i');
            return new Complex(
                Integer.parseInt(number.substring(0, indexOfAdditionSymbol)),
                Integer.parseInt(number.substring(indexOfAdditionSymbol + 1, indexOfI))
            );
        }

        public Complex multiply(Complex another) {
            return new Complex(
                this.real * another.real - this.imag * another.imag,
                this.real * another.imag + this.imag * another.real
            );
        }

        @Override
        public String toString() {
            return String.format("%d+%di", this.real, this.imag);
        }
    }

    public static String complexNumberMultiply(String a, String b) {
        Complex complexA = Complex.parseComplex(a);
        Complex complexB = Complex.parseComplex(b);
        return complexA.multiply(complexB).toString();
    }
}