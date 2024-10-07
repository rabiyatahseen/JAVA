
class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
   
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
   
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

