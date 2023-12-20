public class Dog extends Mammal {
    public Dog() {
        super();
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones...");
    }

    @Override
    public String getVoice() {
        return "Woof!";
    }

    public void bark() {
        System.out.println("Bark! Bark!");
    }
}
