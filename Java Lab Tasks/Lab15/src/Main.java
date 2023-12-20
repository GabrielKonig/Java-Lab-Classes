import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = StudentProcessor.createStudentList("studentsEN.txt");

        // Find students with a grade of 5 and print them
        System.out.println("Students with a grade of 5:");
        studentList.stream()
                .filter(student -> student.getScore() == 5)
                .forEach(System.out::println);

        // Calculate the average of all students' grades
        double averageScore = studentList.stream()
                .mapToInt(Student::getScore)
                .average()
                .orElse(0.0);
        System.out.println("\nAverage score of all students: " + averageScore);

        // Calculate how many students have a grade of 5
        long countOfFives = studentList.stream()
                .filter(student -> student.getScore() == 5)
                .count();
        System.out.println("\nNumber of students with a grade of 5: " + countOfFives);
    }
}
