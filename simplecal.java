import java.util.Scanner;
public class simplecal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Select operation (+, -, *, /): ");
        // returns the first character in that string
        char operation = scanner.next().charAt(0);
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                    result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return; // exit the program
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        scanner.close();
    }
}
