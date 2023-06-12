import java.util.*;

public class Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Move to the next line after reading N

        for (int i = 0; i < N; i++) {
            String parentheses = scanner.nextLine();
            if (isBalanced(parentheses)) {
                System.out.println("BALANCED");
            } else {
                System.out.println("NOT BALANCED");
            }
        }
    }

    public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (char c : parentheses.toCharArray()) {
            if (c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == '}') {
                if (stack.isEmpty()) {
                    return false; // Unbalanced, no opening parenthesis to match with
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') || (c == '}' && top != '{')) {
                    return false; // Unbalanced, mismatched parentheses
                }
            }
        }

        return stack.isEmpty(); // Balanced if the stack is empty at the end
    }
}
