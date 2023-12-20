public class Bird extends Animal {
    public Bird() {
        super();
    }

    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Bird is pecking seeds...");
    }

    @Override
    public String getVoice() {
        return "Tweet!";
    }
}
