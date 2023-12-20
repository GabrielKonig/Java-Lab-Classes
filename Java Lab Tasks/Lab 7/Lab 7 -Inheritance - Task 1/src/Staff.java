import java.util.Scanner;

class Staff extends Person {
    private String education;
    private String position;

    public void initialize1() {
        super.initialize(); // Calling initialize() from the base class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Education: ");
        education = scanner.nextLine();
        System.out.println("Enter Position: ");
        position = scanner.nextLine();
    }

    public void print1() {
        super.print(); // Calling print() from the base class
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}