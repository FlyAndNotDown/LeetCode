/**
 * @no 8
 * @name String to Integer
 */
class Solution {
public:
    int myAtoi(string input) {
        int start = false;
        char symbol = '+';
        int canUseSymbol = true;
        int ans = 0;
        for (auto i : input) {
            if (!start) {
                if (i == ' ') continue;
                else start = true;
            }
            switch (i) {
                case '+':
                    if (canUseSymbol) canUseSymbol = false;
                    else return symbol == '+' ? ans : 0 - ans;
                    break;
                case '-':
                    if (canUseSymbol) {
                        canUseSymbol = false;
                        symbol = '-';
                    }
                    else return symbol == '+' ? ans : 0 - ans;
                    break;
                default:
                    if (canUseSymbol) canUseSymbol = false;
                    if (i >= '0' && i <= '9') {
                        int single = i - '0';
                        long long int tmp = (long long int) ans * 10 + single;
                        tmp = symbol == '+' ? tmp : 0 - tmp;
                        if (tmp > INT32_MAX)
                            return INT32_MAX;
                        if (tmp < INT32_MIN)
                            return INT32_MIN;
                        ans = ans * 10 + single;
                    } else {
                        return symbol == '+' ? ans : 0 - ans;
                    }
                    break;
            }
        }
        return symbol == '+' ? ans : 0 - ans;
    }
};
