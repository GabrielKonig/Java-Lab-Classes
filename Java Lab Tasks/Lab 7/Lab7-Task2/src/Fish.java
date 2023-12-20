public class Fish extends Animal {
    public Fish() {
        super();
    }

    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating plankton...");
    }

    @Override
    public String getVoice() {
        return "No sound (Fish)";
    }
}
