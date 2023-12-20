import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeReader {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the size of the collection
        System.out.println("Size of the collection: " + employees.size());

        // Print the contents using a standard loop
        System.out.println("Contents using standard loop:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        // Print the contents using for each loop
        System.out.println("\nContents using for each loop:");
        for (String employee : employees) {
            System.out.println(employee);
        }

        // Print the contents using Iterator
        System.out.println("\nContents using Iterator:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
