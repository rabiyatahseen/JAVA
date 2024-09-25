class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Dog breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.displayInfo();
    }
}
