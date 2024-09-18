
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // Calls the parent class's constructor
    }

    @Override
    void makeSound() {
        System.out.println("Woof!");
        super.makeSound(); // Calls the parent class's method
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Dog fido = new Dog("Fido");
        Cat whiskers = new Cat("Whiskers");

        fido.makeSound();
        whiskers.makeSound();
    }
}
