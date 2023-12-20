import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentProcessor {

    public static List<Student> createStudentList(String fileName) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                String surname = data[1];
                int score = Integer.parseInt(data[2]);

                Student student = new Student(name, surname, score);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}
