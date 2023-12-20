public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog(); // Default constructor
        animals[1] = new Dog("Buddy", 3, 15.5); // Constructor with parameters
        animals[2] = new Blowfish(); // Default constructor
        animals[3] = new Blowfish("Blowie", 1, 0.3); // Constructor with parameters
        animals[4] = new Pigeon("Rock Pigeon"); // Constructor with parameter

        // Calling methods on individual objects
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.bark(); // Specific method for Dog
            } else if (animal instanceof Blowfish) {
                Blowfish blowfish = (Blowfish) animal;
                blowfish.inflate(); // Specific method for Blowfish
            } else if (animal instanceof Pigeon) {
                Pigeon pigeon = (Pigeon) animal;
                pigeon.fly(); // Specific method for Pigeon
            }

            System.out.println(animal);
            animal.eat();
            System.out.println("Sound: " + animal.getVoice());
            System.out.println();
        }
    }
}
