
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Puppy extends Dog {
    @Override
    void makeSound() {
        System.out.println("Yap!");
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Puppy puppy = new Puppy();

        animal.makeSound();
        dog.makeSound();
        puppy.makeSound();
    }
}
