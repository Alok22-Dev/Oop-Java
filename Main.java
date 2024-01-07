// Parent class (Superclass)
class Animal {
    String species;

    Animal(String species) {
        this.species = species;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    String breed;

    Dog(String species, String breed) {
        super(species); // Call the constructor of the superclass
        this.breed = breed;
    }

    // Overriding the makeSound method in the subclass
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Additional method specific to Dog class
    void fetch() {
        System.out.println("Fetching the ball");
    }
}

// Another child class (Subclass) inheriting from Animal
class Cat extends Animal {
    String furColor;

    Cat(String species, String furColor) {
        super(species);
        this.furColor = furColor;
    }

    // Overriding the makeSound method in the subclass
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }

    // Additional method specific to Cat class
    void scratch() {
        System.out.println("Scratching the furniture");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of the subclasses
        Dog myDog = new Dog("Dog", "Labrador");
        Cat myCat = new Cat("Cat", "White");

        // Accessing properties and methods of the superclass and subclasses
        System.out.println("My dog's breed is " + myDog.breed);
        myDog.makeSound();
        myDog.fetch();

        System.out.println("My cat's fur color is " + myCat.furColor);
        myCat.makeSound();
        myCat.scratch();
    }
}
