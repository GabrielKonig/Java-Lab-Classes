public class Mammal extends Animal {
    public Mammal() {
        super();
    }

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        // Define eating behavior for mammals
        System.out.println("Mammal is eating...");
    }

    @Override
    public String getVoice() {
        // Define sound for mammals
        return "Mammal sound";
    }
}
