public class Blowfish extends Fish {
    public Blowfish() {
        super();
    }

    public Blowfish(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Blowfish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Blowfish is eating small fish...");
    }

    @Override
    public String getVoice() {
        return "Puff!";
    }

    public void inflate() {
        System.out.println("Blowfish inflates!");
    }
}
