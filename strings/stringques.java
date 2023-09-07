package strings;

public class stringques {
    public static void main(String[] args) {
        String str = "1+2+3-1";
        int result = calculate(str);
        System.out.println("Result: " + result);
    }

    public static int calculate(String str) {
        char[] c1 = str.toCharArray();
        int result = 0;
        char operator = '+';
        int operand = 0;

        for (int i = 0; i < c1.length; i++) {
            char currentChar = c1[i];

            if (i % 2 == 0) { 
                int digit = Character.getNumericValue(currentChar);

                operand = operand * 10 + digit;
            } else {
                if (operator == '+') {
                    result = add(result, operand);
                } else if (operator == '-') {
                    result = subtract(result, operand);
                }
                operator = currentChar;
                operand = 0;
            }
        }
        if (operator == '+') {
            result = add(result, operand);
        } else if (operator == '-') {
            result = subtract(result, operand);
        }

        return result;
    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
