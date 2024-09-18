class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(name + " is also managing tasks.");
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    public void writeCode() {
        System.out.println(name + " is writing code.");
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 5000);
        Developer developer = new Developer("Jane Smith", 4000);

        manager.work();
        System.out.println("Manager's salary: " + manager.getSalary());
        developer.work();
        developer.writeCode();
        System.out.println("Developer's salary: " + developer.getSalary());
    }
}
