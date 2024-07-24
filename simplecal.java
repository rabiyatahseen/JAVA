import java.util.Scanner;
public class simplecal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Select operation (+, -, *, /): ");
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return; // exit the program
                }
                break;
            default:
                System.out.println("Error! Invalid operation.");
                return; // exit the program
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        scanner.close();
    }
}
