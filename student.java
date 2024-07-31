public class student {
    // Fields
    private String firstName;
    private String lastName;
    private String regdId;
    private double score;

    // Constructor
    public student(String firstName, String lastName, String regdId, double score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.regdId = regdId;
        this.score = score;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRegdId(String regdId) {
        this.regdId = regdId;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRegdId() {
        return regdId;
    }

    public double getScore() {
        return score;
    }

    // Method to get full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Main method
    public static void main(String[] args) {
        // Create a Student object
        student student = new student("Rabiya", "Tahseen", "23pa1a05k7", 8.9);

        // Print initial details
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Regd ID: " + student.getRegdId());
        System.out.println("Score: " + student.getScore());
        System.out.println("Full Name: " + student.getFullName());

      
        System.out.println("Updated Full Name: " + student.getFullName());
    }
}
