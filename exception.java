public class exception {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc"); // Will throw a NumberFormatException
            System.out.println("The number is: " + num);

            int result = 10 / 0; // Will throw an ArithmeticException
            System.out.println("The result is: " + result);

            String str = null;
            System.out.println(str.length()); // Will throw a NullPointerException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}


