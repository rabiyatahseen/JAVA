class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        Employee employee = new Employee("Jane Smith", 25, 50000.0);

        person.display();
        System.out.println();
        employee.display();
    }
}
