
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class definedexception {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new MyCustomException("You are not eligible to vote.");
            }
            System.out.println("You are eligible to vote.");
        } catch (MyCustomException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
