class Animal {
    public void move() {
        System.out.println("The animal is moving.");
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("The bird is flying.");
    }
}

class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("The fish is swimming.");
    }
}

public class AnimalMovement {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();

        bird.move();
        fish.move();
    }
}
