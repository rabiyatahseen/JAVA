public class studentdriver {
    public static void main(String[] args) {
        // Create a Student object
        student student = new student("Rabiya", "Tahseen", "23pa1a05k7", 8.9);

        // Print initial details
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Regd ID: " + student.getRegdId());
        System.out.println("Score: " + student.getScore());
        System.out.println("Full Name: " + student.getFullName());

        // Modify details using setters
        student.setFirstName("Rabiya");
        student.setLastName("Tahseen");
        student.setRegdId("23pa1a05k7");
        student.setScore(8.93);

    }
}
