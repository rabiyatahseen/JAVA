// Parent Class (Super Class)
class Animal {
    String name;

    // Constructor of superclass
    Animal(String name) {
        this.name = name;
    }

    // Method in the superclass
    void displayInfo() {
        System.out.println("Animal name: " + name);
    }
}

// Child Class (Sub Class)
class Dog extends Animal {
    String breed;

    // Constructor of subclass
    Dog(String name, String breed) {
        // Calling the constructor of superclass (Animal)
        super(name);
        this.breed = breed;
    }

    // Overriding displayInfo method in subclass
    @Override
    void displayInfo() {
        // Calling the superclass method using super
        super.displayInfo();
        System.out.println("Dog breed: " + breed);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog("Buddy", "Golden Retriever");

        // Call the displayInfo method
        dog.displayInfo();
    }
}