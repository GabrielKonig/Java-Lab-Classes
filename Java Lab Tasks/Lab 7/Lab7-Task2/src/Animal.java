public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;

    public Animal() {
        this.name = "Unnamed";
        this.age = 0;
        this.weight = 0.0;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0.0;
    }

    public abstract void eat();

    public abstract String getVoice();



    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight;
    }
}
