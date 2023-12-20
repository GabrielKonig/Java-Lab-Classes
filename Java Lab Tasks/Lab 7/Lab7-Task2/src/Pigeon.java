public class Pigeon extends Bird {
    private String species;

    public Pigeon(String species) {
        super();
        this.species = species;
    }

    public Pigeon(String name, int age, double weight, String species) {
        super(name, age, weight);
        this.species = species;
    }

    public Pigeon(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating seeds...");
    }

    @Override
    public String getVoice() {
        return "Coo!";
    }

    public void fly() {
        System.out.println("Pigeon is flying away!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Species: " + species;
    }
}
