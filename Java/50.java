/**
 * @no 50
 * @name Pow(x, n)
 */
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1.f / x;
        }
        if (Math.abs(n) % 2 == 0) {
            double result = myPow(x, n / 2);
            return result * result;
        } else {
            if (n > 0) {
                double temp = myPow(x, n - 1);
                return temp * x;
            } else {
                double temp = myPow(x, n + 1);
                return 1.f * temp / x;
            }
        }
    }
}