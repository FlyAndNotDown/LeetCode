/**
 * @no 376
 * @name Number Complement
 */
class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder resultBuilder = new StringBuilder();
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                resultBuilder.append('0');
            } else {
                resultBuilder.append('1');
            }
        }
        return Integer.parseInt(resultBuilder.toString(), 2);
    }
}