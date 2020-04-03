/**
 * @no 150
 * @name Evaluate Reverse Polish Notation
 */
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            char firstChar = token.charAt(0);
            int opNumber1 = 0;
            int opNumber2 = 0;
            if (token.length() == 1 && (
                firstChar == '+' || firstChar == '-' ||
                firstChar == '*' || firstChar == '/')) {
                opNumber2 = stack.pop();
                opNumber1 = stack.pop();
                switch (firstChar) {
                    case '+':
                        stack.push(opNumber1 + opNumber2);
                        break;
                    case '-':
                        stack.push(opNumber1 - opNumber2);
                        break;
                    case '*':
                        stack.push(opNumber1 * opNumber2);
                        break;
                    case '/':
                        stack.push(opNumber1 / opNumber2);
                        break;
                    default:
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}